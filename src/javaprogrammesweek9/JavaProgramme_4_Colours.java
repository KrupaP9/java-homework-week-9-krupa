/*4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.*/
package javaprogrammesweek9;

import java.util.ArrayList;

public class JavaProgramme_4_Colours {
    public static void main (String[]args){
        coloursArray();
    }
    public static void coloursArray(){
        //create an array list
        ArrayList<String>colourList=new ArrayList();
        //add values to list
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Blue");
        System.out.println("My list of colours: ");
        //for loop to print array list
        for (String colourName:colourList){
            System.out.println(colourName);
        }
    }
}
