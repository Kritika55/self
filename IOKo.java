import java.util.Scanner;

public class IOKo {
    public static void main(String[] args) {
       System.out.println("Hya");
      System.out.println("Kasto boring");

        System.out.print("Bro ");
        System.out.print("Bhok lagyo ");

        System.out.printf("Kaile ");
        System.out.printf("Jane Hospital");
        System.out.printf("string ");
        System.out.printf("format, arguments ");
        System.out.printf("locale, format, arguments");
    }
}

class ScannerWala{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, age, salary ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int salary = scanner.nextInt();
        System.out.println("These are my things: " );
        System.out.println("name:" + name );
        System.out.println("age:" +age );
        System.out.println("Salary:" + salary);

    }
}

//1. Write a program to take student details as input and display the result.
class StdDetails{
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Please enter your details: ");
        System.out.println("Name: ");
        String name = info.nextLine();
        System.out.println("Class: ");
        int grade = info.nextInt();
        System.out.println("Roll no: ");
        int roll = info.nextInt();
        System.out.println("My name is " + name + " I study in " + grade + " My roll no is " + roll );

    }
}
//2. Write a program to calculate sum of four numbers taking user input.
class SumOfFour{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = number.nextInt();
        System.out.println("Enter the second number : ");
        int second = number.nextInt();
        System.out.println("Enter the third number : ");
        int third = number.nextInt();
        System.out.println("Enter the fourth number : ");
        int fourth = number.nextInt();
        int sum = (first + second + third + fourth);
        System.out.println("The sum of your four numbers are : " + sum );
    }
}

//3. Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class Result {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter your marks of following subjects : ");
        System.out.println("Science : ");
        int sci = marks.nextInt();
        System.out.println("Social : ");
        int soc = marks.nextInt();
        System.out.println("Math : ");
        int mat = marks.nextInt();
        System.out.println("English : ");
        int eng = marks.nextInt();
        int sum = (sci + soc + mat + eng);
        double Total = (sum * 100) / 400;
        System.out.println("You have scored " + Total + "%");
        if (Total >= 70) {
            System.out.println("First class ");
        } else if (Total > 59) {
            System.out.println("upper second class ");
        } else if (Total > 49) {
            System.out.println("Second class ");
        } else if (Total > 39) {
            System.out.println("Third class");
        } else {
            System.out.println("Failed");
        }
    }
}

//4. Write a program to take two integer inputs from user and print sum and product of them.
class SumAndProduct{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int second = scanner.nextInt();
        int product = (first*second);
        int sum = (first+second);
        System.out.println("The product is: "+ product);
        System.out.println("The sum is : "+ sum);
    }
}

//5. Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.
class Division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int second = scanner.nextInt();
        double product = (first*second);
        double sum = (first+second);
        System.out.println("The product is: "+ product);
        System.out.println("The sum is : "+ sum);
        double division = (product/sum);
        System.out.println(division);
    }
}
//6. Ask user to give two double input for length and breadth of a rectangle and print area type
// casted to int.
class Rectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = input.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b= input.nextInt();
        int Area = (l*b) ;
        System.out.println("The area of rectangle is : "+ Area);

    }
}

//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
class NextOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.next();
        System.out.println("Enter your Roll number ");
        int roll = scanner.nextInt();
        System.out.println("Enter the field you are interested in ");
        String field = scanner.next();
        System.out.println("Hey," + " my name is " + name +" and my roll number is " + roll +"." + " My field of interest are " + field);
    }
}
//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class Perimeter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        int l = scanner.nextInt();
        int A = (l*l);
        int P = (4*l);
        System.out.println("The area and perimeter are :"  );
        System.out.println(A);
        System.out.println(P);
    }
}

// 9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25
//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
//12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.
//13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.