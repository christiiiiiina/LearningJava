package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class ApHero extends Hero implements Ap, Mortal {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die(){
        System.out.println("魔法英雄死亡");
    }
}
