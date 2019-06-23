package base;

import java.util.Scanner;

/*
获取键盘输入的一个int数字：
int num = sc.nextInt();
获取键盘输入的一个字符串：
String str = sc.next();
 */
public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        // 首先得到前两个数字当中的最大值
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是：" + max);
    }

}
