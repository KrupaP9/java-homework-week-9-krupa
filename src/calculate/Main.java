
package calculate;
/*1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
All methods are instance method and it doesn’t return anything. But it has two parameters with name “int a” and “int b”.
Also each method have System.out.println(). This prints the result. Also create all one more method with name
“calculateResult” with three parameter with name int a, int b and char symbol. Write the logic in calculateResult method
that when user enter first number and second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user input. Also write the logic that it ask user to
“Enter first Number:”, “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user enter + symbol result like
“Addition of 5 and 10 is: 15” and respective for other symbol.
5. With the result it’s also print one more message “Would you like to do more calculation Please enter “Y” or “N” :”
(Hint use while loop if user enter Y program asking the user to enter First Number, and if user enter N programme
should terminate)*/
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);
        //get input of integers a and b from user
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        //get input of operator from user
        System.out.println("Please enter one of symbol +,-,*,/: ");
        char symbol = scanner.next().charAt(0);
        //declare an object (obj)
        Main obj = new Main();
        //use object to call method calculateResult from class Calculator
        obj.calculateResult(a, b, symbol);
        System.out.println("Would you like to do more calculations? (Enter y / n)");
        char cont = scanner.next().charAt(0); //if user would like to continue, complete first while loop
        while (cont == 'Y' || cont == 'y') {
            System.out.println("Enter the first number: ");
            a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/: ");
            symbol = scanner.next().charAt(0);
            Main obj1 = new Main();
            obj1.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculations? (Enter y / n)");
            cont = scanner.next().charAt(0); //allows the while loop to continue as long as user enters 'y'

        }
        while (cont == 'N' || cont == 'n') { //if user would like to stop, complete the second while loop
            System.out.println("Thank you for using the calculator. ");
            System.exit(0); //exit loop and stop programme
        }
        //close scanner
        scanner.close();

    }
}
