import com.github.gohv.Game;
import com.github.gohv.Math;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {

        Math math = new Math();
        System.out.println("First Number is: " + math.getFirstRandom());
        System.out.println("Second Number is " + math.getSecondRandom());
        System.out.println("Is this the correct answer? :" + math.chooser());
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        int points = 0;

        while(answer.equalsIgnoreCase("yes") && math.checkAnswer() == true || answer.equalsIgnoreCase("NO") && math.checkAnswer() == false){
            math.roll();
            System.out.println("First Number is: " + math.getFirstRandom());
            System.out.println("Second Number is " + math.getSecondRandom());
            System.out.println("Is this the correct answer? :" + math.chooser());
            points ++;
            System.out.println("your point are: " + points);
            answer = sc.next();
            if(answer.equalsIgnoreCase("yes") && math.checkAnswer() == false || answer.equalsIgnoreCase("no") && math.checkAnswer() == true){
                System.out.println("you loose!");
                break;
            }

        }
    }
}
