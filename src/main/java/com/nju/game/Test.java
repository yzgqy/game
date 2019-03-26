package com.nju.game;

import com.nju.game.hero.AbstractHero;
import com.nju.game.hero.OffensiveHero;
import com.nju.game.hero.ability.AbstractAbility;
import com.nju.game.hero.decortor.HeroComponent;
import com.nju.game.hero.equipage.AbstractEquipage;
import com.nju.game.hero.equipage.Armor;
import com.nju.game.hero.equipage.Weapony;
import com.nju.game.hero.factory.OffensiveHeroFactory;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("=====创建进攻型英雄=====");
        OffensiveHeroFactory offensiveHeroFactory = new OffensiveHeroFactory();
        AbstractHero offensiveHero = offensiveHeroFactory.createHero();
        System.out.println(offensiveHero.toString());
        System.out.println("属性值：");
        System.out.println(offensiveHero.getHeroAttribute().toString());
        System.out.println("=====创建完成=====");

        System.out.println("=====装备盔甲和武器=====");
        AbstractEquipage equipage = new Armor(offensiveHero);
        equipage.init();
        equipage.setHeroAttribute();
        equipage = new Weapony(equipage);
        equipage.init();
        equipage.setHeroAttribute();
        System.out.println("属性值：");
        System.out.println(equipage.getHeroAttribute().toString());
        System.out.println("=====装备完成=====");

        System.out.println("=====使用暴击技能=====");
        ArrayList<AbstractAbility> abilities = offensiveHero.getAbilities();
        abilities.get(0).setHeroComponent(equipage);
        abilities.get(0).setHeroAttribute();
        System.out.println("属性值：");
        System.out.println(abilities.get(0).getHeroAttribute().toString());
        System.out.println("=====使用眩晕技能=====");
        abilities.get(1).setHeroComponent(equipage);
        abilities.get(1).setHeroAttribute();
        System.out.println("属性值：");
        System.out.println(abilities.get(1).getHeroAttribute().toString());
        System.out.println("=====技能使用完成=====");


    }
}
