package com.github.gohv;
import java.util.Random;
/**
 * Created by Georgy on 7/21/2016.
 * Numbers container
 */
public class Math {

    private int firstNumber;
    private int secondNumber;
    private int correctResult;
    private int wrongResult;
    private Random random;
    private int choose;
    private int test;

    public Math(){

        roll();

    }

    public Integer getFirstRandom(){


        return firstNumber;
    }
    public Integer getSecondRandom(){


        return secondNumber;
    }
    private void calculateFuck(){
        correctResult = firstNumber + secondNumber;
    }

    public Integer getCorrectResult(){
        calculateFuck();
        return correctResult;
    }
    public Integer getWrongResult(){

        return wrongResult;
    }

    public Integer chooser(){
        if(choose == 1){
           test = getCorrectResult();
        }else if(choose == 2){
           test = getWrongResult();
        }
        return test;
    }

    public Integer getTest(){
        return test;
    }


    public Integer getChoose(){
        return choose;
    }



    public boolean checkAnswer(){
        if(choose == 1){
            return true;
        }
        return false;
    }

    public void roll(){

        random = new Random();
        choose = random.nextInt(2)+1;
        firstNumber = random.nextInt(1000) + 1;
        secondNumber = random.nextInt(1000)+ 1;
        wrongResult = random.nextInt(1000);
    }

}
