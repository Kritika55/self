//Create a new project in the IntelliJ IDEA and write the Helloworld.java program.
class Hello{
    public static void main(String[] args) {
        System.out.println("Hello Kritika !!");
    }
}

class SpecialSequencesExample{
    public static void main(String[] args) {
        //it inserts a Tab Space
        String str = "Ritubarna\tPaudel";
        System.out.println(str);

        // it inserts a new line
        String str1= "Kritika\nLoves\nDad";
        System.out.println(str1);

        //it inserts a backslash
        String str2 = "Kritika\\Paudel";
        System.out.println(str2);

        //it inserts a Carriage
        String str3 = "K raixa \r yo chiz";
        System.out.println(str3);

        // it prints a single quote
        String str4 = "Kit kat\'s";
        System.out.println(str4);

        //it prints double quote
        String str5 = "Kritika\' Listening Zinda song";
        System.out.println(str5);
        String str6 = "'loving it'";
        System.out.println(str6);
    }
}

class Demo {
    static int m= 100; //static variable
    void method ()
    {
        int n=90; //local variable
    }

    public static void main(String[] args) {
        int data = 50; //instance variable
    }
} // end of class

class VariableExample {
    int myVariable;
    static int data = 30;
    void method() {
        int a = 100;
        System.out.println("Value of local variable a: " + a);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.method();
        System.out.println("Value of instance variable myVariable:" +obj.myVariable);
        System.out.println("Value of static variable data:" +VariableExample.data);
    }
}

class Operators{
    public static void main(String[] args) {
        // yo chai variable declare gareko
        int a = 20, b = 80;
        System.out.println("a+b = "+(a+b));

        System.out.println("a-b = "+(a-b));

        System.out.println("axb = "+ (a*b));

        System.out.println("b/a=" + (b/a));

        System.out.println("b%a = "+ (b%a));


    }
}

class MovingOn{
    public static void main(String[] args) {
        int a = 500;
        int kri;

        kri = a;
        System.out.println("aaba value assign garda :"+ kri);

        kri +=a;
        System.out.println(kri);

        kri -= a;
        System.out.println(kri);

        kri *= a;
        System.out.println(kri);


    }
}