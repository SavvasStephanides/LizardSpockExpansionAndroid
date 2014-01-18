package com.savthecoder.mobile.android.lsx.model.score;

import java.io.Serializable;

public class Score implements Serializable
{
	
	private int playerScore;
	private int opponentScore;
	
	private String player1Name;
	private String player2Name;
	
	
	public Score(String player1Name, String player2Name)
	{
		playerScore = 0;
		opponentScore = 0;
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}
	
	public Score()
	{
		this("You", "Opponent");
	}
	
	public void playerWins()
	{
		playerScore++;
	}
	
	public void opponentWins()
	{
		opponentScore++;
	}
	
	public String getPlayerName()
	{
		return player1Name;
	}
	
	public String getOpponentName()
	{
		return player2Name;
	}
	
	public int getPlayerScore()
	{
		return playerScore;
	}
	
	public int getOpponentScore()
	{
		return opponentScore;
	}
	
	public String toString()
	{
		return "Player: " + getPlayerScore() + ", Opponent: " + getOpponentScore();
	}
	
	public boolean gameIsOver()
	{
		return getPlayerScore() == 10 || getOpponentScore() == 10;
	}

}
