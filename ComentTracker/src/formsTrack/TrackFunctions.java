package formsTrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import BayesClassifier.BayesAlgorithm;
import javax.swing.table.DefaultTableModel;

public class TrackFunctions {
    
    public void getTableDetailsPost(String PageName,JTable jTable1){
        try{
            int SrNo = 0;
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttrackerposts","root","");
            Statement stmtBook=con.createStatement();
            ResultSet rs=stmtBook.executeQuery("SELECT `PostID`, `Message`, `CreatedTime` FROM `"+PageName+"`");
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for(int i=model.getRowCount()-1;i>=0;i--){   model.removeRow(i); }
            while(rs.next())
            {   
                SrNo++;
                String ID = rs.getString(1);
                String Msg = rs.getString(2);
                String Time = rs.getString(3);
                Object[] row = {SrNo,ID,Msg,Time};
                model.addRow(row);
            }
            rs.close();
        }catch(Exception e){    JOptionPane.showMessageDialog(null,e.getMessage());     }
    }
    
    public void getTableDetailsComments(JTable jTable1,JTable jTable2){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int index = jTable1.getSelectedRow();
        String PostID = model.getValueAt(index, 1).toString();
        try{
            int SrNo = 0;
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment","root","");
            Statement stmtBook=con.createStatement();
            ResultSet rs=stmtBook.executeQuery("SELECT `CommentID`, `Message`, `CreatedTime`, `Probability`, `ProbabilityValue` FROM `"+PostID+"`");

            DefaultTableModel modelComment = (DefaultTableModel) jTable2.getModel();
            for(int i=modelComment.getRowCount()-1;i>=0;i--){   modelComment.removeRow(i); }
            while(rs.next())
            {   
                SrNo++;
                String ID = rs.getString(1);
                String Msg = rs.getString(2);
                String status = rs.getString(4);
                String Value = rs.getString(5);
                Object[] row = {SrNo,ID,Msg,status,Value};
                modelComment.addRow(row);
            }
            rs.close();
        }catch(Exception e){ System.out.println(e); }
    }
    
    public void getSet(JComboBox jComboBox1){
        try {  
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttracker","root","");
            Statement stmtBook=con.createStatement();
            ResultSet rs=stmtBook.executeQuery("SELECT * FROM `pages` ORDER BY `pages`.`PageName` ASC");

            while(rs.next()){
                String ITEM = rs.getString(1)+"("+rs.getString(2)+")";
                jComboBox1.addItem(ITEM);
            }
            rs.close();
        } catch (Exception ex) {}
    }
    
    public void insertPost(String PageID,String Id,String Message,String Date){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerPosts","root","");
            Statement stmt=con.createStatement();
            String query = "INSERT INTO `"+PageID+"`(`PostID`, `Message`, `CreatedTime`) VALUES ('"+Id+"','"+refineMessage(Message)+"','"+Date+"')";
            try{
                stmt.executeUpdate("CREATE TABLE "+PageID+"(`PostID` varchar(500),`Message` varchar(1000),`CreatedTime` varchar(50),PRIMARY KEY(`PostID`))");
            }catch(Exception e){}
            stmt.executeUpdate(query);
            System.out.println(Id+"->"+"Inserted");
         }catch(Exception e){   System.out.println(Id+"->"+e); }
    }
    
    public void insertComment(String PostID,String Id,String Message,String Date){
        String[] words = BayesAlgorithm.getAllWords(Message);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment","root","");
            Statement stmt=con.createStatement(); 
            boolean status = true;
            try{
                String query = "INSERT INTO `"+PostID+"`(`CommentID`, `Message`, `CreatedTime`,`Probability`,`ProbabilityValue`) VALUES ('"+Id+"','"+refineMessage(Message)+"','"+Date+"','"+status+"','00.00')";
                stmt.executeUpdate(query);
            System.out.println(" i ");  
            }catch(Exception e){System.out.println(e);}   
            try{
                stmt.executeUpdate("CREATE TABLE `"+PostID+"`(`CommentID` varchar(500),`Message` varchar(1000),`CreatedTime` varchar(50),`Probability` varchar(10),`ProbabilityValue` varchar(10),PRIMARY KEY(`CommentID`))");
            }catch(Exception e){}
        }catch(Exception e){ /* System.out.println(Id+"->"+Message+"->"+e); */ }
        
    }
    
    public String refineMessage(String Message){
        char fMessage[] = Message.toCharArray();
        String msg="";
        for(int i = 0; i < Message.length(); i++)
        {
            if(fMessage[i] == '\'' || fMessage[i] == '`')
                fMessage[i]='_';
            msg = msg + fMessage[i];
        }
        return msg;
    }
    
    public void getNewWordIN(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment","root","");
            Statement stmt=con.createStatement();            
            ResultSet rs = stmt.executeQuery("SELECT * FROM `unmatched` ORDER BY `Words` ASC");     
            while(rs.next()){
                String word = rs.getString(0);
            }
         }catch(Exception e){  System.out.println(e.getMessage());  }
    }

    public ResultSet getCommentDetails(String PostID){
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttrackercomment","root","");
            Statement stmt=con.createStatement(); 
            rs=stmt.executeQuery("SELECT `CommentID`, `Message`, `CreatedTime`, `Probability`, `ProbabilityValue`  FROM `"+PostID+"`");
        } catch (Exception e) {}
        return rs;
    }
    
    public int MatchedWordsCount(String Message,String DbWords[][]){
        return BayesAlgorithm.getAllMatchedWords(Message,DbWords).length;
    }
}