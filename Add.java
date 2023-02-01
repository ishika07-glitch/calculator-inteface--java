import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.util.Arrays;

public class Add implements Operate{
    @Override
    public Double getResult(Double... numbers){
        Double sum=0.0;
        for(Double num : numbers){
            sum+=num;

        }
        return sum;
    }
}