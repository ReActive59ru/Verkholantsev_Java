import java.util.Scanner;

public class ArrayMod {

    public static void CheckArray(){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[]array = new int[length];

        System.out.println("Введите массив: ");
        for(int i = 0; i<length; i++){ //создание нового массива
            array[i] = in.nextInt();
            }
        System.out.println("Элементы массива кратные 3м: ");
        for(int i = 0; i< length;i++){
            if (array[i]%3==0){ //проверяем кратность 3м и сразу выводим в консоль
                System.out.println(array[i]);
            }
        }
    }
}
