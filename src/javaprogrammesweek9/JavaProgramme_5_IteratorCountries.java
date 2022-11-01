/*5. Write a Java program to iterate through all elements in an array list using Iterator.*/
package javaprogrammesweek9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaProgramme_5_IteratorCountries {
    public static void main(String[] args) {
        //create HashSet of type String
        Set<String>countriesList=new HashSet<>();
        //add values to the set
        countriesList.add("India");
        countriesList.add("U.K");
        countriesList.add("U.S.A");
        countriesList.add("Canada");
        countriesList.add("Switzerland");
        //iterate through the values and print
        Iterator<String>itr=countriesList.iterator();
        System.out.println("My List of Countries: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
