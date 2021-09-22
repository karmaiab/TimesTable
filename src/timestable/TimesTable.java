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
        int correctAnswers = 0;
        int Answer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];
        
        while(Answer != 5) {
            nums[0] = random.nextInt(9)+1;
            nums[1] = random.nextInt(9)+1;
            System.out.print(nums[0]+" * "+nums[1]+" = ");
            int answer = scanner.nextInt();
            ++Answer;
            if(answer ==  nums[0]*nums[1]) {
                System.out.println("Correct");
                ++correctAnswers;
            }
            else
                System.out.println("Incorrect"); 
        }
        System.out.println("Done");
    }
    
}
