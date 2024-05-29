package AbstractionRule4;

abstract class Rule4{
    abstract byte show();

}
abstract class Demo extends Rule4{
    byte show(){
        System.out.println("this is a 4th rule of abstraction");
        return 1;
    }
}

public class abstraction4 {
    public static void main(String[] args) {

    }
}
