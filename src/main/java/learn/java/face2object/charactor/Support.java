package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class Support extends Hero implements Healer{
    @Override
    public void heal() {
        System.out.println("进行治疗回血");
    }

    @Override
    public void attack(){
        System.out.println("进行伤害很低的攻击");
    }
}
