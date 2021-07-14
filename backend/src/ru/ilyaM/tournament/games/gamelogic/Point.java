package ru.ilyaM.tournament.games.gamelogic;

public class Point {
    private char x;
    private short y;

    public Point(char x, short y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public short getY() {
        return y;
    }
}
