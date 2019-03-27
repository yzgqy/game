package com.nju.game.hero.equipage;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;

/**
 * 盔甲装备
 */
public class Armor extends AbstractEquipage {
    private int armorPoint;
    public Armor(){
        this.name = "盔甲";
        this.level = 1;
        this.stoneNum = 1;
        this.armorPoint = 5;
    }

    public Armor(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }

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

    public String getDesc() {
        return heroComponent.getDesc() + ",Armor";
    }

    public HeroAttribute getHeroAttribute() {
        return this.heroAttribute;
    }

    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldArmorPoint = oldHeroAttribute.getArmorPoint(); //护甲值
        int newArmorPoint = oldArmorPoint + this.armorPoint;
        HeroAttribute newHeroAttribute = new HeroAttribute();
        newHeroAttribute.copy(oldHeroAttribute);
        newHeroAttribute.setArmorPoint(newArmorPoint);
        this.heroAttribute = newHeroAttribute;
    }
}
