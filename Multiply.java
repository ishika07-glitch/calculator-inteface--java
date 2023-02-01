import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.util.Arrays;

public class Multiply implements Operate{
    @Override
    public Double getResult(Double... numbers){
        Double result=1.0;
        for(Double num : numbers){
            result*=num;

        }
        return result;
    }
}