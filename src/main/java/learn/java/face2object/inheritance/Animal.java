package learn.java.face2object.inheritance;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    protected Animal(){
        System.out.println("这个动物没有腿");
    }

    public abstract void eat();

    public void walk(int legs){
        System.out.printf("use %s legs to walk%n", legs);
    }
}
