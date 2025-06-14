import java.util.Arrays;

public class Oops {

    public static void main(String[] args) {
        Copy_Constructor h1 = new Copy_Constructor();
        for (int i = 0; i < h1.marks.length; i++) {
            h1.marks[i] = i * 10;
        }

        Copy_Constructor h2 = new Copy_Constructor(h1);
        h2.marks[0] = 90;
        System.out.println(h1.marks[0]);
        Bear b1 = new Bear();
        b1.veg();
    }
}

class BasicOops {
    String color;
    int num;

    BasicOops() {
        System.out.println("contructor called");
    }

    BasicOops(int num) {
        System.out.println("contructor called setting values");
        this.num = num;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

}

class Copy_Constructor {
    String name;
    int age;
    int marks[];

    // Default constructor
    Copy_Constructor() {
        this.marks = new int[3];
    }

    // Copy constructor
    Copy_Constructor(Copy_Constructor h1) {
        this.name = h1.name;
        this.age = h1.age;
        this.marks = new int[h1.marks.length]; // allocate memory
        for (int i = 0; i < h1.marks.length; i++) {
            this.marks[i] = h1.marks[i]; // copy values
        }
    }
}

interface Herbivore {
    void veg();

}

interface Carnivore {
    void nonveg();

}

class Bear implements Herbivore, Carnivore {
    public void veg() {
        System.out.println("i eat veg");
    }

    public void nonveg() {
        System.out.println("i eat nonveg");
    }
}