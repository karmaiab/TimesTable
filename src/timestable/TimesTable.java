/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timestable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danek
 */
public class TimesTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int incorrectAnswers = 0;
        int correctAnswers = 0;
        int Answer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        String GREEN = "\033[0;32m";
        String RED = "\033[0;31m";
        String RESET = "\033[0m";
        while(Answer != 5) {
            nums[0] = random.nextInt(9)+1;
            nums[1] = random.nextInt(9)+1;
            System.out.print(nums[0]+" * "+nums[1]+" = ");
            int answer = scanner.nextInt();
            ++Answer;
            if(answer ==  nums[0]*nums[1]) {
                System.out.println(GREEN+"Correct"+RESET);
                ++correctAnswers;
            }
            else
                System.out.println(RED+"Incorrect"+RESET);      
        }
        if(correctAnswers == 5){
            System.out.println("Молодец,");
        }
        if(correctAnswers == 4){
            System.out.println("Надо бы еще поучить,");
        }
        if(correctAnswers == 3){
            System.out.println("Надо бы еще поучить,");
        }
        if(incorrectAnswers < 2){
            System.out.println("Срочно нужно учить таблицу умножения");
        }
    }   
}

