package com.nju.game.hero.equipage;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;

/**
 * 盔甲装备
 */
public class Armor extends AbstractEquipage {
    private int armorPoint;
    private HeroComponent heroComponent;
    private HeroAttribute heroAttribute;

    public Armor() {
        this.name = "盔甲";
        this.level = 1;
        this.stoneNum = 1;
        this.armorPoint = 5;
    }

    public Armor(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }

//    public void setHeroComponent(HeroComponent heroComponent) {
//        this.heroComponent = heroComponent;
//    }

    @Override
    public void init() {
        this.name = "盔甲";
        this.level = 1;
        this.stoneNum = 1;
        this.armorPoint = 5;
    }

    @Override
    public void upgrade() {
        if (this.level < 7) {
            this.level++;
            this.armorPoint += 5 * level;
            this.stoneNum++;
        }

    }

    //    @Override
    public String getDesc() {
        return heroComponent.getDesc() + ",Armor";
    }

    //    @Override
    public HeroAttribute getHeroAttribute() {
//        HeroAttribute heroAttribute = heroComponent.getHeroAttribute();
//        int oldArmorPoint = heroAttribute.getArmorPoint(); //护甲值
//        int newArmorPoint = oldArmorPoint+this.armorPoint;
//        heroAttribute.setArmorPoint(newArmorPoint);
//        return heroAttribute;
//        return heroComponent.getHeroAttribute();
        return this.heroAttribute;
    }

    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldArmorPoint = oldHeroAttribute.getArmorPoint(); //护甲值
        int newArmorPoint = oldArmorPoint + this.armorPoint;
        oldHeroAttribute.setArmorPoint(newArmorPoint);
        this.heroAttribute = oldHeroAttribute;
    }
}
