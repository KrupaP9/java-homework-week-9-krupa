//3. Write a Java program to reverse an array of integer values.
package javaprogrammesweek9;

public class JavaProgramme_3_ReverseArray {
    public static void main(String[] args) {
reverseArray();
    }
    public static void reverseArray(){
        //create an array and assign values
        int []arrayPrice = new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: ");
        //for loop to print array
        for (int i=0;i<arrayPrice.length;i++){
            System.out.print(arrayPrice[i]+", ");
        }
        System.out.println("");
        System.out.println("Array in reverse order");
        //for loop to reverse array and print it
        for (int i=arrayPrice.length-1;i>=0;i--){
            System.out.print(arrayPrice[i]+", ");
        }
    }
}
