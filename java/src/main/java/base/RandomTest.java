package base;

import java.util.Random;
import java.util.Scanner;

/*
使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）： int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2
 */
public class RandomTest {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        // 范围实际上是[0,9]
        System.out.println(r.nextInt(10));

        // 范围实际上是[1,10]
        System.out.println(r.nextInt(10) + 1);

        // 猜数字 【1,10]
        int randomNum = r.nextInt(10) + 1; // [
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试。");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break;
            }
        }
        System.out.println("游戏结束。");

    }

}
