package learn.java.face2object;

/**
 * @author Administrator
 */
public class AdHero extends Hero implements Ad {

    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
}
