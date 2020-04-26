package KuliahPackage.Thread;

class Dog extends Animal { }

class Animal extends Exception{ }

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            throw new Dog();
        }catch (Dog d){
            System.out.println("new Dog() -> Animal: Exception");
        }catch (Animal a){
            System.out.println("new Animal: Exception");
        }
    }
}
