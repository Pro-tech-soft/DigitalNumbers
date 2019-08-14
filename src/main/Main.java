package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any integer or decimal numbers ( for output it in digital format");
        String inputDigital = scan.next();
        if(!checkInput(inputDigital)) System.exit(0);

        Numbers currNumbers = new Numbers(inputDigital);
        System.out.println(currNumbers.toString());
    }
    private static boolean checkInput(String inputDigital){
        char[] stringToCharArray = inputDigital.toCharArray();
        char[] sampleChar = {'0', '1' , '2', '3', '4', '5', '6', '7', '8', '9', ',', '.'};
        for(char ch : stringToCharArray){
            if(!contains(ch, sampleChar)) {
                System.out.println("Invalid input!");
                return false;
            }
        }
        return true;
    }
    private static boolean contains(char ch, char[] sampleChar){
        for(char x : sampleChar){
            if(x == ch) return true;
        }
        return false;
    }
}
