public class Cat extends Animal {
    Cat(String name,int age){
        super(name, age);
    }
    @Override
    public String toString() {
        return "I am a Cat, my name is " + name + ", I'm " + age + " years old.";
    }
}
