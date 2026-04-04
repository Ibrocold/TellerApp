# TellerApp

TellerApp is a simple Java console project that simulates a café payment terminal. It supports both **cash** and **payment card** transactions, lets users pay for **affordable** and **hearty** meals, and tracks the terminal’s cash balance and meals sold. The repository currently contains three Java classes: `Main`, `PaymentCard`, and `PaymentTerminal`. :contentReference[oaicite:0]{index=0}

## Features

- Handle **cash payments** for:
  - Affordable meals
  - Hearty meals
- Handle **card payments** using a `PaymentCard`
- Add money to a payment card through the terminal
- Track:
  - Total cash in the terminal
  - Number of affordable meals sold
  - Number of hearty meals sold :contentReference[oaicite:1]{index=1}

## Project Structure

```text
TellerApp/
├── Main.java
├── PaymentCard.java
└── PaymentTerminal.java
