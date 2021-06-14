package learn.java.face2object;

/**
 * @author Administrator
 */
public class AdApHero extends Hero implements Ad, Ap{
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
