package basicmaths;


import java.util.*;

public class CelciusToFahrenheit {


    public static int celciusToFahrenheit(int celcius){

        int Fahrenheit = 0;
        Fahrenheit = celcius*9/5 + 32;
        return Fahrenheit;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();

        System.out.println(celciusToFahrenheit(celcius));
    }


}
