# Magical Arena

## Overview

The **Magical Arena** is a simulation of a battle between two players. Each player has attributes like `health`, `strength`, and `attack`. The game uses dice rolls to calculate damage and follows specific rules to determine the winner. Players attack in turns, and the game ends when one player’s health reaches zero.

---

## Features

- Players attack and defend using dice rolls.
- Damage dealt depends on dice rolls and player attributes.
- Clear logs of each turn and the final winner are displayed.

---

## Prerequisites

To run this project, ensure the following are installed:

- **Java Development Kit (JDK)** 8 or later.
- A code editor like **Visual Studio Code (VS Code)** or any Java IDE.

---

## How to Run

### Steps

1. Clone or download the project.
2. Create a folder named `src` and add the following files:
   - `Player.java`
   - `Dice.java`
   - `Arena.java`
   - `Main.java`
3. Open the folder in **VS Code** or your Java IDE.

### Running in VS Code

1. Open `Main.java`.
2. Click the **Run** button at the top right of the editor.
3. View the output in the terminal.

### Running in Command Line

1. Navigate to the `src` folder:
   ```bash
   cd MagicalArena/src
   ```

### Expected Output

The fight begins!

Player A attacks with damage 20, Player B defends with 20. Net damage: 0
Player B health: 100

Player B attacks with damage 25, Player A defends with 20. Net damage: 5
Player A health: 45

Player A attacks with damage 20, Player B defends with 30. Net damage: 0
Player B health: 100

Player B attacks with damage 5, Player A defends with 25. Net damage: 0
Player A health: 45

Player A attacks with damage 50, Player B defends with 10. Net damage: 40
Player B health: 60

Player B attacks with damage 10, Player A defends with 15. Net damage: 0
Player A health: 45

Player A attacks with damage 50, Player B defends with 50. Net damage: 0
Player B health: 60

Player B attacks with damage 15, Player A defends with 15. Net damage: 0
Player A health: 45

Player A attacks with damage 30, Player B defends with 50. Net damage: 0
Player B health: 60

Player B attacks with damage 20, Player A defends with 5. Net damage: 15
Player A health: 30

Player A attacks with damage 30, Player B defends with 30. Net damage: 0
Player B health: 60

Player B attacks with damage 10, Player A defends with 25. Net damage: 0
Player A health: 30

Player A attacks with damage 30, Player B defends with 60. Net damage: 0
Player B health: 60

Player B attacks with damage 25, Player A defends with 25. Net damage: 0
Player A health: 30

Player A attacks with damage 30, Player B defends with 20. Net damage: 10
Player B health: 50

Player B attacks with damage 5, Player A defends with 30. Net damage: 0
Player A health: 30

Player A attacks with damage 50, Player B defends with 50. Net damage: 0
Player B health: 50

Player B attacks with damage 25, Player A defends with 5. Net damage: 20
Player A health: 10

Player A attacks with damage 20, Player B defends with 40. Net damage: 0
Player B health: 50

Player B attacks with damage 15, Player A defends with 5. Net damage: 10
Player A health: 0

Winner: Player B
