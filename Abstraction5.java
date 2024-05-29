package AbstractionRule4;

abstract class Rule5{
    abstract long test();

}
abstract class Text extends Rule5{
    long test(){
        System.out.println("this is a 4th  rule of abstraction ");
        return 2;
    }

}
public class Abstraction5 {
    public static void main(String[] args) {

    }
}
