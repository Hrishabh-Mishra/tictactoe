package com.playverse.tictactoe.model;

public class Cell {
    private int x;
    private int y;
    private CellStatus status;
    private Player player;

    public CellStatus getStatus() {
        return status;
    }

    public void setStatus(final CellStatus status) {
        this.status = status;
    }

    public Cell(final int x, final int y) {
        this.x = x;
        this.y = y;
        this.status = CellStatus.UNOCCUPIED;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(final Player player) {
        this.player = player;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
