package AbstractionRule4;

abstract class Rule10{
    abstract char test();

}
abstract class K extends Rule10{
    char test(){
        System.out.println("this is a 4th rule of abstraction");
        return 2;
    }
}
public class Abstraction10 {
    public static void main(String[] args) {

    }
}
