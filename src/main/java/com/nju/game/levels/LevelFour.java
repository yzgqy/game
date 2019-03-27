package com.nju.game.levels;


import com.nju.game.hero.AbstractHero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/

public class LevelFour extends AbstractLevel {

    private static final int level = 4;

    private static final float upRate = 10f;

    private static final int levelRate = 100;

    public LevelFour(AbstractHero hero) {
        super(hero, level * levelRate);
    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp(AbstractHero hero) {
        super.upgrade(hero, upRate);

        learnSkill(hero);

        hero.setLevelState(new LevelFive(hero));

        return true;
    }

    public void learnSkill(AbstractHero hero) {
        // TODO: 2019/3/26
        System.out.println("learn skill 4-->5");
    }



}
