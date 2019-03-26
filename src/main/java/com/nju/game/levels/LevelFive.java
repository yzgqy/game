package com.nju.game.levels;

import com.nju.game.Hero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/

public class LevelFive extends ILevel{

    private static final int level = 5;

    private static final float upRate = 10f;

    private static final int levelRate = 100;

    public LevelFive(Hero hero) {
        super(hero, level * levelRate);
    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp(Hero hero) {
        super.upgrade(hero, upRate);

        hero.setLevelState(new LevelSix(hero));

        return true;
    }


    public static void main(String[] args) {



    }


}
