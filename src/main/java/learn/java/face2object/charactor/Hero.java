package learn.java.face2object.charactor;

/**
 * @author Administrator
 */
public class Hero {
    private String name;
    private int hp;
    private float armor;

    public void kill(Mortal m){
        m.die();
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public static void main(String[] args) {
        AdHero ad = new AdHero();
        ApHero ap = new ApHero();
        AdApHero adap = new AdApHero();
        Hero garen = new Hero();

        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);
    }
}
