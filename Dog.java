public class Dog extends Animal {
    Dog(String name, int age){
        super(name,age);
    }

    @Override
    public String toString() {
        return "I am a Dog, my name is " + name + ", I'm " + age + " years old.";
    }
}
