package com.nju.game.levels;

import com.nju.game.hero.AbstractHero;

/**
 * @author: eumes
 * @date: 2019/3/26
 **/
public abstract class AbstractLevel {

    AbstractLevel() {

    }

    public AbstractLevel(AbstractHero hero, int exp) {
        this();
        hero.getHeroAttribute().setLevelXP(exp);
        hero.getHeroAttribute().setLevel(hero.getHeroAttribute().getLevel() + 1);
    }


    public abstract int getLevel();

    public abstract boolean levelUp(AbstractHero hero);

    //升级的状态转换
    protected void upgrade(AbstractHero hero, float upRate){
        //升级攻击力、护甲值、总生命值、总法力值(
        hero.getHeroAttribute().setAttackPoint(Math.round(hero.getHeroAttribute().getAttackPoint() + hero.getHeroAttribute().getAttackPoint() * upRate / 100) );
        hero.getHeroAttribute().setArmorPoint(Math.round(hero.getHeroAttribute().getArmorPoint() + hero.getHeroAttribute().getArmorPoint() * upRate / 100) );
        hero.getHeroAttribute().setTotalHealthPoint(Math.round(hero.getHeroAttribute().getTotalHealthPoint() + hero.getHeroAttribute().getTotalHealthPoint() * upRate / 100));
        hero.getHeroAttribute().setLevelMana(Math.round (hero.getHeroAttribute().getLevelMana() + hero.getHeroAttribute().getLevelMana() * upRate / 100));

        //回满生命值、法力值
        hero.getHeroAttribute().setCurrentHealthPoint(hero.getHeroAttribute().getTotalHealthPoint());
        hero.getHeroAttribute().setCurrentMana(hero.getHeroAttribute().getLevelMana());
    }
}
