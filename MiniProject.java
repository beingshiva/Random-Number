import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class MiniProject {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        

        int myNumber = (int)(Math.random()*100);

        int userNumber = 0;
        do{
        System.out.print("Guess the Number (1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber)
            {
                System.out.println("Congratulation! You Guessed Correctly");
                break;
            }

            else if(userNumber > myNumber)
            {
                System.out.println("You Guessed, Large Number");
                
            }

            else
            {
                System.out.println("You Guessed, Small Number");
            }
        }while(userNumber >= 0);

        System.out.println("My Number Was : "+myNumber);
    }
}
