package com.tka.model;

public class Team {
	
	private int teamId;
	private String teamName;
	private String city;
	private String coach;
	
	public Team(int teamId, String teamName, String city, String coach) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.city = city;
		this.coach = coach;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", city=" + city + ", coach=" + coach + "]";
	}

}
