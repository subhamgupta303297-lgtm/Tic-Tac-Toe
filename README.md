# Console-Based Tic-Tac-Toe in Java

A lightweight, robust, 2-player interactive Tic-Tac-Toe game built entirely using Core Java and standard 2D array manipulations.

## 📌 Project Overview
This project simulates the classic 3x3 Tic-Tac-Toe game right within the command-line interface. It implements matrix-based state tracking, real-time input validation, and optimized turn-by-turn game-state evaluation without external dependencies.

## ⚙️ Key Features
- **Grid Modeling**: Modeled using a 3x3 `char` matrix (`char[][] board`) representing the board state.
- **Constant-Time Win Evaluation**: Checks all winning paths—3 horizontal rows, 3 vertical columns, and 2 diagonals—in minimal operations immediately following every move.
- **Dynamic Board State & Turn Management**: Automatic alternation between Player `X` and Player `O` using ternary operators.
- **Comprehensive Boundary Guarding**: Validates indices to ensure moves fall strictly within the `[0, 2]` bounds and checks against overlapping existing moves.
- **Deterministic Draw Engine**: Scans board density across all iterations to identify tie games cleanly.

## 🛠️ Tech Stack
- **Language**: Java (JDK 17+)
- **Paradigm**: Procedural & Modular Programming
- **Interface**: Console / Command Line

## 🚀 How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/](https://github.com/)<subhamgupta303297>/TicTacToe-Java.git
   cd TicTacToe-Java
