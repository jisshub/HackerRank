package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SecClass obj1 = new SecClass();
        obj1.getValues();
        obj1.getStrings();
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
        System.out.println(arr1.toString());
    }
        }

class ThirdClass extends SecClass{
//    create an array of vowels
    String[] vowelArray = {"a", "e", "i", "o", "u"};
    public void FindOddEven(){
//        for (String eachName: arr1
//             ) {
//
//        }
    }
}