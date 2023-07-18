import org.w3c.dom.css.CSSImportRule;

import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        findCountSort(array);
    }

    private static void findCountSort(int[] array) {
        int[] count = new int[10];
        for (int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for (int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        for (int i = 0; i< 10; i++){
            for (int j = 0 ; j < count[i]; j++){
                System.out.println(i+" ");
            }
        }
    }
}
