package day1;

import java.util.ArrayList;
import java.util.List;

public class SumPricesList {
    public static void main(String[] args) {
          /*   1. Question : Find the sum of all prices given in a string list.
               Sample: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
          */
        double sum = 0;
        String str = "";
        List<String> myList =new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");

        for (int i = 0; i <myList.size() ; i++) {
        str= myList.get(i);
        sum+=Double.parseDouble(str.replace('$',' '));


        }

        System.out.println(sum);


    }
}
