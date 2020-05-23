package com.springuse;

import java.util.Scanner;

public class GameDriver {
	public static void main(String[] args) {
		GameService gs = new GameService();
		
		System.out.println("Welcome to this game of Rock, Paper, Scissors.");
		System.out.println("Please enter your choice by typing in either 'rock', 'paper, or 'scissors.'");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		
		gs.playTheGame(ans);
		results(gs);
	}
	
	public static void results (GameService gs) {
		if (gs.score.win) {
			System.out.println("You won!");
		} else if (gs.score.loss) {
			System.out.println("You lost!");
		} else {
			System.out.println("You tied the game.");
		}
	}

}
