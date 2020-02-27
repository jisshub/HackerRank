package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThirdClass obj1 = new ThirdClass();
        obj1.getValues();
        obj1.getStrings();
        obj1.FindOddEven();
    }
}

class OddEvenProblem{
    int limit;
    public void getValues(){
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter Limit: ");
        limit = s1.nextInt();
        System.out.println("your limt:" + limit);

    }
}
class SecClass extends OddEvenProblem{
    ArrayList<String> arr1;
    public void getStrings(){
         arr1 = new ArrayList<>();
        while (limit > 0){
            Scanner inp1 = new Scanner(System.in);
            System.out.println("Enter String: ");
            String str1 = inp1.next();
            arr1.add(str1);
            limit -- ;
        }
        System.out.println("resultant array: " + arr1);
//        System.out.println(arr1.getClass().getName());
    }
        }


class ThirdClass extends SecClass{
//    declare an array list to get even characters in a string
    ArrayList<Character> EvenArray;
    ArrayList<Character> OddArray;
    public void FindOddEven() {
        EvenArray = new ArrayList<>();
        OddArray = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
//            System.out.println(arr1.get(i));
            String myString = arr1.get(i);
//            get the type of variable, already know its String but im confused.
            System.out.println(myString.getClass().getName());
//            iterate thru the each string and get the character
            for (int j = 0; j < myString.length() ; j++) {
//                System.out.println(myString.charAt(j));
//                EvenArray.add(myString.charAt(j));
                if (myString.indexOf(myString.charAt(j)) % 2 == 0){
                    EvenArray.add(myString.charAt(j));
                }
                else {
                    OddArray.add(myString.charAt(j));
                }
            }
        }
        System.out.println("Even Charters Array:" + EvenArray.toString());
        System.out.println("Odd Charters Array:" + OddArray.toString());
        }
}

