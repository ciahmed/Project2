package shufflegame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame {
    //{1, 0, 1} array[index]
    Scanner sc = new Scanner(System.in);//global object

    public int[] shuffleGame(int[] ar) {//{0, 1, 1}
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
    //player guess
    public int playerGuess(){
        int guess = 0;
        while (guess != 1 || guess != 2 || guess != 3) {
            System.out.println("pick 1, 2 or 3!!!");
            guess = sc.nextInt();
            if(guess == 1 || guess == 2 || guess == 3){
                break;
            }
        }
        return guess-1;
    }

    //check guess
    public void checkGuess(int[] list, int guess){
        if(list[guess] == guess){
            System.out.println("good guess!");
        }else {
            System.out.println("sorry!!! wrong guess");
        }
    }
}
