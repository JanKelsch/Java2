package de.telran.game;

import de.telran.game.io.GameInput;
import de.telran.game.io.GameOutput;

public class GuessNumberGame {
	private GameInput input;
	private GameOutput output;
	private int secret;
	private int attempts;

	public GuessNumberGame(GameInput input, GameOutput output, int secret, int attempts) {
		this.input = input;
		this.output = output;
		this.secret = secret;
		this.attempts = attempts;
	}

	public void play() {
		boolean guess = tryToGuess();
		showGameOver(guess);
	}

	private boolean tryToGuess() {
		output.print("���� ��������! � ��� ���� 3 �������. ������� ����� �� 1 �� 10");
		boolean guessedCorrectly = false;
		while (attempts > 0 && !guessedCorrectly) {
			int num = input.getNextNumber();
			if (num != secret) {
				attempts--;
				output.print("�� �� �������. ������� ��������: " + attempts);
			} else {
				guessedCorrectly = true;
			}
		}
		return guessedCorrectly;
	}

	private void showGameOver(boolean guessedCorrectly) {
		if (guessedCorrectly) {
			output.print("You won");
		} else {
			output.print("You lost");
		}
	}
}
