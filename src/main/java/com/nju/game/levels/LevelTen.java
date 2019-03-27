package com.nju.game.levels;


import com.nju.game.hero.AbstractHero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/

public class LevelTen extends AbstractLevel {

    private static final int level = 10;

    private static final float upRate = 10f;

    private static final int levelRate = 100;

    public LevelTen(AbstractHero hero) {
        super(hero, level * levelRate);
    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp(AbstractHero hero) {

        return false;
    }



}
