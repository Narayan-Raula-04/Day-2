class Parent {
    void show() {
        System.out.println("Parent class mathod");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }

}
