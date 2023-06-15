import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        
        Random ra = new Random();
        int randomNum = ra.nextInt(100);
        boolean result = false;
        int k = 5;
        int k2 = 5;
        System.out.println(randomNum);

        while(k>0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess the Number [Between 1 to 100] : ");
            int myNum = sc.nextInt();

            if(randomNum == myNum){
                System.out.println("Hey Congrats! you guess it Right the number is : "+randomNum);
                result = true;
                break;
            } else if(randomNum > myNum){
                System.out.println("Hey you guess small number");
                k--;
            }
            else{
                System.out.println("Hey you guess large number");
                k--;
            }
        }

        if(result == false){
            System.out.println();
            System.out.println("Oops! You lose the Game...");
            System.out.println("You didn't guess the number in " + k2 + " trails");
            System.out.println("The Actual number is : " + randomNum);
        }

    }
}
