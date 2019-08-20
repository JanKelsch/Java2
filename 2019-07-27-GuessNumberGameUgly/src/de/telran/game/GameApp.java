package de.telran.game;

import de.telran.game.io.ConsoleGameInput;
//import de.telran.game.io.ConsoleGameOutput;
import de.telran.game.io.GameInput;
import de.telran.game.io.GameOutput;

public class GameApp {

	public static void main(String[] args) {
		GameInput input = new ConsoleGameInput();
		GameOutput output = s -> System.out.println(s.toUpperCase()); //or System.out::println; //or new ConsoleGameOutput();

		GuessNumberGame game = new GuessNumberGame(input, output, 5, 3);
		game.play();
	}
}