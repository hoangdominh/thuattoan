import java.util.Random;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhập số phần tử của dãy: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = rd.nextInt(1001);
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int sum=0;
        for (int i : arr){
            sum = sum+i;
        }
        System.out.println("Tổng của dãy: "+sum);
    }
}
