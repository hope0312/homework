package BoxTester;

import java.util.Scanner;

public class BoxBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        int number = 0;
        do {
            System.out.println("Please enter object's length:");
            float length = scanner.nextFloat();
            System.out.println("Please enter object's width:");
            float width = scanner.nextFloat();
            System.out.println("Please enter object's height:");
            float height = scanner.nextFloat();

            if (box3.validate(length, width, height))
                System.out.println("Box3");
            else if (box5.validate(length, width, height))
                System.out.println("Box5");
            else
                System.out.println("no Box for you ?");
            System.out.println("if input -1 out else keep");
            number = scanner.nextInt();
            if(number == -1)
                System.out.println("see u !!!");
        }while (number !=-1);
    }
}
