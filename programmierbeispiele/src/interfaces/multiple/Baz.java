package interfaces.multiple;

interface Foo {
    void foo();
}

interface Bar {
    void bar();
}

public class Baz implements Foo, Bar {
    public void foo() {
        System.out.println("customExceptionClasses!");
    }
    public void bar() {
        System.out.println("bar!");
    }
}