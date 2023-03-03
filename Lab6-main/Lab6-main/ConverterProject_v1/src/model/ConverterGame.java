package model;

import java.util.Timer;
import java.util.TimerTask;

//import model.players.*;

public class ConverterGame {


	private Integer timeRemaining;

	private Integer goal;


	public ConverterGame() {
		timeRemaining = 60;
		goal = 0;

		
		System.out.println("Inside ConverterGame");
		//SoccerBall.getSoccerBall().resetSoccerBall();
		
		// Create new Player Factory
		//PlayerFactory playerFactory = new PlayerFactory();
		
		// Create new Player Collection
		//gamePlayers = new PlayerCollection();
		
		//gamePlayers.add(playerFactory.getPlayer("striker"));
		//gamePlayers.add(playerFactory.getPlayer("goalkeeper"));
		//startGame();
	}
	public void getConvert(){
		System.out.println("Inside ConverterGame");	
	}
	

//	private void startGame() {
//		Timer timer = new Timer();
//		TimerTask timerTask = new TimerTask() {
//			@Override
//			public void run() {
//				if (!isPaused()) {
//					if (getTimeRemaining() <= 0) {
//						setOver(true);
//						timer.cancel();
//					} else {
//						setTimeRemaining(getTimeRemaining() - 1);
//					}
//					if (isScored()) {
//						setPaused(true);
//						setGoal(getGoal() + 1);
//						getActivePlayer().setPlayerStatistics(getActivePlayer().getPlayerStatistics() + 1);
//						getGamePlayers().get("Striker").setInitialPosition();
//						SoccerBall.getSoccerBall().resetSoccerBall();
//					} else {
//						automateGoalkeeper();
//					}
//				}
//			}
//		};
//		timer.schedule(timerTask, 1000, 1000);
//	}

	public Integer getTimeRemaining() {
		return timeRemaining;
	}

	public void setTimeRemaining(Integer timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

	public Integer getGoal() {
		return goal;
	}

	public void setGoal(Integer newGoal) {
		goal = newGoal;
	}


}
