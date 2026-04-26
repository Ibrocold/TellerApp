-----

# TellerApp

**TellerApp** is a Java-based console application designed to simulate the backend logic of a café payment terminal. It provides a robust system for managing transactions, tracking inventory (meals), and handling digital payment balances.

-----

## ✨ Features

  * **Dual Payment Support**: Process transactions via physical **Cash** or digital **PaymentCard**.
  * **Product Categories**:
      * **Affordable Meals**: Lower-cost options for quick transactions.
      * **Hearty Meals**: Premium-priced options.
  * **Terminal Management**:
      * Real-time tracking of total cash held in the terminal.
      * Cumulative counters for meals sold by type.
      * **Card Top-ups**: Allows users to increase their `PaymentCard` balance directly through the terminal.

-----

## 🛠 Project Structure

The core logic is partitioned into three primary Java classes:

  * **[Main.java](https://github.com/Ibrocold/TellerApp/blob/main/src/Main.java)**: The entry point that orchestrates the simulation and user interactions.
  * **[PaymentCard.java](https://github.com/Ibrocold/TellerApp/blob/main/src/PaymentCard.java)**: An object-oriented representation of a user's digital wallet and balance.
  * **[PaymentTerminal.java](https://github.com/Ibrocold/TellerApp/blob/main/src/PaymentTerminal.java)**: The central "brain" of the app, containing the logic for processing payments and updating inventory.

-----

## ⚙️ Getting Started

### Prerequisites

  * **Java Development Kit (JDK)** (Version 8 or higher recommended)
  * **Maven** (for dependency and build management)

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/Ibrocold/TellerApp.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd TellerApp
    ```
3.  Build the project using Maven:
    ```bash
    mvn clean install
    ```

-----

### Contribution

This project is maintained by [Ibrocold (Ibrahim Bello)](https://github.com/Ibrocold). Feel free to explore the [Issues](https://github.com/Ibrocold/TellerApp/issues) or [Actions](https://github.com/Ibrocold/TellerApp/actions) tabs for current build statuses and development progress.
