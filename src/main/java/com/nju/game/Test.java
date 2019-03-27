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
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("=====创建进攻型英雄=====");
        OffensiveHeroFactory offensiveHeroFactory = new OffensiveHeroFactory();
        AbstractHero offensiveHero = offensiveHeroFactory.createHero();
        System.out.println("属性值：");
        System.out.println(offensiveHero.getHeroAttribute().toString());
        System.out.println("=====创建完成=====");

        //?是否需要工厂模式
        AbstractEquipage armor = new Armor();
        AbstractEquipage weapony = new Weapony();
        List<AbstractEquipage> equipageList = new ArrayList<AbstractEquipage>();
        equipageList.add(armor);
        equipageList.add(weapony);
        offensiveHero.setEquipages(equipageList);//英雄佩戴盔甲和武器

        ///////////开始战斗时，用装备装饰英雄/////////////////
        List<AbstractEquipage> equipages = offensiveHero.getEquipages();
        equipages.get(0).setHeroComponent(offensiveHero);
        equipages.get(0).setHeroAttribute();
        int size = equipages.size();
        for(int i =1;i<size;i++){
            equipages.get(i).setHeroComponent(equipages.get(i-1));
            equipages.get(i).setHeroAttribute();
        }
        AbstractEquipage equipagePackage = equipages.get(size-1);
        System.out.println("=====开始战斗时，用装备装饰英雄:=====");
        System.out.println(equipagePackage.getHeroAttribute());


//        System.out.println("=====装备盔甲和武器=====");
//        AbstractEquipage equipage = new Armor(offensiveHero);
//        equipage.init();
//        equipage.setHeroAttribute();
//        equipage = new Weapony(equipage);
//        equipage.init();
//        equipage.setHeroAttribute();
//        System.out.println("属性值：");
//        System.out.println(equipage.getHeroAttribute().toString());
//        System.out.println("=====装备完成=====");

//        System.out.println("=====使用暴击技能=====");
//        ArrayList<AbstractAbility> abilities = offensiveHero.getAbilities();
//        abilities.get(0).setHeroComponent(equipage);
//        abilities.get(0).setHeroAttribute();
//        System.out.println("属性值：");
//        System.out.println(abilities.get(0).getHeroAttribute().toString());
//        System.out.println("=====使用眩晕技能=====");
//        abilities.get(1).setHeroComponent(equipage);
//        abilities.get(1).setHeroAttribute();
//        System.out.println("属性值：");
//        System.out.println(abilities.get(1).getHeroAttribute().toString());
//        System.out.println("=====技能使用完成=====");


    }
}
