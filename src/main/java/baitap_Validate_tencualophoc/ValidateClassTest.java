package baitap_Validate_tencualophoc;

public class ValidateClassTest {
    private static String[] validateClass = new String[] {"C0318G", "A1234I", "B0001L"};
    private static String[] inValidateClass = new String[] {"M0318G", "P0323A", "A123I", "A1234C"};

    public static void main(String[] args) {
        ValidateClass valiclass = new ValidateClass();
        for (String s : validateClass) {
            boolean isvalid = valiclass.validate(s);
            System.out.println("Class have name " + s +" is valid: "+ isvalid);
        }
        for (String s : inValidateClass) {
            boolean isvalid = valiclass.validate(s);
            System.out.println("Class have name " + s +" is valid: "+ isvalid);
        }
    }
}
