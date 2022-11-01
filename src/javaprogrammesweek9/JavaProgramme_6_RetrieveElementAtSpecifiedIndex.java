/*6. Write a Java program to retrieve an element (at a specified index) from a given array list*/
package javaprogrammesweek9;

import java.util.ArrayList;

public class JavaProgramme_6_RetrieveElementAtSpecifiedIndex {
    public static void main(String[] args) {
retrieveElementAtSpecifiedIndex();
    }
    public static void retrieveElementAtSpecifiedIndex(){
        //create an array list
        ArrayList<Integer>studentIDList = new ArrayList();
        //add values to the array
        studentIDList.add(102);
        studentIDList.add(104);
        studentIDList.add(105);
        studentIDList.add(107);
        studentIDList.add(108);
        studentIDList.add(115);
        System.out.println("Student ID List");
        //for loop to print whole array list
        for (int studentIDNumbers:studentIDList){
            System.out.print(studentIDNumbers+", ");
        }
        System.out.println("");
        System.out.println("At index "+1+" result is "+studentIDList.get(1));
    }
}
