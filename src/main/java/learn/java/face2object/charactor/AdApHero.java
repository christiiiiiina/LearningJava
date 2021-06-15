package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class AdApHero extends Hero implements Ad, Ap, Mortal {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die(){
        System.out.println("混合英雄死亡");
    }
}
