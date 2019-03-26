package com.nju.game.hero.ability;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.decortor.HeroComponent;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 眩晕技能
 */
@Getter
@Setter
@ToString
public class StunAbility extends AbstractAbility {
    private double stubRate;//眩晕概率
    private HeroComponent heroComponent;
    private HeroAttribute heroAttribute;

    public StunAbility(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }
//    public void setHeroComponent(HeroComponent heroComponent) {
//        this.heroComponent = heroComponent;
//    }
    public StunAbility() {
    }

    @Override
    public void upgrade() {
        if (this.level < 4) {
            this.level++;
            this.damage += 5 * level;
            this.mana += 6 * level;
            this.stubRate += 0.3 * level;
        }
    }

    //    @Override
    public String getDesc() {
        return heroComponent.getDesc() + ",StunAbility";
    }

    //    @Override
    public HeroAttribute getHeroAttribute() {
//        HeroAttribute heroAttribute = heroComponent.getHeroAttribute();
//        int oldAttackPoint = heroAttribute.getAttackPoint(); //攻击力
//        int oldCurrentMana = heroAttribute.getCurrentMana();//当前法力值
//        int newAttackPoint = oldAttackPoint+this.damage;
//        int newCurrentMana = oldCurrentMana - this.mana;
//        heroAttribute.setAttackPoint(newAttackPoint);
//        heroAttribute.setCurrentMana(newCurrentMana);
//        return heroAttribute;
//        return heroComponent.getHeroAttribute();
        return this.heroAttribute;
    }


    @Override
    public void setHeroAttribute() {
        HeroAttribute oldHeroAttribute = heroComponent.getHeroAttribute();
        int oldAttackPoint = oldHeroAttribute.getAttackPoint(); //攻击力
        int oldCurrentMana = oldHeroAttribute.getCurrentMana();//当前法力值
        int newAttackPoint = oldAttackPoint + this.damage;
        int newCurrentMana = oldCurrentMana - this.mana;
        oldHeroAttribute.setAttackPoint(newAttackPoint);
        oldHeroAttribute.setCurrentMana(newCurrentMana);
        this.heroAttribute = oldHeroAttribute;
    }
}
