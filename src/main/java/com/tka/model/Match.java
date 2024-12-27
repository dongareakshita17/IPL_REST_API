package com.tka.model;

public class Match {
	
	private int matchId;
	private int teamOneId;
	private int teamTwoId;
	private int date;
	private String venue;
	private String result;
	
	public Match(int matchId, int teamOneId, int teamTwoId, int date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOneId = teamOneId;
		this.teamTwoId = teamTwoId;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeamOneId() {
		return teamOneId;
	}

	public void setTeamOneId(int teamOneId) {
		this.teamOneId = teamOneId;
	}

	public int getTeamTwoId() {
		return teamTwoId;
	}

	public void setTeamTwoId(int teamTwoId) {
		this.teamTwoId = teamTwoId;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOneId=" + teamOneId + ", teamTwoId=" + teamTwoId + ", date=" + date
				+ ", venue=" + venue + ", result=" + result + "]";
	}

}
