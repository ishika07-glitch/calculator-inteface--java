import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainApp{
    public static void main(String[] args){
        final String InputExp=ReadInput.read();

        Queue<String> operations;
        Queue<String> numbers;

        String numbersArr[]=InputExp.split("[-+*/]");
        String operArr[]=InputExp.split("[0-9]+");

        numbers= new LinkedList<String>(Arrays.asList(numbersArr));
        operations= new LinkedList<String>(Arrays.asList(operArr));

        Double res=Double.parseDouble(numbers.poll());

        while(!numbers.isEmpty()){
            String opr= operations.poll();

            Operate operate;
            switch(opr){
                case "+" : 
                operate = new Add();
                break;

                case "-" :
                operate= new Subtract();
                break;

                case "*" : 
                operate=new Multiply();
                break;

                case "/" : 
                operate=new Divide();
                break;

            }

        }


    }
}