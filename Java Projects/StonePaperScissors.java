package com.projects;
import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        System.out.print("Choose among Strone(s), Paper(p) & Scissors(sc):");
        String you=sc.nextLine();

        int comp=rand.nextInt(3);

        String c=null;
        int a=1;

        if(comp==0){
            c="s";
        }
        else if(comp==1){
            c="p";
        }
        else if(comp==2){
            c="sc";
        }

        System.out.printf("You choose %s & Computer choose %s \n",you,c);

        if(you.equals("s")){
            if(c.equals("p")){
                System.out.println("You loss the game");
            }
            else if(c.equals("sc")){
                System.out.println("You win the game");
            }
            else if(c.equals("s")){
                System.out.println("The match is draw");
            }
        }

        if(you.equals("p")){
            if(c.equals("s")){
                System.out.println("You win the game");
            }
            else if(c.equals("sc")){
                System.out.println("You loss the game");
            }
            else if(c.equals("p")){
                System.out.println("The match is draw");
            }
        }

        if(you.equals("sc")){
            if(c.equals("s")){
                System.out.println("You loss the game");
            }
            else if(c.equals("p")){
                System.out.println("You win the game");
            }
            else if(c.equals("sc")){
                System.out.println("The match is draw");
            }
        }
    }
}
