public class Animal {

    protected String name = "";
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am Animal.";
    }
}
