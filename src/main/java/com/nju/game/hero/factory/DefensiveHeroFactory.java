package com.nju.game.hero.factory;

import com.nju.game.hero.*;
import com.nju.game.hero.strategy.DefensiveHeroStrategy;
import com.nju.game.hero.strategy.HeroStrategy;

/**
 * 防御型英雄工厂
 */
public class DefensiveHeroFactory extends HeroFactory {
    @Override
    public AbstractHero createHero() {
        HeroStrategy defensiveHeroStrategy = new DefensiveHeroStrategy();
        AbstractHero hero = new DefensiveHero();
        hero.setHeroStrategy(defensiveHeroStrategy);
        hero.init();
        return hero;
    }
}
