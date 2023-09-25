package Exeption;

import java.io.IOException;

class Parent{
    void foo() {

    }
}
class Child extends Parent{
    @Override
    void foo() throws RuntimeException {
        super.foo();

    }
}
public class OveriddingEx {
    public static void main(String[] args) {

    }
}
