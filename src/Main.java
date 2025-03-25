public class Main {
    public static void main(String[] args) {
        int age1 = 21;

       // if (age >= 18) {
        //  System.out.println("Du bist volljährig");
        // } else  {
        //   System.out.println("Du bist minderjährig");
        // }

        if (age1 >= 21) {
            System.out.println("Du bist volljährig, in der USA");
        } else if (age1 >= 18) {
            System.out.println("Du bist volljährig, in Deutschland");
        } else {
            System.out.println("Du bist minderjährig");
        }

        //Aufgabe

        int age = 18;
        if (age >= 18) {
            System.out.println("du bist 18 oder älter");
        } else  {
            System.out.println("Du bist unter 18");
        }

        int Name = 8;
        if (Name > 11) {
            System.out.println("mehr als 10 Zeichen");
        } else if (Name >= 10) {
            System.out.println("10 oder weniger");
        } else {
            System.out.println("weniger als 10 Zeichen");
        }


        //Methoden
        String name1 = "john Doe";
        String name2 = "jane Doe";

        greetStudent(name1);
        greetStudent(name2);

        System.out.println(isEven(20));

        System.out.println(multiply(5,2));

        System.out.println(add(3,4));

        System.out.println(add(3.5,4.3));

        System.out.println(subtract(31,9));

        System.out.println(makePositive(-28));
        System.out.println(makePositive(5));


    }
    // scope (static) RückgabeTyp name (ÜbergabeParameter) {}
    public static void greetStudent(String name) {

        System.out.println("Hallo," + name + " wie geht es dir?");
        System.out.println("Willkommen im Java Bootcamp");
    }

// ist die Zahl gerade oder ungerade
    public static boolean isEven(int number) {
        if (number % 2 == 0) { //% teilt so oft die 2 bis es nicht mehr geht
            return true;
        }else {
            return false;
        }
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    //Aufgabe
    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtract (int num1, int num2) {
        return num1 - num2;
    }

    public static int makePositive(int num) {
        if (num < 0) {
            return -num; // Gibt den positiven Wert der Zahl zurück
        } else {
            return num; // Gibt die Zahl unverändert zurück, wenn sie bereits positiv ist
        }
    }

    //Änderungen vornehmen um neu abzuspeichern
    public static int makePositive(int num) {
        if (num < 0) {
            return -num; // Gibt den positiven Wert der Zahl zurück
        } else {
            return num; // Gibt die Zahl unverändert zurück, wenn sie bereits positiv ist
        }
    }

}
