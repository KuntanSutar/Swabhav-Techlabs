package com.techlabs.player.test;

import com.techlab.player.*;

public class TestPlayer {

	public static void main(String[] args) {
		
		Player p1 = new Player("Sachin", 45, GenderOptions.MALE);
		Player p2 = new Player("Virat");

		printDetails(p1);
		printDetails(p2);
		Player elderPlayer = p2.whoIsElder(p1);
		printDetails(elderPlayer);
		
	}

	public static void printDetails(Player newPlayer) {
		
		System.out.println("Name : " + newPlayer.getName() + 
						 "\t Age : " + newPlayer.getAge() + 
					  "\t Gender : " + newPlayer.getGenderOption());
		
	}
}
