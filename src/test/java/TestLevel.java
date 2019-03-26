import com.nju.game.Hero;
import com.nju.game.levels.ILevel;
import com.nju.game.levels.LevelOne;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/
public class TestLevel {

    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setAttackPoint(15);
        hero.setArmorPoint(5);
        hero.setTotalHealthPoint(100);
        hero.setCurrentHealthPoint(100);
        hero.setCurrentMana(50);
        hero.setCurrentXP(0);
        hero.setLevelMana(50);

        ILevel levelOne = new LevelOne(hero);

        System.out.println(hero.toString());


    }
}
