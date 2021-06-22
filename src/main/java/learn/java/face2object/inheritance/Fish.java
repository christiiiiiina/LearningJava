package learn.java.face2object.inheritance;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void walk(int legs) {
        System.out.println("没有腿不能走路");
    }

    @Override
    public void play() {
        System.out.println("玩耍");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
