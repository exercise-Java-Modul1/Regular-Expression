package thuchanh_validate_account;

public class AccountExampleTest {
    public static AccountExample accountExample;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String acount : validAccount) {
            boolean isvalid = accountExample.validate(acount);
            System.out.println("Account is " + acount +" is valid: "+ isvalid);
        }

        for (String acount : invalidAccount) {
            boolean isvalid = accountExample.validate(acount);
            System.out.println("Account is " + acount +" is valid: "+ isvalid);
        }
    }
}
