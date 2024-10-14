
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    /**
     * Checks if the provided password is strong.
     * A strong password must contain at least one uppercase letter,
     * one lowercase letter, one digit, and one special symbol.
     *
     * @param password the password to check
     * @return true if the password is strong; otherwise, false
     */
    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false; // A strong password must be at least 8 characters long
        }
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialSymbol = password.matches(".*[^a-zA-Z0-9].*");

        return hasUppercase && hasLowercase && hasDigit && hasSpecialSymbol;
    }

    /**
     * Counts the number of digits in the given sentence.
     *
     * @param sentence the sentence to analyze
     * @return the count of digits
     */
    public int calculateDigits(String sentence) {
        if (sentence == null) {
            return 0; // Return 0 if the sentence is null
        }
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the number of words in the given sentence.
     * Words are considered separated by spaces.
     *
     * @param sentence the sentence to analyze
     * @return the count of words
     */
    public int calculateWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the sentence is null or empty
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    /**
     * Calculates the result of a mathematical expression.
     * Assumes that the expression is valid and well-formed.
     *
     * @param expression the expression to evaluate
     * @return the result of the expression
     * @throws IllegalArgumentException if the expression is invalid
     */
    public double calculateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be null or empty");
        }
        return eval(expression);
    }

    // Helper method to evaluate a mathematical expression
    private double eval(String expression) {
        // Using a built-in JavaScript engine to evaluate the expression
        try {
            return (double) new javax.script.ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }
}
