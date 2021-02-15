import java.io.*;
import java.io.Writer;
public class test {
    public static void main(String[] args) {
        show(new B());
        A aa=new A();
        aa.a();



    }
    public static void show(A test){
        test.a();
        
    }
}
class A{
    int a;
    public A(){
//        System.out.println("A");
    }

    public void a(){
        System.out.println("A");

    }
}
class B extends A{
    int b;
    public B(){
//        System.out.println("B");
    }
    public B(int b){
        this.b=b;
    }
    public void b(){
        System.out.println("B");
    }
}
