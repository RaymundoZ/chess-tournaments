package models;

import enums.RankEnum;

import java.util.List;

public class Tournament {
    private String startDate;
    private String endDate;
    private int playersCount;
    private int gamesCount;
    private List<RankEnum> ranks;
    private List<PlayerInfo> players;
    private List<Game> games;

    public Tournament(String startDate, String endDate, int playersCount, int gamesCount, List<RankEnum> ranks, List<PlayerInfo> players, List<Game> games) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.playersCount = playersCount;
        this.gamesCount = gamesCount;
        this.ranks = ranks;
        this.players = players;
        this.games = games;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPlayersCount() {
        return playersCount;
    }

    public void setPlayersCount(int playersCount) {
        this.playersCount = playersCount;
    }

    public int getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    public List<RankEnum> getRanks() {
        return ranks;
    }

    public void setRanks(List<RankEnum> ranks) {
        this.ranks = ranks;
    }

    public List<PlayerInfo> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerInfo> players) {
        this.players = players;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
