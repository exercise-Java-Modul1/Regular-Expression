package baitap_Validate_sodienthoai;

public class ValidateSdtTest {
    private static String[] sdtTrue = new String[] {"(84)-(0978489648)", "(08)-(0987654321)", "(84)-(0978489648)"};
    private static String[] sdtFaile = new String[] {"a822222222", "12345678921", "(a8)-(22222222)", "(08)-0987654321"};

    public static void main(String[] args) {
        ValidateSDT validateSDT = new ValidateSDT();
        for (String s : sdtTrue) {
            boolean isvalid = validateSDT.validate(s);
            System.out.println("Thuê bao có số " + s + " is isvalid " + isvalid);
        }
        for (String s : sdtFaile) {
            boolean isvalid = validateSDT.validate(s);
            System.out.println("Thuê bao có số " + s + " is isvalid " + isvalid);
        }
    }
}
