package com.nju.game.levels;

import com.nju.game.Hero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/

public class LevelTwo extends ILevel{

    private static final int level = 2;

    private static final float upRate = 10f;

    private static final int levelRate = 100;

    public LevelTwo(Hero hero) {
        super(hero, level * levelRate);
    }

    public int getLevel() {
        return level;
    }

    public boolean levelUp(Hero hero) {
        super.upgrade(hero, upRate);

        learnSkill(hero);

        hero.setLevelState(new LevelThree(hero));

        return true;
    }

    public void learnSkill(Hero hero) {
        // TODO: 2019/3/26
        System.out.println("learn skill 2-->3");
    }

    public static void main(String[] args) {



    }


}
