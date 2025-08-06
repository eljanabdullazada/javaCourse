package test;

public class PractiseConstructorChaining {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Grandparent {
    Grandparent() {
        System.out.println("Grandparent constructor called");
    }
}

class Parent extends Grandparent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called");
    }
}
