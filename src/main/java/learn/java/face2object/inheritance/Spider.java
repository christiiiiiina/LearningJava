package learn.java.face2object.inheritance;

public class Spider extends Animal{

    public Spider(int legs){
        super(legs);
    }

    @Override
    public void eat(){
        System.out.println("吃东西");
    }
}
