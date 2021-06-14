package learn.java.face2object;

/**
 * @author Administrator
 */
public class ApHero extends Hero implements Ap{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
