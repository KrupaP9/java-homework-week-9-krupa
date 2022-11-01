/*7. Write a Java program to test an array list is empty or not. Define array list with underground tube names*/
package javaprogrammesweek9;

import java.util.ArrayList;

public class JavaProgramme_7_UndergroundTubeNamesIsEmpty {
    public static void main(String[] args) {
JavaProgramme_7_UndergroundTubeNamesIsEmpty obj = new JavaProgramme_7_UndergroundTubeNamesIsEmpty();
obj.undergroundTubeNames();
    }
    public void undergroundTubeNames(){
        //declare array list
        ArrayList<String>tubeNamesList = new ArrayList<>();
        //add values to the list
        tubeNamesList.add("Bakerloo");
        tubeNamesList.add("Central");
        tubeNamesList.add("Victoria");
        tubeNamesList.add("Piccadilly");
        tubeNamesList.add("Jubilee");
        tubeNamesList.add("Metropolitan");
        tubeNamesList.add("Elizabeth");
        System.out.println("ArrayList:");
        //for loop to print array list
        for(String tubeNameData:tubeNamesList){
            System.out.print(tubeNameData+", ");
        }
        System.out.println("");
        //print size of array
        System.out.println("\nArrayList tubeNamesList size is: "+tubeNamesList.size());
        //if statement to check whether the array is empty or not
        if(tubeNamesList.isEmpty()) {
            System.out.println("ArrayList tubeNamesList is Empty");
        }else{
            System.out.println("ArrayList tubeNamesList is not Empty");
        }
        //to prove the else statement also works, delete all values from array list
        tubeNamesList.removeAll(tubeNamesList);
        System.out.println("\nAll Values Removed From Array List");
        //repeat of if statement to check whether array is empty
        if(tubeNamesList.isEmpty()) {
            System.out.println("ArrayList tubeNamesList is Empty");
        }else{
            System.out.println("ArrayList tubeNamesList is not Empty");
        }
    }
}
