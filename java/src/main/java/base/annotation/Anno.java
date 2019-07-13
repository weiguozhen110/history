package base.annotation;


public @interface Anno {

     int value();
    Person per();
    Anno2 anno2();
    String[] strs();
     /*String name() default "张三";*/
     /*String show2();

     Person per();
     Anno2 anno2();

     String[] strs();*/


}
