package com.nju.game.levels;

import com.nju.game.hero.AbstractHero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/

public class LevelEight extends AbstractLevel {

    private static final int level = 8;

    private static final float upRate = 10f;

    private static final int levelRate = 100;

    public LevelEight(AbstractHero hero) {
        super(hero, level * levelRate);
    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp(AbstractHero hero) {
        super.upgrade(hero, upRate);

        hero.setLevelState(new LevelNine(hero));

        return true;
    }

}
