package base.annotation;



@Anno(value=12,per = Person.P1,anno2 = @Anno2,strs="bbb")
@Anno3
public class Worker {
    @Anno3
    public String name = "aaa";
    @Anno3
    public void show(){


    }
}
