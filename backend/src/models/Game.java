package models;

import enums.OpeningEnum;
import enums.ResultEnum;

import java.util.List;

public class Game {
    private int gameNumber;
    private String date;
    private UserInfo firstPlayer;
    private UserInfo secondPlayer;
    private UserInfo judge;
    private ResultEnum result;
    private OpeningEnum opening;
    private List<Step> steps;
    private boolean isStepByStep;

    public Game(int gameNumber, String date, UserInfo firstPlayer, UserInfo secondPlayer, UserInfo judge, ResultEnum result, OpeningEnum opening, List<Step> steps, boolean isStepByStep) {
        this.gameNumber = gameNumber;
        this.date = date;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.judge = judge;
        this.result = result;
        this.opening = opening;
        this.steps = steps;
        this.isStepByStep = isStepByStep;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserInfo getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(UserInfo firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public UserInfo getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(UserInfo secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public UserInfo getJudge() {
        return judge;
    }

    public void setJudge(UserInfo judge) {
        this.judge = judge;
    }

    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public OpeningEnum getOpening() {
        return opening;
    }

    public void setOpening(OpeningEnum opening) {
        this.opening = opening;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public boolean isStepByStep() {
        return isStepByStep;
    }

    public void setStepByStep(boolean stepByStep) {
        this.isStepByStep = stepByStep;
    }
}
