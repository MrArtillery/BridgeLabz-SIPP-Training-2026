class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class PersonDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Ankur", 21);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
