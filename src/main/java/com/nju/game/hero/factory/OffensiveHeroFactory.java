package com.nju.game.hero.factory;

import com.nju.game.hero.*;
import com.nju.game.hero.strategy.HeroStrategy;
import com.nju.game.hero.strategy.OffensiveHeroStrategy;

/**
 * 进攻型英雄工厂
 */
public class OffensiveHeroFactory extends HeroFactory {
    @Override
    public AbstractHero createHero() {
        HeroStrategy offensiveHeroStrategy = new OffensiveHeroStrategy();
        AbstractHero hero = new OffensiveHero();
        hero.setHeroStrategy(offensiveHeroStrategy);
        hero.init();
        return hero;
    }
}
