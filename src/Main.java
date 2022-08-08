import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = newArr();
        System.out.print("Phần tử nhỏ nhất trong mảng: " + findMinArr(arr));
    }

    public static int[] newArr() {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Nhập độ dài của mảng");
        length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ" + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMinArr(int[] arr) {
        int min;
        min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }

        }
        return min;

    }
}
