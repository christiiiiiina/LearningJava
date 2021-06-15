package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class AdHero extends Hero implements Ad, Mortal {

    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    @Override
    public void die(){
        System.out.println("物理英雄死亡");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        AdHero.battleWin();
    }
}
