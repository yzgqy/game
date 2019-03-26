package com.nju.game;

public class OffensiveHeroStrategy implements HeroStrategy{
    public void initMethod(Hero hero) {
        hero.setAttackPoint(60);
        hero.setArmorPoint(10);
        hero.setCurrentHealthPoint(600);
        hero.setTotalHealthPoint(600);
        hero.setLevel(1);
        hero.setCurrentXP(0);
        hero.setLevelXP(1000);
        hero.setCurrentMana(500);
        hero.setLevel(500);
    }
    public void attackMethod(Hero hero) {

    }
}
