import java.util.Scanner;

public class CheckName {
    public static void CheckN(String name){ //метод проверки имени
        if (name.contains("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else System.out.println("Нет такого имени");
    }
}
