package com.nju.game.hero.equipage;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;

/**
 * 武器装备
 */
public class Weapony extends AbstractEquipage {
    private int damage;//伤害值

    public Weapony(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }

    @Override
    public void init() {
        this.name = "武器";
        this.level = 1;
        this.stoneNum = 1;
        this.damage = 5;
    }

    @Override
    public void upgrade() {
        if (this.level < 7) {
            this.level++;
            this.damage += 5 * level;
            this.stoneNum++;
        }

    }

    public String getDesc() {
        return heroComponent.getDesc() + ",Weapony";
    }

    public HeroAttribute getHeroAttribute() {
        return this.heroAttribute;
    }

    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldAttackPoint = oldHeroAttribute.getAttackPoint();//攻击力
        int newAttackPoint = oldAttackPoint + this.damage;
        HeroAttribute newHeroAttribute = new HeroAttribute();
        newHeroAttribute.copy(oldHeroAttribute);
        newHeroAttribute.setAttackPoint(newAttackPoint);
        this.heroAttribute = newHeroAttribute;
    }
}
