package base;

public class ExtendsPhone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("==========");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }

}


// 定义一个新手机，使用老手机作为父类
 class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}

// 本来的老款手机
class Phone {

    public void call() {
        System.out.println("打电话");
    }

    public void send() {
        System.out.println("发短信");
    }

    public void show() {
        System.out.println("显示号码");
    }

}

