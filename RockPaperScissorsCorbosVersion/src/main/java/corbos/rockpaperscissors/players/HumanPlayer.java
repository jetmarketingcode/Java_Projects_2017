/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbos.rockpaperscissors.players;

import corbos.rockpaperscissors.game.GameEngine;
import corbos.rockpaperscissors.game.Player;
import java.util.Scanner;

/**
 *
 * @author parallels
 */
public class HumanPlayer implements Player {

    private final String name;
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GameEngine.ChoiceEnums getChoice() {
        String choice = null;
        GameEngine.ChoiceEnums result = GameEngine.ChoiceEnums.ROCK;
        boolean valid = false;
        do {

            System.out.printf("%s: Enter Your Choice [ROCK,PAPER,SCISSORS]\n", name);
            System.out.println("ROCK");
            System.out.println("PAPER");
            System.out.println("SCISSORS");

            choice = scanner.nextLine();

            if (choice == "ROCK") {
                result = GameEngine.ChoiceEnums.ROCK;
                valid = true;
            } else if (choice == "PAPER") {
                result = GameEngine.ChoiceEnums.PAPER;
                valid = true;
            } else {
                result = GameEngine.ChoiceEnums.SCISSORS;
                valid = true;
            }

        } while (!valid);
        return result;
    }

}
