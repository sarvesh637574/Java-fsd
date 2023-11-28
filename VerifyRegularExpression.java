package practiceprojects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "[a-zA-Z]+\\d+"; // Replace this with your desired regular expression
        String testString = "abc123";   // Replace this with the string you want to test

        boolean isMatch = verifyRegex(regex, testString);

        if (isMatch) {
            System.out.println("The string matches the regular expression.");
        } else {
            System.out.println("The string does not match the regular expression.");
        }
    }

    private static boolean verifyRegex(String regex, String testString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);

        return matcher.matches();

	}

}
