# String Processing Project

## Objective

This project aims to implement a `StringProcessor` class that provides various string processing methods, including checks for password strength, counting digits and words, and calculating arithmetic expressions. The project also includes a testing class to validate the functionality of these methods.

## Features

The `StringProcessor` class includes the following methods:

1. **isStrongPassword(String password)**: 
   - Checks if the provided password is strong. A strong password must contain at least one uppercase letter, one lowercase letter, one digit, and one special symbol.
   - Returns `true` if the password is strong; otherwise, returns `false`.

2. **calculateDigits(String sentence)**: 
   - Counts the number of digits in the given sentence.
   - Returns the count of digits.

3. **calculateWords(String sentence)**: 
   - Calculates the number of words in the given sentence, where words are considered separated by spaces.
   - Returns the count of words.

4. **calculateExpression(String expression)**: 
   - Evaluates a valid arithmetic expression represented as a string and returns the result.
   - Assumes a valid and well-formed expression.

## Testing

The project includes a `StringProcessorTest` class that contains multiple test cases for each method to ensure they work as expected. The test cases cover a range of scenarios, including edge cases and common use cases.

## Code Quality

The code follows best practices for readability and maintainability, utilizing Object-Oriented Programming principles. Clear comments and documentation have been provided to explain the logic and purpose of each class and method.

## Exception Handling

Proper exception handling is implemented in the `calculateExpression` method to gracefully handle invalid inputs and errors.
