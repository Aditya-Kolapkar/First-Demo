package AbstractionRule4;

abstract class Rule3{
    abstract char display();

}
abstract class Help extends Rule3{
    char display(){
        System.out.println("this  is a 4th rule of abstraction ");
        return 10;
    }
}

public class Abstraction3 {
    public static void main(String[] args) {

    }
}
