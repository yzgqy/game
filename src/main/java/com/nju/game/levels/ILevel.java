package com.nju.game.levels;

import com.nju.game.Hero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/
public abstract class ILevel {

    ILevel() {

    }

    public ILevel(Hero hero, int exp) {
        this();
        hero.setLevelXP(exp);
    }


    public abstract int getLevel();

    public abstract boolean levelUp(Hero hero);

    //升级的状态转换
    public void upgrade(Hero hero, float upRate){
        //升级攻击力、护甲值、总生命值、总法力值
        hero.setAttackPoint((int)(hero.getAttackPoint() + hero.getAttackPoint() * upRate / 100) );
        hero.setArmorPoint((int)(hero.getArmorPoint() + hero.getArmorPoint() * upRate / 100) );
        hero.setTotalHealthPoint((int) (hero.getTotalHealthPoint() + hero.getTotalHealthPoint() * upRate / 100));
        hero.setLevelMana((int) (hero.getLevelMana() + hero.getLevelMana() * upRate / 100));

        //回满生命值、法力值
        hero.setCurrentHealthPoint(hero.getTotalHealthPoint());
        hero.setCurrentMana(hero.getLevelMana());
    }
}
