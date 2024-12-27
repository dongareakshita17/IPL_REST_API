package com.tka.model;

public class Player {
	
	private int playerId;
	private String playerName;
	private int age;
	private int teamId;
	private String role;
	
	public Player(int playerId, String playerName, int age, int teamId, String role) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.teamId = teamId;
		this.role = role;
	}

	public Player(int i, String string, String string2, String string3) {
		
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", teamId=" + teamId
				+ ", role=" + role + "]";
	}

}
