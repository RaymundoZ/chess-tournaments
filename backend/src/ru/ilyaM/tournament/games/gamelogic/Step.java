package ru.ilyaM.tournament.games.gamelogic;

import ru.ilyaM.user.UserInfo;

import java.util.Date;

public class Step {
    private UserInfo player;
    private Point coordinates;
    //todo Возможно стоит private PiecesColor color;
    private Pieces pieces;
    private Date dateTime;

    public Step(UserInfo player, Point coordinates, Pieces pieces, Date dateTime) {
        this.player = player;
        this.coordinates = coordinates;
        this.pieces = pieces;
        this.dateTime = dateTime;
    }

    public UserInfo getPlayer() {
        return player;
    }

    public void setPlayer(UserInfo player) {
        this.player = player;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
