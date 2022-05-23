/*Write a program to check whether a person can cast a vote or not. Condition is you must
be above 18 years to vote.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorKo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age==18 || age>18){
            System.out.println("you can vote");
        }
        else;
        System.out.println("Your are under age and cannot vote");
    }
}

//2. Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.
class SI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal");
        double principal = scanner.nextDouble();
        System.out.println("Enter the Rate");
        double rate = scanner.nextDouble();
        System.out.println("Enter time");
        double time = scanner.nextDouble();
        double SI = (principal*rate*time)/100;
        System.out.println(SI);

    }
}

class AreaOfTriangle{
    public static void main(String[] args) {
        double base = 20;
        double height =40;
        double area = ((base * height)/2);
        System.out.println("The area of triangle is " + area);
    }
}

class VolOfCube{
    public static void main(String[] args) {
        double length = 30;
        double vol = (length*length*length);
        System.out.println("THE VOLUME IS "+ vol);
    }
}
class VolOfCuboid{
    public static void main(String[] args) {
        int l = 300;
        int b = 200;
        int h = 100;
        int volume = (l*b*h);
        System.out.println("The volume of cuboid is " + volume);
    }
}

//3. Write ternary operator for the question no. 1.
/*Write a program to check whether a person can cast a vote or not. Condition is you must
be above 18 years to vote.*/
class TernaryOfOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        String givenage;
         givenage=(age==18 || age >18)? "You can vote":"You cannot vote";
        System.out.println(givenage);
    }
}

//4. Write a program to calculate the total marks of four subjects of a student and the total
//percentage secured. And use following conditions to generate the final result;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.

class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks in English ");
        int EngMarks = scanner.nextInt();
        System.out.println("Enter your marks in Nepali ");
        int NepMarks = scanner.nextInt();
        System.out.println("Enter your marks in Science ");
        int SciMarks = scanner.nextInt();
        System.out.println("Enter your marks in Social ");
        int SocMarks = scanner.nextInt();
        int sum = (EngMarks + NepMarks + SciMarks + SocMarks);
        double Total = ((sum * 100) / 400);
        System.out.println(Total);
        if (Total == 70 || Total > 70) {
            System.out.println("First Class");

        } else if(Total > 59) {
            System.out.println("Upper Second Class");

        } else if (Total > 49) {
            System.out.println("Second Class");

        } else if (Total > 39) {
                System.out.println("Third Class");
                }
            else {
                        System.out.println("Failed");
                    }

                }
            }




