package models;

import enums.PieceEnum;

public class Step {
    private UserInfo player;
    private Point coordinate;
    private PieceEnum piece;
    private String dateTime;

    public Step(UserInfo player, Point coordinate, PieceEnum piece, String dateTime) {
        this.player = player;
        this.coordinate = coordinate;
        this.piece = piece;
        this.dateTime = dateTime;
    }

    public UserInfo getPlayer() {
        return player;
    }

    public void setPlayer(UserInfo player) {
        this.player = player;
    }

    public Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }

    public PieceEnum getPiece() {
        return piece;
    }

    public void setPiece(PieceEnum piece) {
        this.piece = piece;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
