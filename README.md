# JavaNumberQuestRM

Application distribuée en Java avec RMI : Jeu multijoueur de devinette

## Table of Contents
- [Description](#description)
- [Features](#Features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)

## Description :
- Ce projet implémente une application distribuée en Java utilisant RMI (Remote Method Invocation). L'application propose un jeu multijoueur où un serveur central coordonne les interactions avec les joueurs. Chaque joueur doit deviner un nombre aléatoire généré par le serveur.
## Features
- The server generates a random number and waits for players' guesses.
- Players can connect to the server and submit their guesses.
- The server responds to each guess, indicating whether it is too low, too high, or correct.
- If a player guesses the correct number, they are declared the winner, and the game ends.
- The player can exit the game at any time by typing "exit."
  
## Getting Started
### Prerequisites
- To use this program, you need a Java Development Kit (JDK) installed on your system. Ensure that you have a compatible version of Java (e.g., JDK 8 or later).

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/s-marsi/JavaNumberQuestRMI.git
    cd JavaNumberQuestRM
    ```
### Usage :
   1. Open two or more terminal windows:
   
   - In the first terminal, run:
     ```
     java src/Server.java
     ```

   - In the other terminal, run:
     ```
     java src/Client.java
     ```
     
After starting both the server and the client, you can play the game by entering a number into the client terminal. The client will send the number to the server, which will process the input and provide a response, indicating whether the guess is too high, too low, or correct. If the player guesses the correct number, the server will declare them the winner.
    
