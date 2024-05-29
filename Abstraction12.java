package AbstractionRule4;



abstract class You{
    abstract void test();
}
abstract class me extends You{
    @Override
    void test() {
        System.out.println("Abstraction 4 Rule");

    }
}
public class Abstraction12 extends me {
    public static void main(String[] args) {
        System.out.println("Abstraction 4rule");

    }
}
