package com.nju.game;

import com.nju.game.hero.*;
import com.nju.game.hero.ability.AbstractAbility;
import com.nju.game.hero.factory.DefensiveHeroFactory;
import com.nju.game.hero.factory.OffensiveHeroFactory;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        DefensiveHeroFactory defensiveHeroFactory = new DefensiveHeroFactory();
        AbstractHero defensiveHero = defensiveHeroFactory.createHero();
        defensiveHero.show();
        System.out.println(defensiveHero.toString());
//        defensiveHero.getHeroAttribute().toString();

        OffensiveHeroFactory offensiveHeroFactory = new OffensiveHeroFactory();
        AbstractHero offensiveHero = offensiveHeroFactory.createHero();
        offensiveHero.show();
        System.out.println(offensiveHero.toString());
        ArrayList<AbstractAbility> abilities = offensiveHero.getAbilities();
        for(AbstractAbility abstractAbility:abilities){
            System.out.println(abstractAbility.toString());
        }
//        offensiveHero.getHeroAttribute().toString();
    }
}
