package Bouncing_Balls;

public class Run {
    public static void main(String[] args) {
        System.out.println(bouncingBall(30, 0.66, 1.5));

    }
    public static int bouncingBall(double h, double bounce, double window) {
        if (h<=0||bounce<=0||bounce>=1||window>=h){
            return -1;
        }
        int counter =0;
        while (h*bounce>window) {
            counter++;
            h = h*bounce;
        }
        return counter*2+1;
    }
}
