import com.nju.game.hero.AbstractHero;
import com.nju.game.hero.factory.OffensiveHeroFactory;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/
public class TestLevel {

    public static void main(String[] args) {
        OffensiveHeroFactory offensiveHeroFactory = new OffensiveHeroFactory();
        AbstractHero offensiveHero = offensiveHeroFactory.createHero();

        System.out.println(offensiveHero.getHeroAttribute().toString());


        for (int i = 0; i < 11; i++) {
            offensiveHero.upgrade();
            System.out.println(offensiveHero.getHeroAttribute().toString());

        }


    }
}
