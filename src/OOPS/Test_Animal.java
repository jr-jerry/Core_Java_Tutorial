package OOPS;

public class Test_Animal {
    static void main(String[] args) {
        Animal animalImpl=()->{
            System.out.println("Lion Eat");
        };
        animalImpl.eat();
    }
}
