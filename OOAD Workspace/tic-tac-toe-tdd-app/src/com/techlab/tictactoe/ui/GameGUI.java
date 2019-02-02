package com.techlab.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.techlab.tictactoe.Game;
import com.techlab.tictactoe.GameState;
import com.techlab.tictactoe.Mark;
import com.techlab.tictactoe.Player;
import com.techlab.tictactoe.presentation.Display;

public class GameGUI implements ActionListener {

	private PlayBoard playBoard;
	
	public GameGUI(PlayBoard newPlayBoard) {
		playBoard=newPlayBoard;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Display display = new Display();

		Player player1 = new Player();
		Player player2 = new Player();

		player1.setPlayerName("Kuntan");
		player2.setPlayerName("Sutar");

		Game game = new Game(player1, player2);

		JFrame jFrame = new JFrame();
		JButton button[] = new JButton[9];

		JTextField text = new JTextField();
		text.setBounds(0, 600, 600, 20);
		jFrame.add(text);

		int s = Integer.parseInt(e.getActionCommand());

		String playerName = game.getCurrentPlayer().getPlayerName();
		game.getCurrentPlayer();
		String state = game.play(s) + "";
		text.setText(game.getCurrentPlayer().getPlayerName() + " Turn");

		System.out.println(display.printGrid(game.board));

		Mark mark = game.board.getCellMark(s);
		String m = mark.toString();
		System.out.println(m + " " + s + " " + mark);

		String iconCross = this.getClass().getClassLoader().getResource("cross.png").getFile();
		String iconNought = this.getClass().getClassLoader().getResource("nought.png").getFile();

		ImageIcon cross = new ImageIcon(iconCross);
		ImageIcon nought = new ImageIcon(iconNought);

		if (mark.equals(Mark.CROSS)) {
			button[s].setIcon(cross);
		} else if (mark.equals(Mark.NOUGHT)) {
			button[s].setIcon(nought);
		}

		if (state.equals(GameState.WON.toString()) || state.equals(GameState.DRAW.toString())) {
			Object[] option = { "New Game", "Close" };
			if (state.equals("Draw")) {
				playerName = "";
			}

			int result = JOptionPane.showOptionDialog(null, state + " " + playerName, state,
					JOptionPane.YES_NO_OPTION, JFrame.EXIT_ON_CLOSE, null, option, null);

			if (result == JOptionPane.YES_OPTION) {
				jFrame.setVisible(false);
				jFrame.dispose();
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}
		
		for (int index = 0; index < button.length; index++) {
			button[index] = new JButton();
			button[index].setText(index + "");
			jFrame.add(button[index]);
		}
		
		text.setText(game.getCurrentPlayer().getPlayerName() + " Turn");

		button[0].setBounds(0, 0, 200, 200);
		button[1].setBounds(200, 0, 200, 200);
		button[2].setBounds(400, 0, 200, 200);
		button[3].setBounds(0, 200, 200, 200);
		button[4].setBounds(200, 200, 200, 200);
		button[5].setBounds(400, 200, 200, 200);
		button[6].setBounds(0, 400, 200, 200);
		button[7].setBounds(200, 400, 200, 200);
		button[8].setBounds(400, 400, 200, 200);

		button[0].addActionListener(this);
		button[1].addActionListener(this);
		button[2].addActionListener(this);
		button[3].addActionListener(this);
		button[4].addActionListener(this);
		button[5].addActionListener(this);
		button[6].addActionListener(this);
		button[7].addActionListener(this);
		button[8].addActionListener(this);

		jFrame.setSize(650, 680);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}
}


