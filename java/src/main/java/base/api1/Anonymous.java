package base.api1;

import java.util.Scanner;

public class Anonymous {

    public static void main(String[] args) {
        // 普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

        // 匿名对象的方式
        num = new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + num);
    }

}
