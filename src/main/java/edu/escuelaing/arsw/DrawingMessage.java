package edu.escuelaing.arsw;

public class DrawingMessage {
    private float x;
    private float y;

    public DrawingMessage() {
    }

    public DrawingMessage(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}

