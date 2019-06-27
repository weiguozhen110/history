package base.transfor;

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class TransformInstanceof {

    public static void main(String[] args) {
        TransformAnimal animal = new TransformDog(); // 本来是一只狗
        animal.eat(); // 狗吃SHIT

        // 如果希望掉用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof TransformDog) {
            TransformDog transformDog = (TransformDog) animal;
            transformDog.watchHouse();
        }
        // 判断一下animal本来是不是Cat
        if (animal instanceof TransformCat) {
            TransformCat transformCat = (TransformCat) animal;
            transformCat.catchMouse();
        }

        giveMeAPet(new TransformDog());
    }

    public static void giveMeAPet(TransformAnimal animal) {
        if (animal instanceof TransformDog) {
            TransformDog transformDog = (TransformDog) animal;
            transformDog.watchHouse();
        }
        if (animal instanceof TransformCat) {
            TransformCat transformCat = (TransformCat) animal;
            transformCat.catchMouse();
        }
    }

}
