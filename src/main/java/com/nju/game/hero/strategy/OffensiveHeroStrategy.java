package com.nju.game.hero.strategy;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.ability.AbstractAbility;
import com.nju.game.hero.ability.CritAbility;
import com.nju.game.hero.ability.StunAbility;

import java.util.ArrayList;

/**
 * 进攻型英雄策略
 */
public class OffensiveHeroStrategy implements HeroStrategy {
    public void initMethod(HeroAttribute heroAttribute, ArrayList<AbstractAbility> abilities) {
        heroAttribute.setAttackPoint(60);
        heroAttribute.setArmorPoint(15);
        heroAttribute.setCurrentHealthPoint(600);
        heroAttribute.setTotalHealthPoint(600);
        heroAttribute.setLevel(1);
        heroAttribute.setCurrentXP(0);
//        heroAttribute.setLevelXP(1000);
        heroAttribute.setCurrentMana(500);
        heroAttribute.setLevelMana(500);

        CritAbility critAbility = new CritAbility();
        critAbility.setName("暴击技能");
        critAbility.setType(2);
        critAbility.setLevel(1);
        critAbility.setDamage(10);
        critAbility.setCooldown(3);
        critAbility.setMana(60);
        critAbility.setCritPoint(1.2);
        StunAbility stunAbility = new StunAbility();
        stunAbility.setName("眩晕技能");
        stunAbility.setType(1);
        stunAbility.setLevel(1);
        stunAbility.setDamage(5);
        stunAbility.setCooldown(2);
        stunAbility.setMana(50);
        stunAbility.setStubRate(0.2);
        abilities.add(critAbility);
        abilities.add(stunAbility);
    }
    public void attackMethod(HeroAttribute hero) {

    }
}
