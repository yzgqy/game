package com.nju.game.hero.equipage;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;

/**
 * 武器装备
 */
public class Weapony extends AbstractEquipage {
    private int damage;//伤害值
    private HeroComponent heroComponent;
    private HeroAttribute heroAttribute;

    public Weapony() {
    }

    public Weapony(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }
//    public void setHeroComponent(HeroComponent heroComponent) {
//        this.heroComponent = heroComponent;
//    }
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

    //    @Override
    public String getDesc() {
        return heroComponent.getDesc() + ",Weapony";
    }

    //    @Override
    public HeroAttribute getHeroAttribute() {
//        HeroAttribute heroAttribute = heroComponent.getHeroAttribute();
//        int oldAttackPoint = heroAttribute.getAttackPoint();//攻击力
//        int newAttackPoint = oldAttackPoint+this.damage;
//        heroAttribute.setAttackPoint(newAttackPoint);
//        return heroAttribute;
//        return heroComponent.getHeroAttribute();
        return this.heroAttribute;
    }

    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldAttackPoint = oldHeroAttribute.getAttackPoint();//攻击力
        int newAttackPoint = oldAttackPoint + this.damage;
        oldHeroAttribute.setAttackPoint(newAttackPoint);
        this.heroAttribute = oldHeroAttribute;
    }
}
