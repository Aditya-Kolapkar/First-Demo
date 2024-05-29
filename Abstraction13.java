package AbstractionRule4;

abstract class Heart{
    abstract int test();
}
abstract class lungs extends Heart {
    @Override
    int test() {
        System.out.println("abstraction 4 Rule");
        return 0;
    }
}
public class Abstraction13 extends lungs {
    public static void main(String[] args) {
        System.out.println("Abstraction 4 Rule");
    }
}
