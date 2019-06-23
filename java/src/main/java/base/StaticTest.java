package base;
/*
 静态代码块的格式是：
 public class 类名称 {
 static {
 // 静态代码块的内容
 }
 }
 <p>
 特点：当第一次用到本类时，静态代码块执行唯一的一次。
 静态内容总是优先于非静态，所以静态代码块比构造方法先执行。
 <p>
 静态代码块的典型用途：
 用来一次性地对静态成员变量进行赋值。
 */

public class StaticTest {

    public static void main(String[] args) {
        // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("郭靖", 20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        System.out.println("============");

        Student two = new Student("黄蓉", 18);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
    }


}

class Student {

    private int id; // 学号
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 所在教室
    private static int idCounter = 0; // 学号计数器，每当new了一个新对象的时候，计数器++

    static {
        System.out.println("静态块运行了");
    }

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
