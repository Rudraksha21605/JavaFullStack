class Animal {
    void move(){
        System.out.println("Animal is barking");
    }
    void eating(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    @Override void move(){
        System.out.println("Dog is running");
    }
    void eating(){
        System.out.println("Dog is eating");
    }
}
class Overriding{
    public static void main(String[] args){
        Dog d=new Dog();
        d.move();
        d.eating();
    }
}
