package base;

/*
继承关系中，父子类构造方法的访问特点：

1. 子类构造方法当中有一个默认隐含的“super()”调用，所以一定是先调用的父类构造，后执行的子类构造。
2. 子类构造可以通过super关键字来调用父类重载构造。
3. super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造。
总结：
子类必须调用父类构造方法，不写则赠送super()；写了则用写的指定的super调用，super只能有一个，还必须是第一个。
 */
public class ExtendsConstructor {

    public static void main(String[] args) {
        Zi2 zi = new Zi2();
    }

}

class Fu2 {

    public Fu2() {
        System.out.println("父类无参构造");
    }

    public Fu2(int num) {
        System.out.println("父类有参构造！");
    }

}

class Zi2 extends Fu2 {

    public Zi2() {
        super(); // 在调用父类无参构造方法
//        super(20); // 在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void method() {
//        super(); // 错误写法！只有子类构造方法，才能调用父类构造方法。
    }

}

