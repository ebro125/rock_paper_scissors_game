package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner play = new Scanner(System.in);
        System.out.println("*** welcome to the game ***");
        System.out.println("Enter either rock(0),paper(1) or scissor(2)");
        Random choice= new Random();
         int comp = choice.nextInt(3);
         int player = play.nextInt();

         if(comp == 0 && player == 0){
             System.out.println("comp shows rock");
             System.out.println("player shows rock");
             System.out.println("Game tied");
         }
         else if(comp == 0 && player == 1){
             System.out.println("comp shows rock");
             System.out.println("player shows paper");
             System.out.println("player wins");
         }
         else if(comp == 0 && player == 2){
             System.out.println("comp shows rock");
             System.out.println("player shows scissor");
             System.out.println("comp wins");
         }
         else if(comp == 1 && player == 0){
             System.out.println("comp shows paper");
             System.out.println("player shows rock");
             System.out.println("comp wins");
         }
         else if(comp == 1 && player == 1){
             System.out.println("comp shows paper");
             System.out.println("player shows paper");
             System.out.println("Game tied");
         }
         else if(comp == 1 && player == 2){
             System.out.println("comp shows paper");
             System.out.println("player shows scissors");
             System.out.println("player wins");
         }
         else if(comp == 2 && player == 0){
             System.out.println("comp shows scissor");
             System.out.println("player shows rock");
             System.out.println("player wins");
         }
         else if(comp == 2 && player == 1){
             System.out.println("comp shows scissor");
             System.out.println("player shows paper");
             System.out.println("comp wins");
         }
         else if(comp == 2 && player == 2){
             System.out.println("comp shows scissor");
             System.out.println("player shows scissor");
             System.out.println("game tied");
         }
         else{
             System.out.println("Enter the correct input as mentioned!");
         }

    }
}
