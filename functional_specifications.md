# Functional Specifications: Simple Calculator

## 1. Introduction

This document outlines the functional specifications for the Simple Calculator application. It is a Java Swing-based desktop application that currently supports addition of two real numbers, with a user-friendly graphical interface.

## 2. Graphical User Interface (GUI)

The application presents a single main window.

### 2.1. Main Window
-   **Title**: "Calculator"

### 2.2. Input and Display Area
Located at the top of the window, this area consists of:
-   **First Number Input**:
    -   Label: "Numero real 1:"
    -   Input Field: `numField1` (Text field for the first number)
-   **Second Number Input**:
    -   Label: "Numero real 2:"
    -   Input Field: `numField2` (Text field for the second number)
-   **Result Display**:
    -   Label: "Resultado:"
    -   Display Field: `resultField` (Non-editable text field to show results or error messages)

### 2.3. Number Buttons
A grid of buttons for numeric input:
-   Buttons: "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
-   Action: Appends the respective digit to the currently active input field (`numField1` or `numField2`).

### 2.4. Operation Buttons
Buttons for performing calculations and control:
-   **"+" (Add)**: Initiates an addition operation.
-   **"=" (Equals)**: Computes the result of the pending operation.
-   **"C" (Clear)**: Clears all input fields, the result display, and resets the calculator's internal state.

## 3. Core Functionality

### 3.1. Number Input
-   Users can click the number buttons (0-9) to append digits to the input field that should logically receive input (typically `numField1` first, then `numField2` after an operator).
-   Direct typing into the fields is also possible when they are editable.

### 3.2. Addition Operation
-   Triggered by pressing the **"+"** button.
-   Requires a valid number in the "Numero real 1" field.
-   The first number is stored, and the application prepares to receive the second number in the "Numero real 2" field.

### 3.3. Equals Operation ("=")
-   Triggered by pressing the **"="** button.
-   Performs the currently selected operation (e.g., addition) using the value from "Numero real 1" (or the stored first number) and "Numero real 2".
-   The calculated result is displayed in the "Resultado:" field.
-   The content of "Resultado:" is then copied into the "Numero real 1" field.

### 3.4. Clear Operation ("C")
-   Triggered by pressing the **"C"** button.
-   Clears the text content of "Numero real 1", "Numero real 2", and "Resultado:".
-   Resets any stored number or pending operation.
-   Resets UI components to their initial state (see UI Behavior).

## 4. User Interface Behavior & Rules

### 4.1. Initial State
-   "Numero real 1" field is enabled and editable.
-   "Numero real 2" field is disabled and non-editable.
-   Keyboard focus is on the "Numero real 1" field.

### 4.2. '+' Button Interaction
1.  User enters a number into "Numero real 1".
2.  User presses the **"+"** button:
    -   If "Numero real 1" is empty, "Resultado:" displays "Numero real 1 no puede estar vacio". "Numero real 2" remains non-editable.
    -   If "Numero real 1" contains invalid (non-numeric) text, "Resultado:" displays "Error: Numero real 1 invalido". "Numero real 2" remains non-editable.
    -   If "Numero real 1" contains a valid number:
        -   The number is stored as the first operand.
        -   "Numero real 2" becomes enabled and editable.
        -   "Numero real 2" is cleared.
        -   Keyboard focus moves to "Numero real 2".

### 4.3. '=' Button Interaction
1.  User has entered numbers in "Numero real 1", pressed "+", and entered a number in "Numero real 2".
2.  User presses the **"="** button:
    -   The sum is calculated and displayed in "Resultado:".
    -   The text from "Resultado:" is copied to "Numero real 1".
    -   The internal value `firstNumber` is updated with this result.
    -   "Numero real 2" is cleared.
    -   "Numero real 2" becomes non-editable.
    -   The pending operation is cleared.
    -   Keyboard focus moves to "Numero real 1".

### 4.4. 'C' Button Interaction
-   "Numero real 1" becomes enabled and editable.
-   "Numero real 2" becomes disabled and non-editable.
-   Text in `numField1`, `numField2`, `resultField` is cleared.
-   Keyboard focus moves to "Numero real 1".

## 5. Error Handling
Error messages are displayed in the "Resultado:" field.
-   **Empty "Numero real 1" on '+' press**: "Numero real 1 no puede estar vacio"
-   **Invalid number in "Numero real 1" on '+' press**: "Error: Numero real 1 invalido"
-   **Invalid number in "Numero real 2" on '=' press**: "Error: Numero real 2 invalido"
```
