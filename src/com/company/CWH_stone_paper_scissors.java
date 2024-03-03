package com.company;

import java.util.Scanner;
public class CWH_stone_paper_scissors {
    public static void main(String[] args) {
        System.out.println("Enter the value where Rock=1 Paper=2 Scissor=3 ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Player 1 option");
        int P1=sc.nextInt();
        System.out.println("Please enter the player 2 Option");
        int P2=sc.nextInt();
        if (P1==P2){
            System.out.println("It's a tie Play again");
        }
        else {
            switch (P1){
                case 1:
                    if(P2==2){
                        System.out.println("Player 2 won the game!!");
                    }
                    else {
                        System.out.println("Player 1 won the game!!");
                    }
                    break;
                case 2:
                    if(P2==3){
                        System.out.println("Player 2 won the game!!");
                    }
                    else{
                        System.out.println("Player 1 won the game!!");
                    }
                    break;
                case 3:
                    if(P2==1){
                        System.out.println("Player 2 won the game!!");
                    }
                    else{
                        System.out.println("Player 1 won the game!!");
                    }
                    break;
            }

            System.out.println("Thankyou For playing the game");

        }
    }


}
