package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotionable;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class TestManBoy {

	public static void main(String[] args) {
		Man man1 = new Man();
		Boy boy1 = new Boy();
		atTheParty(man1);
		atTheParty(boy1);
		atTheMovie(boy1);
		//atTheMovie(man1); -> Gives Error
	}

	private static void atTheParty(IMannerable newIMannerable) {
		System.out.println("At the party");
		newIMannerable.wish();
		newIMannerable.depart();
	}

	private static void atTheMovie(IEmotionable newIMannerable) {
		System.out.println("At the party");
		newIMannerable.cry();
		newIMannerable.laugh();
	}
}
