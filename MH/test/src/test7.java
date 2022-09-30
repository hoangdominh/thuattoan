//Nam thường xuyên tham gia thi lập trình trên mạng. Vì đạt được thành tích cao nên Nam được gửi tặng một phần mềm diệt virus. Nhà sản xuất phần mềm cung cấp cho Nam một mã số là một số nguyên dương N có không quá 255 chữ số. Để cài đặt được phần mềm, Nam phải nhập vào mật khẩu của phần mềm. Mật khẩu là một số nguyên dương M được tạo ra bằng cách tính tổng giá trị các chữ số của N.
//
//Yêu cầu: Hãy tìm số nguyên dương M.
//
//Dữ liệu nhập:
//
//- Ghi số nguyên dương N (1 ≤ N < 10255).
//
//Dữ liệu xuất:
//
//- Ghi số nguyên dương M tìm được.

// TỔNG CÁC CHỮ SỐ TRONG N

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương: ");
        n = scanner.nextInt();
        while (n>0){
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }
        System.out.println("Tổng các chữ số = " + tong);

    }
}
