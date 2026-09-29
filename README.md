# Software Construction & Development (Theory) - Assignment 01[cite: 1]

## Student Information
* **Name:** Muhammad Abdur Rehman Khan[cite: 1].
* **Registration Number:** 24ABSWE0025[cite: 1].
* **Semester:** 5th[cite: 1].
* **Course:** Software Construction & Development (SE-208)[cite: 1].
* **Department:** Dept. Of Software Engineering UETP, Abbottabad Campus[cite: 1].

## Assignment Overview
This repository contains the implementation of Assignment 01 for the Software Construction & Development lab[cite: 1]. The assignment focuses on practically applying core Object-Oriented Programming (OOP) principles across four distinct tasks[cite: 1].

## Tasks Breakdown

### Task 1: The 'Broken Vault' (Encapsulation)[cite: 1]
* **Objective:** Understand data hiding and why public fields are dangerous in software construction[cite: 1].
* **Implementation:** Refactored a poorly designed `DigitalWallet` class to enforce secure balance operations using private fields and validation logic[cite: 1]. 
* **Reflection:** The original unencapsulated code allowed any external component to directly manipulate the wallet's internal state, such as setting a negative balance or changing the pin code[cite: 1]. Refactoring prevents malicious scripts from bypassing authorization layers, which would otherwise allow unauthorized transactions and compromise a bank's financial integrity[cite: 1].

### Task 2: The 'Evolving Workforce' (Inheritance & Polymorphism)[cite: 1]
* **Objective:** Demonstrate code reusability (Inheritance) and dynamic behavior (Polymorphism)[cite: 1].
* **Implementation:** Created a generalized `Employee` superclass alongside `Developer` and `SalesManager` subclasses[cite: 1]. The subclasses inherit shared attributes like names and base salaries directly from the superclass[cite: 1].
* **Reflection:** Each subclass overrides the `calculatePay()` method with its own specific logic[cite: 1]. By iterating over an array of generalized employee objects, the program dynamically executes the correct calculation at runtime, whether it is adding a tech allowance for a developer or calculating a sales commission for a manager, without requiring explicit type checking[cite: 1].

### Task 3: 'Design by Contract' (Abstraction)[cite: 1]
* **Objective:** Understand how Interfaces force classes to guarantee specific behaviors[cite: 1].
* **Implementation:** Created a `SmartDevice` interface acting as a strict structural contract[cite: 1]. This interface was implemented in distinctly different hardware classes: `SmartBulb` and `SmartThermostat`[cite: 1].
* **Reflection:** The interface forces these classes to provide concrete implementations for turning on, turning off, and retrieving statuses[cite: 1]. By abstracting these core commands, a central controller can seamlessly manage disparate devices uniformly, while individual classes still encapsulate unique methods like setting temperature or brightness[cite: 1].

### Task 4: The AI Code Review (Meta-Learning)[cite: 1]
* **Objective:** Learn to critically evaluate and correct AI-generated code using OOP principles[cite: 1].
* **Implementation:** Corrected a flawed library system that contained `Book` and `Member` classes[cite: 1]. The `borrow()` method within the `Book` class was updated to evaluate its own availability, update its state atomically, and return a boolean success flag[cite: 1].
* **Reflection:** Validating AI-generated code is necessary to ensure proper encapsulation and state management[cite: 1]. The initial flawed system allowed external classes to separately verify availability and then trigger a void borrow action, creating a vulnerability[cite: 1]. The corrected implementation relies on a boolean return value, ensuring tight object-oriented boundaries and preventing errors like double-borrowing[cite: 1].
