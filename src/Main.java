import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Введите число: ");
            int num = in.nextInt();
            CheckNumber.CheckNum(num);

            System.out.println("Введите имя: ");
            String name = in.next();
            CheckName.CheckN(name);

            System.out.println("Введите длину массива: ");
            ArrayMod.CheckArray();



    }
}