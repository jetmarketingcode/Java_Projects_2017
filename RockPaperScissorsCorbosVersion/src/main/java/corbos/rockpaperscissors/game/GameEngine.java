/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbos.rockpaperscissors.game;

import static corbos.rockpaperscissors.game.GameEngine.ChoiceEnums.PAPER;
import static corbos.rockpaperscissors.game.GameEngine.ChoiceEnums.ROCK;
import static corbos.rockpaperscissors.game.GameEngine.ChoiceEnums.SCISSORS;
import static corbos.rockpaperscissors.game.GameEngine.Outcome.PLAYER_ONE_WIN;
import static corbos.rockpaperscissors.game.GameEngine.Outcome.PLAYER_TWO_WIN;
import static corbos.rockpaperscissors.game.GameEngine.Outcome.TIE;

/**
 *
 * @author parallels
 */
public class GameEngine {

   

    
    
    private Player playerOne;
    private Player playerTwo;

    public GameEngine(Player one, Player two) {
        playerOne = one;
        playerTwo = two;
    }

    public Outcome playRound() throws Exception {

        ChoiceEnums p1Choice = getPlayerChoice(playerOne);
        ChoiceEnums p2Choice = getPlayerChoice(playerTwo);

        Outcome result = TIE;
        if (p1Choice == ROCK) {
            if (p2Choice == PAPER) {
                result = PLAYER_TWO_WIN;
            } else if (p2Choice == SCISSORS) {
                result = PLAYER_ONE_WIN;
            }
        } else if (p1Choice == PAPER) {
            if (p2Choice == ROCK) {
                result = PLAYER_ONE_WIN;
            } else if (p2Choice == SCISSORS) {
                result = PLAYER_TWO_WIN;
            }
        } else if (p1Choice == SCISSORS) {
            if (p2Choice == ROCK) {
                result = PLAYER_TWO_WIN;
            } else if (p2Choice == PAPER) {
                result = PLAYER_ONE_WIN;
            }
        }
        // Careful, choices not exhaustive...

        return result;
    }

    private ChoiceEnums getPlayerChoice(Player player) throws Exception {
        ChoiceEnums choice = player.getChoice();
        
        
        return choice;
    }
    
    public enum ChoiceEnums {
        
        ROCK, PAPER, SCISSORS
        
        
        
        
    }
    
    public enum Outcome {
        TIE, PLAYER_ONE_WIN, PLAYER_TWO_WIN
    }
}
