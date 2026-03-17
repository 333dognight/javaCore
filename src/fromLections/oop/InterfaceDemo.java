package fromLections.oop;

interface Shape {

    void square(); //abstract method

    default void circle() {
        System.out.println("This is the circle method");
    }

    static void rectangle() {
        System.out.println("This is the rectangle method");
    }
}

public class InterfaceDemo implements Shape {

    public void square() {
        System.out.println("This is the square - abstract method");
    }

    public static void main(String[] args) {

        InterfaceDemo intObj = new InterfaceDemo();

        intObj.square();
        intObj.circle();
        Shape.rectangle(); //static method can directly access from interface
        //OR
        Shape sh = new InterfaceDemo();
        sh.square();
        sh.circle();
        Shape.rectangle();
    }

}
