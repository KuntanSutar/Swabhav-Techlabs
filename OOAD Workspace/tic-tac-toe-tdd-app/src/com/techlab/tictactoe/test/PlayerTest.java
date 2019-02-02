package com.techlab.tictactoe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.tictactoe.Player;

class PlayerTest {

	Player player = new Player();

	@Test
	public void testPlayer() {
		player.setPlayerName("Marine");
		assertEquals("Marine", player.getPlayerName());
	}

}
