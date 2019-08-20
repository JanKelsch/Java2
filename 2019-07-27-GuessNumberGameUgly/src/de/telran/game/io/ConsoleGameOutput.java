package de.telran.game.io;

public class ConsoleGameOutput implements GameOutput {
	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
