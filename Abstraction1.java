package AbstractionRule4;

abstract class Rule1{
    abstract void test();
}
abstract class demo extends Rule1{
  void test() {
      System.out.println("Hello");
    }
}

public class Abstraction1   {
    public static void main(String[] args) {
        System.out.println("Rule 4");


    }

}
