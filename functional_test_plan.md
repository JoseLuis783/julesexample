# Functional Test Plan: Simple Calculator

## 1. Introduction

### 1.1. Purpose
This document defines the functional test plan for the Simple Calculator application. It outlines the test cases designed to verify that the application's features and behaviors conform to the defined functional specifications.

### 1.2. Scope
This test plan covers functional testing of the Simple Calculator application. This includes:
-   Verification of Graphical User Interface (GUI) elements.
-   Testing of core arithmetic functionality (currently addition).
-   Validation of user interface behavior rules, including field editability and focus management.
-   Checking of error handling mechanisms.

This plan does not cover:
-   Non-functional testing such as performance, usability (beyond specified behaviors), security, or compatibility testing across extensive OS/hardware matrixes beyond general Java Swing compatibility.
-   Unit testing or code-level integration testing (which are separate activities).

### 1.3. References
-   `functional_specifications.md`: Contains the detailed functional specifications for the calculator.

## 2. Test Approach
The testing will be performed manually by executing the defined test cases. Each test case involves interacting with the calculator's GUI and observing the application's responses to ensure they match the expected results. Test results (Pass/Fail) and any observations will be recorded for each test case.

## 3. Test Environment

### 3.1. Software
-   **Application Under Test**: Simple Calculator (Java Swing application).
-   **Java Runtime Environment (JRE)**: Version compatible with Java 8 or later (as the project has been configured for Java 1.8 and more recently, target "24", implying a modern JRE is needed to run if compiled with target 24, but the code itself is 1.8 compatible).
-   **Operating System (Recommended)**: Windows 10/11, macOS (latest - 3), Linux (common distributions like Ubuntu). (Standard Java Swing compatibility expected).

### 3.2. Hardware
-   A standard desktop or laptop computer capable of running Java Swing applications with a graphical display, keyboard, and mouse.

## 4. Test Cases

Each test case includes:
-   **Test Case ID**: Unique identifier.
-   **Feature Tested**: Reference to `functional_specifications.md`.
-   **Description**: Purpose of the test.
-   **Preconditions**: Any setup required.
-   **Steps to Execute**: Actions to perform.
-   **Expected Result**: Anticipated outcome.
-   **Actual Result**: (To be filled during testing)
-   **Status**: (To be filled during testing: Not Run, Passed, Failed)

---

### 4.1. GUI Verification Tests

**Test Case ID**: TC_GUI_001
**Feature Tested**: GUI - Main Window Title (Spec 2.1)
**Description**: Verify the main application window title is correct.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Launch the calculator application.
    2. Observe the title bar of the application window.
**Expected Result**: The window title should be "Calculator".
**Actual Result**:
**Status**:

**Test Case ID**: TC_GUI_002
**Feature Tested**: GUI - Input Area Labels (Spec 2.2)
**Description**: Verify the labels for number input fields and result display are correct.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Observe the labels next to the input fields and the result field.
**Expected Result**:
    - Label for first number input: "Numero real 1:"
    - Label for second number input: "Numero real 2:"
    - Label for result display: "Resultado:"
**Actual Result**:
**Status**:

**Test Case ID**: TC_GUI_003
**Feature Tested**: GUI - Result Field Non-Editable (Spec 2.2)
**Description**: Verify the result display field is not directly editable by the user.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Try to click into the "Resultado:" field.
    2. Try to type characters into the "Resultado:" field.
**Expected Result**: The "Resultado:" field should not accept focus for typing, and no characters should appear if typed. It should be non-editable.
**Actual Result**:
**Status**:

**Test Case ID**: TC_GUI_004
**Feature Tested**: GUI - Number Buttons (Spec 2.3)
**Description**: Verify all number buttons (0-9) are present.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Observe the button panel.
**Expected Result**: Buttons labeled "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" should be visible.
**Actual Result**:
**Status**:

**Test Case ID**: TC_GUI_005
**Feature Tested**: GUI - Operation Buttons (Spec 2.4)
**Description**: Verify all operation buttons (+, =, C) are present.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Observe the button panel.
**Expected Result**: Buttons labeled "+", "=", and "C" should be visible.
**Actual Result**:
**Status**:

---

### 4.2. Number Input Tests

**Test Case ID**: TC_NI_001
**Feature Tested**: Number Input (Spec 3.1), Initial State (Spec 4.1)
**Description**: Verify number button clicks append to `numField1` when it's active.
**Preconditions**: Application is launched. `numField1` is active and editable.
**Steps to Execute**:
    1. Click button "1".
    2. Click button "2".
    3. Click button "3".
**Expected Result**: `numField1` should display "123".
**Actual Result**:
**Status**:

**Test Case ID**: TC_NI_002
**Feature Tested**: Number Input (Spec 3.1), '+' Button Interaction (Spec 4.2)
**Description**: Verify number button clicks append to `numField2` after `numField1` and '+' are processed.
**Preconditions**:
    1. Application is launched.
    2. "111" entered into `numField1`.
    3. "+" button pressed. `numField2` is now active and editable.
**Steps to Execute**:
    1. Click button "4".
    2. Click button "5".
    3. Click button "6".
**Expected Result**: `numField2` should display "456". `numField1` should still display "111".
**Actual Result**:
**Status**:

---

### 4.3. Addition Operation Tests

**Test Case ID**: TC_ADD_001
**Feature Tested**: Addition Operation (Spec 3.2), UI Behavior (Spec 4.2, 4.3)
**Description**: Verify basic addition of two positive integers.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Enter "5" into `numField1` (e.g., click button "5").
    2. Click "+" button.
    3. Enter "3" into `numField2` (e.g., click button "3").
    4. Click "=" button.
**Expected Result**:
    - `resultField` should display "8.0" (or "8").
    - `numField1` should display "8.0" (or "8").
    - `numField2` should be empty and non-editable.
    - Focus should be on `numField1`.
**Actual Result**:
**Status**:

**Test Case ID**: TC_ADD_002
**Feature Tested**: Addition Operation (Spec 3.2), UI Behavior (Spec 4.2, 4.3)
**Description**: Verify addition with a negative number.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Enter "10" into `numField1`.
    2. Click "+" button.
    3. Enter "-3" into `numField2` (requires direct typing for '-').
    4. Click "=" button.
**Expected Result**:
    - `resultField` should display "7.0" (or "7").
    - `numField1` should display "7.0" (or "7").
    - `numField2` should be empty and non-editable.
**Actual Result**:
**Status**:

**Test Case ID**: TC_ADD_003
**Feature Tested**: Addition Operation (Spec 3.2), UI Behavior (Spec 4.2, 4.3)
**Description**: Verify addition with decimal numbers.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Enter "2.5" into `numField1` (requires direct typing for '.').
    2. Click "+" button.
    3. Enter "3.7" into `numField2`.
    4. Click "=" button.
**Expected Result**:
    - `resultField` should display "6.2".
    - `numField1` should display "6.2".
    - `numField2` should be empty and non-editable.
**Actual Result**:
**Status**:

---

### 4.4. Equals Button Tests
(Specific result propagation and state change tests are covered by TC_ADD_001, TC_ADD_002, TC_ADD_003, and TC_UI_004. No separate tests solely for "Equals" beyond these interactions.)

---

### 4.5. Clear Button Tests

**Test Case ID**: TC_CLR_001
**Feature Tested**: Clear Operation (Spec 3.4), UI Behavior (Spec 4.4)
**Description**: Verify 'C' button clears all fields and resets state after numbers are entered.
**Preconditions**:
    1. Application is launched.
    2. "123" entered into `numField1`.
    3. "+" button pressed.
    4. "456" entered into `numField2`.
**Steps to Execute**:
    1. Click "C" button.
**Expected Result**:
    - `numField1` should be empty and editable.
    - `numField2` should be empty and non-editable.
    - `resultField` should be empty.
    - Focus should be on `numField1`.
    - Internal operation state should be reset (verified by trying a new operation).
**Actual Result**:
**Status**:

**Test Case ID**: TC_CLR_002
**Feature Tested**: Clear Operation (Spec 3.4), UI Behavior (Spec 4.4)
**Description**: Verify 'C' button clears fields and resets state after a calculation.
**Preconditions**:
    1. Application is launched.
    2. "7" entered into `numField1`.
    3. "+" button pressed.
    4. "2" entered into `numField2`.
    5. "=" button pressed. (`resultField` shows "9.0", `numField1` shows "9.0").
**Steps to Execute**:
    1. Click "C" button.
**Expected Result**:
    - `numField1` should be empty and editable.
    - `numField2` should be empty and non-editable.
    - `resultField` should be empty.
    - Focus should be on `numField1`.
**Actual Result**:
**Status**:

---

### 4.6. UI Behavior & Rules Tests

**Test Case ID**: TC_UI_001
**Feature Tested**: Initial State (Spec 4.1)
**Description**: Verify initial state of input fields and focus.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Observe `numField1`.
    2. Observe `numField2`.
    3. Observe which field has focus (e.g., by typing without clicking).
**Expected Result**:
    - `numField1` is editable.
    - `numField2` is non-editable.
    - Keyboard focus is on `numField1`.
**Actual Result**:
**Status**:

**Test Case ID**: TC_UI_002
**Feature Tested**: '+' Button Interaction - Valid `numField1` (Spec 4.2)
**Description**: Verify `numField2` becomes editable after valid `numField1` and '+'.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Enter "10" in `numField1`.
    2. Click "+" button.
    3. Observe `numField2`.
    4. Check if `numField2` has focus.
**Expected Result**:
    - `numField2` is now editable.
    - `numField2` is empty.
    - Focus is on `numField2`.
**Actual Result**:
**Status**:

**Test Case ID**: TC_UI_003
**Feature Tested**: '+' Button Interaction - Chained Operation Start (Spec 4.3 implies this)
**Description**: Verify pressing '+' after an '=' operation correctly uses `numField1`'s value (the previous result).
**Preconditions**:
    1. Application is launched.
    2. "5" in `numField1`, "+", "3" in `numField2`, "=" pressed. (`numField1` now shows "8.0").
**Steps to Execute**:
    1. Click "+" button.
**Expected Result**:
    - The value "8.0" from `numField1` should be taken as the first operand for a new sum.
    - `numField2` should become editable and cleared.
    - Focus should be on `numField2`.
    - `resultField` should remain unchanged (showing "8.0" or cleared depending on exact '+' implementation detail for result field).
**Actual Result**:
**Status**:

**Test Case ID**: TC_UI_004
**Feature Tested**: '=' Button Interaction - State after calculation (Spec 4.3)
**Description**: Verify field states and focus after '=' is pressed.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Enter "12" in `numField1`.
    2. Click "+".
    3. Enter "3" in `numField2`.
    4. Click "=".
**Expected Result**:
    - `resultField` displays "15.0".
    - `numField1` displays "15.0".
    - `numField2` is empty and non-editable.
    - Focus is on `numField1`.
**Actual Result**:
**Status**:

---

### 4.7. Error Handling Tests

**Test Case ID**: TC_ERR_001
**Feature Tested**: Error Handling - Empty `numField1` on '+' (Spec 4.2, Spec 5)
**Description**: Verify error message and state if '+' is pressed with `numField1` empty.
**Preconditions**: Application is launched. `numField1` is empty.
**Steps to Execute**:
    1. Click "+" button.
**Expected Result**:
    - `resultField` should display "Numero real 1 no puede estar vacio".
    - `numField2` should remain non-editable.
**Actual Result**:
**Status**:

**Test Case ID**: TC_ERR_002
**Feature Tested**: Error Handling - Invalid `numField1` on '+' (Spec 4.2, Spec 5)
**Description**: Verify error message and state if '+' is pressed with invalid text in `numField1`.
**Preconditions**: Application is launched.
**Steps to Execute**:
    1. Type "abc" into `numField1`.
    2. Click "+" button.
**Expected Result**:
    - `resultField` should display "Error: Numero real 1 invalido".
    - `numField2` should remain non-editable.
**Actual Result**:
**Status**:

**Test Case ID**: TC_ERR_003
**Feature Tested**: Error Handling - Invalid `numField2` on '=' (Spec 5)
**Description**: Verify error message if '=' is pressed with invalid text in `numField2`.
**Preconditions**:
    1. Application is launched.
    2. "10" entered into `numField1`.
    3. Click "+" button.
    4. Type "xyz" into `numField2`.
**Steps to Execute**:
    1. Click "=" button.
**Expected Result**:
    - `resultField` should display "Error: Numero real 2 invalido" (or similar, e.g. "Error in Number 2").
    - `numField2` should become non-editable.
**Actual Result**:
**Status**:

## 5. Test Execution & Reporting
Test results will be recorded by filling in the "Actual Result" and "Status" fields for each test case directly in a copy of this document or a compatible test management tool. Any deviations from expected results should be documented in detail.
```
