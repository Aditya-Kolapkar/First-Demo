package AbstractionRule4;

abstract class Rule2{
    abstract int test();

}
abstract class Dummy extends Rule2{
    int test(){
        System.out.println("this is a 4th rule of abstraction");
        return 10;
    }
}
public class Abstraction2 extends Dummy{
    public static void main(String[] args) {
        Abstraction2 obj =new Abstraction2();
        obj.test();


    }
}
