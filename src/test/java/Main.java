public class Main {

    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();

        // Test cases for isStrongPassword
        System.out.println("Testing isStrongPassword:");
        System.out.println("Test 1: " + processor.isStrongPassword("Password1!")); // true
        System.out.println("Test 2: " + processor.isStrongPassword("Weakpass")); // false
        System.out.println("Test 3: " + processor.isStrongPassword("12345")); // false
        System.out.println("Test 4: " + processor.isStrongPassword("StrongPass!123")); // true
        System.out.println("Test 5: " + processor.isStrongPassword("!@#$$%^&*")); // false

        // Test cases for calculateDigits
        System.out.println("\nTesting calculateDigits:");
        System.out.println("Test 1: " + processor.calculateDigits("There are 3 apples")); // 1
        System.out.println("Test 2: " + processor.calculateDigits("12345 is a number")); // 5
        System.out.println("Test 3: " + processor.calculateDigits("No digits here!")); // 0
        System.out.println("Test 4: " + processor.calculateDigits("2 dogs and 2 cats")); // 2
        System.out.println("Test 5: " + processor.calculateDigits("!@#456$%^")); // 3

        // Test cases for calculateWords
        System.out.println("\nTesting calculateWords:");
        System.out.println("Test 1: " + processor.calculateWords("Hello World")); // 2
        System.out.println("Test 2: " + processor.calculateWords("   Leading spaces")); // 2
        System.out.println("Test 3: " + processor.calculateWords("Trailing spaces   ")); // 2
        System.out.println("Test 4: " + processor.calculateWords("")); // 0
        System.out.println("Test 5: " + processor.calculateWords("One, two, three.")); // 3

        // Test cases for calculateExpression
        System.out.println("\nTesting calculateExpression:");
        try {
            System.out.println("Test 1: " + processor.calculateExpression("3 + 4 * 2")); // 11.0
            System.out.println("Test 2: " + processor.calculateExpression("(1 + 2) * 3")); // 9.0
            System.out.println("Test 3: " + processor.calculateExpression("10 / 2 + 5")); // 10.0
            System.out.println("Test 4: " + processor.calculateExpression("5 + (6 - 2) * 3")); // 19.0
            System.out.println("Test 5: " + processor.calculateExpression("100 - 50 / 2")); // 75.0
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}