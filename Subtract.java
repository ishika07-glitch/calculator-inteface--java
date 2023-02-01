import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.util.Arrays;

public class Subtract implements Operate{
    @Override
    public Double getResult(Double... numbers){
        Double result= numbers[0];

        for(int i=1;i<numbers.length;i++){
            result-=numbers[i];

        }
        return result;
    }
}