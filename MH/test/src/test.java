import java.util.Random;
import java.util.Scanner;

public class test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i=0;i<5;i++){
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Mảng ban đầu: ");

        show(arr);
        int sum1=0;
        for (int j=0;j<arr.length;j++){
            sum1 = sum1 + arr[j];
        }
        System.out.println("Tổng mảng ban đầu: "+sum1);

        int sum2=0;
        int vitri = rd.nextInt(5);
        System.out.println("vị trí bỏ đi : "+ vitri);
        for (int j=0;j<arr.length;j++){
            if (j != vitri) {
                sum2 = sum2 + arr[j];
            }
        }
        System.out.println();
        System.out.println("Tổng mảng thứ 2: "+sum2);
        System.out.println("Giá trị phần tử: ");
        System.out.println(sum1 - sum2);
    }
    public static void show(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
