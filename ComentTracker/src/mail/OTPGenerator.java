package mail;

public class OTPGenerator {

    public String GenerateOTP() {
        String OTP = "";
        for (int i = 0; i < 6; i++) {
            int Num = 0;
            int num1 = ((int) (Math.random() * 100000)) % 2;
            int num2 = ((int) (Math.random() * 100000)) % 2;
            if (num1 == num2) {
                Num = 65 + (((int) (Math.random() * 100000)) % 26);
            } else {
                Num = 49 + (((int) (Math.random() * 100000)) % 9);
            }
            char charOTP = (char) Num;
            OTP = OTP + charOTP;
        }
        return OTP;
    }

    public static void main(String ma[]) {
        String OTP = new OTPGenerator().GenerateOTP();
        System.out.println(OTP);
    }
}
