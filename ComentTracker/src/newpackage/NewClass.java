package newpackage;

import formsTrack.TrackFunctions;

public class NewClass {
    public NewClass(){
        TrackFunctions TNF = new TrackFunctions();
        String RSG="I do not own anything. All credits go to the right owners. No copyright intended.";
        String[][] dbwords= BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker","root","","vocabulary");
        int MWordsCount = TNF.MatchedWordsCount(RSG, dbwords);
        int TWordsCount = BayesClassifier.simplifyStatement.countWords(RSG);
        System.out.println("MWordsCount : "+MWordsCount+". TWordsCount : "+TWordsCount);
    }    
}
