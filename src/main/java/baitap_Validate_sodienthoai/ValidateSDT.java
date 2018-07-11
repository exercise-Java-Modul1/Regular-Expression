package baitap_Validate_sodienthoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX = "^\\([0-9]{2}\\)\\-\\(*0[0-9]{9}\\)$";

    public ValidateSDT() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
