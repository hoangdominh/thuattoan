import java.util.Scanner;

import static java.lang.Math.sqrt;

// SỐ HOÀN HẢO
//Số hoàn hảo là số có tổng các ước số bằng chính nó. Ví dụ 28 là số hoàn hảo (28 = 1+2+4+7+14).
//
//Cho một số nguyên n, hãy kiểm tra xem n có phải là số hoàn hảo hay không.
//
//Dữ liệu nhập:
//
//- Là số nguyên n (2 ≤ n ≤ 107)
//
//Dữ liệu xuất:
//- Nếu n là số hoàn hảo in ra YES. Nếu không in ra NO.
public class test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn : ");
        int n = scanner.nextInt();
        int sum =0;
        for (int i = 1; i<n; i++){
            if (n%i==0){
                System.out.println(i);
                sum = sum +i;
            }
        }

        if (n==sum){
            System.out.println("YES - Đây là số hoàn hảo");
        }else {
            System.out.println("NO - Đây không là số hoàn hảo");
        }
    }
}
