package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class AdHero extends Hero implements Ad, Mortal {
    int moveSpeed = 400;

    public AdHero(){
        System.out.println("AD hero的构造方法");
    }

    public AdHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

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
        AdHero h = new AdHero("德莱文");
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
        Hero.battleWin();
        AdHero.battleWin();
    }
}
