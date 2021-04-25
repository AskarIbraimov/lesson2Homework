package com.GeekTech;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here




        System.out.println(ageAndTemperature(generateRandomAge(),22));
        System.out.println(ageAndTemperature(25,-10));
        System.out.println(ageAndTemperature(46,5));
        System.out.println(ageAndTemperature(33,-22));
        System.out.println(ageAndTemperature(21,17));

    }




    public static String ageAndTemperature (int ageOfPerson, int temperature){
        if (ageOfPerson >=20 && ageOfPerson <=45 && temperature > -20 && temperature <= 30 ){
            return "Можно идти гулять";
        }else if (ageOfPerson >20 && temperature >= 0 && temperature <=28){
        return "Можно идти гулять";
        }else if(ageOfPerson > 45 && temperature >=-10 && temperature <=25){
            return "Можно идти гулять";
        }
         return "Оставайтесь дома";

    }
    public  static  int generateRandomAge(){
        Random r = new Random();
        int randomNumber = r.nextInt(70) + 1;
        System.out.println(randomNumber);
        return randomNumber;
    }







    }





























