package de.telran.game.io;

import java.util.Scanner;

public class ConsoleGameInput implements GameInput {
	Scanner scanner = new Scanner(System.in);

	@Override
	public int getNextNumber() {
		return scanner.nextInt();
	}
}
