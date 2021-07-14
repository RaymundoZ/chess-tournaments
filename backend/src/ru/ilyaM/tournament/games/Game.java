package ru.ilyaM.tournament.games;

import ru.ilyaM.tournament.games.gamelogic.PiecesColor;
import ru.ilyaM.tournament.games.gamelogic.Step;
import ru.ilyaM.user.UserInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {
    private int NumberGame; //todo Можно ли сделать gameID?
    private UserInfo player1;
    private UserInfo player2;
//    private PiecesColor player1PiecesColor;
//    private PiecesColor player2PiecesColor;
    private UserInfo judge; // todo (referee(arbiter)?)
    private Date date;
    private Result result;
    private Opening opening;
    private List<Step> steps;

    public Game(int numberGame, UserInfo player1, UserInfo player2, UserInfo judge, Date date,
                Result result, Opening opening) {
        NumberGame = numberGame;
        this.player1 = player1;
        this.player2 = player2;
        this.judge = judge;
        this.date = date;
        this.result = result;
        this.opening = opening;
        this.steps = new ArrayList<>();
    }

    public int getNumberGame() {
        return NumberGame;
    }

    public void setNumberGame(int numberGame) {
        NumberGame = numberGame;
    }

    public UserInfo getPlayer1() {
        return player1;
    }

    public void setPlayer1(UserInfo player1) {
        this.player1 = player1;
    }

    public UserInfo getPlayer2() {
        return player2;
    }

    public void setPlayer2(UserInfo player2) {
        this.player2 = player2;
    }

    public UserInfo getJudge() {
        return judge;
    }

    public void setJudge(UserInfo judge) {
        this.judge = judge;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Opening getOpening() {
        return opening;
    }

    public void setOpening(Opening opening) {
        this.opening = opening;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
