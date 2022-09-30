//Một cặp số nguyên dương được gọi là số bạn bè nếu tổng các ước số của số này bằng chính số kia. Ví dụ 220 và 284 là cặp số bạn bè vì tổng các ước số của 220 là: 1+2+4+5+10+11+20+22+44+55+110=284 và tổng các ước số của 284 là 1+2+4+71+142=220. 1184 và 1210 cũng là hai số bạn bè. Hãy viết chương trình kiểm tra xem 2 số nhập vào có phải là số bạn bè hay không.
//
//Dữ liệu nhập:
//
//- Là hai số nguyên a, b cách nhau một khoảng trắng (1 ≤ a, b ≤ 105)
//
//Dữ liệu xuất:
//
//- In ra YES nếu a, b là hai số bạn bè. In ra NO nếu không phải.

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum1=0;
        int sum2=0;
        for (int i=1;i<a;i++){
            if (a%i==0){
                System.out.print(i+" ");
                sum1=sum1+i;
            }
        }
        System.out.println();
        System.out.println("Tổng các ước số của số a: "+sum1);
        for (int j=1;j<b;j++){
            if(b%j==0){
                System.out.print(j+ " ");
                sum2=sum2+j;
            }
        }
        System.out.println();
        System.out.println("Tổng các ước số của số a: "+sum2);
        if (sum1 ==b && sum2==a){
            System.out.println("YES - "+a+" và "+b+" là 2 số bạn bè");
        }else {
            System.out.println("NO - "+a+" và "+b+" không là 2 số bạn bè");
        }

    }
}
