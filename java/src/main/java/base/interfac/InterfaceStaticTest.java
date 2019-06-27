package base.interfac;

/*
注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名(参数);
 */
public class InterfaceStaticTest {

    public static void main(String[] args) {
        // 创建了实现类对象
        InterfaceStaticImpl impl = new InterfaceStaticImpl();

        // 错误写法！
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        InterfaceStatic.methodStatic();
    }

}
