# 🧮 String Calculator

A Java-based String Calculator project that parses mathematical expressions entered as a single string and performs the requested arithmetic operation.

## 📌 Project Overview

The system accepts a mathematical expression such as `18+9`, identifies the operator and operands, performs the calculation, and displays the result.

It allows the system to:

- Read a mathematical expression as a String.
- Detect the arithmetic operator.
- Extract the two operands.
- Convert the operands from String to numeric values.
- Perform the requested arithmetic operation.
- Display the calculated result.

## 🏗️ Project Structure

The project is a Java Maven project:

```text
StringCalculator/
├── src/
│   └── main/
│       └── java/
│           └── ...
├── pom.xml
├── README.md
└── .gitignore
```

## ➕ Supported Operations

| Operator | Description |
|----------|-------------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |

## 💡 Example

**Input:**

```text
Enter equation: 18+9
```

**Output:**

```text
Result = 27
```

## 🚀 Bonus Challenges

The assignment also includes optional challenges:

- Allow spaces in the input.
- Support decimal numbers.
- Handle division by zero.
- Validate invalid expressions.

## 🔥 Advanced Challenge

Enhance the calculator to evaluate expressions containing multiple arithmetic operations while respecting the standard order of operations.

**Example:**

```text
Enter equation: 17+9/3
```

**Output:**

```text
Result = 20
```

## 🛠️ Technologies Used

- ☕ Java
- 📦 Maven
- 💻 IntelliJ IDEA
- 🔧 Git
- 🐙 GitHub

## 🧠 Java Concepts Used

- Strings
- Variables
- Conditional Statements
- Arithmetic Operators
- Type Conversion
- Methods
- Object-Oriented Programming concepts where applicable

## ▶️ How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Maven is configured correctly.
4. Open the main Java class.
5. Run the `main()` method.
6. Enter a mathematical expression when prompted.
7. The calculated result will be displayed in the console.

## 🎯 Assignment

This project was developed as part of the:

**DEPI – Software Testing Track**

**Part 01: Java Fundamentals**

**Assignment: String-Based Calculator Using Java and Maven**

## 👨‍💻 Author

Ahmed Gaber