/*8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)*/
package javaprogrammesweek9;

import java.util.HashSet;
import java.util.Set;

public class JavaProgramme_8_HashSetStoreIntegerObject {
    public static void main(String[] args) {
numListMethod();
    }
    public static void numListMethod() {
        //create HashSet for 1-10
        Set<Integer> numList1To10 = new HashSet<>();
        //add values 1-10
        numList1To10.add(1);
        numList1To10.add(2);
        numList1To10.add(3);
        numList1To10.add(4);
        numList1To10.add(5);
        numList1To10.add(6);
        numList1To10.add(7);
        numList1To10.add(8);
        numList1To10.add(9);
        numList1To10.add(10);
        System.out.println("Hashset 1-10: "+ numList1To10);

        //create second HashSet
        Set<Integer> numList = new HashSet<>();
        //add values 4,7,8
        numList.add(4);
        numList.add(7);
        numList.add(8);
        //print HashSet
        System.out.println("Hashset 4,7,8: "+numList);
        //if HashSet1-10 contains HashSet numList then print Number is in the set 1-10
        for(int a:numList){
            if(numList1To10.contains(a)){
                System.out.println(a+" Number is in the set 1-10");
            }else{
                System.out.println(a+" Number is not in the set 1-10");
            }
        }
    }
}
