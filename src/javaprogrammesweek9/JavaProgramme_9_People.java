/*9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
package javaprogrammesweek9;

import java.util.HashMap;
import java.util.Map;

public class JavaProgramme_9_People {
    public static void main(String[] args) {
peopleMethod();
    }
    public static void peopleMethod(){
        //create HashMap with String and Integer as Key and Value respectively
        Map<String,Integer> people = new HashMap<>();
        people.put("Mary",1);
        people.put("John",2);
        people.put("Elizabeth",3);
        people.put("James",4);
        people.put("Violet",1);
        //for loop to iterate and print each value
        for(Map.Entry<String,Integer>num:people.entrySet()){
            System.out.println(num);
        }
    }
}
