package com.projects;
import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    private int thenumber;
    private int mynumber=0;
    private int guess=0;

    public Game(){
        this.thenumber=rand.nextInt(101);
    }

    public void isCorrectNumber(){
        while(thenumber!=mynumber) {
            System.out.print("Guess the number: ");
            mynumber=sc.nextInt();
            if (thenumber == mynumber) {
                guess += 1;
                System.out.printf("You guess the number in your %dth attempt", guess);
                break;
            } else {
                if (thenumber > mynumber) {
                    guess += 1;
                    System.out.println("Try it with a bigger number");
                } else {
                    guess += 1;
                    System.out.println("Try with a smaller number");
                }
            }
        }
        System.out.printf("\nThe number is %d",thenumber);
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        int i;
        Game g=new Game();
        g.isCorrectNumber();
    }
}
