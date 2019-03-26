package com.nju.game.hero.ability;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 暴击技能
 */
@Getter
@Setter
@ToString
public class CritAbility extends AbstractAbility {
    private double critPoint;//暴击值
    private HeroComponent heroComponent;
    private HeroAttribute heroAttribute;

    public CritAbility() {
    }

    public CritAbility(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }
//    public void setHeroComponent(HeroComponent heroComponent) {
//        this.heroComponent = heroComponent;
//    }
    @Override
    public void upgrade() {
        if (this.level < 4) {
            this.level++;
            this.damage += 10 * level;
            this.mana += 5 * level;
            this.critPoint += 0.5 * level;
        }
    }

//    @Override
//    public String getDesc() {
//        return heroComponent.getDesc()+",CritAbility";
//    }

    //    @Override
    public HeroAttribute getHeroAttribute() {
//        HeroAttribute heroAttribute = heroComponent.getHeroAttribute();
//        int oldAttackPoint = heroAttribute.getAttackPoint(); //攻击力
//        int oldCurrentMana = heroAttribute.getCurrentMana();//当前法力值
//        int newAttackPoint = new Double(oldAttackPoint*this.critPoint+this.damage).intValue();
//        int newCurrentMana = oldCurrentMana - this.mana;
//        heroAttribute.setAttackPoint(newAttackPoint);
//        heroAttribute.setCurrentMana(newCurrentMana);
//        return heroAttribute;
//        return heroComponent.getHeroAttribute();
        return this.heroAttribute;
    }


    public String getDesc() {
        return heroComponent.getDesc() + ",CritAbility";
    }

    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldAttackPoint = oldHeroAttribute.getAttackPoint(); //攻击力
        int oldCurrentMana = oldHeroAttribute.getCurrentMana();//当前法力值
        int newAttackPoint = new Double(oldAttackPoint * this.critPoint + this.damage).intValue();
        int newCurrentMana = oldCurrentMana - this.mana;
        oldHeroAttribute.setAttackPoint(newAttackPoint);
        oldHeroAttribute.setCurrentMana(newCurrentMana);
        this.heroAttribute = oldHeroAttribute;
    }
}
