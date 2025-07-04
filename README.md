🧮 String Calculator - TDD Kata
This project is an implementation of the String Calculator kata using Test-Driven Development (TDD) principles with Java and JUnit 5.

It builds a progressively robust calculator that parses strings and returns the sum of embedded numbers — all while respecting custom delimiters and rejecting invalid input.

✅ Features Implemented
Step	Description
1	Returns 0 for empty input
2	Returns the number itself for single value input
3	Returns the sum of two comma-separated numbers
4	Supports an unknown number of comma-separated numbers
5	Handles newlines (\n) as valid delimiters
6	Accepts custom single-character delimiters via the "//[delimiter]\\n" format
7	Throws an exception if any negative numbers are passed in
➤ Exception message lists all negative values

🧰 Tech Stack
Language: Java
Testing: JUnit 5
Style: Test-Driven Development (TDD)
