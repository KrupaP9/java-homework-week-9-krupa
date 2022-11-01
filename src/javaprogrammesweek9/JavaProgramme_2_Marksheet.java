/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
package javaprogrammesweek9;

import java.util.Scanner;

public class JavaProgramme_2_Marksheet {
    public static void main(String[] args) {
        methodMarkSheet();
    }

    public static void methodMarkSheet() {
        //declare a scanner
        Scanner scanner = new Scanner(System.in);
        //get user input
        System.out.println("Enter Student's First Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student's Roll Number: ");
        int studentRollNumber = scanner.nextInt();
        System.out.println("Enter Student's Mathematics marks: ");
        int studentMathMarks = scanner.nextInt();
        System.out.println("Enter Student's Science marks: ");
        int studentScienceMarks = scanner.nextInt();
        System.out.println("Enter Student's English marks: ");
        int studentEnglishMarks = scanner.nextInt();
        //sum of all marks
        int studentTotalMarks = studentMathMarks + studentScienceMarks + studentEnglishMarks;
        float studentTotalMarksFloat = studentTotalMarks;
        float studentPercentage = (studentTotalMarksFloat * 100) / 300;
        //convert to float and calculate percentage
        System.out.println(" ________________________");
        System.out.println("|                        |");
        System.out.println("|       Mark Sheet       |");
        System.out.println("|________________________|");
        System.out.println("|   Name    : " + studentName + "        |");
        System.out.println("|   Roll No : " + studentRollNumber + "          |");
        System.out.println("|________________________|");
        System.out.println("|   Subjects:    Marks   |");
        System.out.println("|   Math    : " + studentMathMarks + "         |");
        System.out.println("|   Science : " + studentScienceMarks + "         |");
        System.out.println("|   English : " + studentEnglishMarks + "         |");
        //while loop for invalid marks input
        while (studentMathMarks<0 || studentMathMarks>100 || studentScienceMarks<0 || studentScienceMarks>100 || studentEnglishMarks<0 || studentEnglishMarks>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        //while loop for when any one subject has failed
        while (studentMathMarks<35 || studentScienceMarks<35 || studentEnglishMarks<35){
            System.out.println("|   Result: Fail         |");
            System.out.println("|________________________|");
            System.exit(0);
        }
        System.out.println("|________________________|");
        System.out.println("|   Total   :" + studentTotalMarks + "         |");
        System.out.println("|________________________|");
        System.out.println("|   Percentage:" + studentPercentage + "      |");
        //if statement for assigning grade based on percentage
        if (studentPercentage >= 80) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: A+            |");
        } else if (studentPercentage >= 60 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: A             |");
        } else if (studentPercentage >= 50 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: B             |");
        } else if (studentPercentage >= 35 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: C             |");
        } else {
            System.out.println("|   Result: Fail         |");
            System.out.println("|   Grade: F             |");
        }
        System.out.println("|________________________|");
        //close scanner
        scanner.close();
    }
}
