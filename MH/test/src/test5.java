//Cho số nguyên n, hãy tính n!
//
//Dữ liệu nhập:
//
//- Là số nguyên n (1 ≤ n ≤ 17)
//
//Dữ liệu xuất:
//
//- Giá trị của n! . Chú ý rằng số này có thể rất lớn nên dùng kiểu long long.

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số bất kì bạn muốn tính giai thừa: ");
        int m = scanner.nextInt();
        System.out.println("Giai thừa của "+m+" là: "+test5.tinhGiaiThua(m));

    }
    public static long tinhGiaiThua(int n){
        long giaiThua = 1;
        if (n==0 || n==1){
            return giaiThua;
        }
        else {
            for (int i=2;i<n;i++){
                giaiThua =giaiThua*i;
            }
            return giaiThua;
        }
    }

}
