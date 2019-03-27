package com.nju.game.hero.strategy;

import com.nju.game.hero.HeroAttribute;
import com.nju.game.hero.ability.AbstractAbility;

import java.util.ArrayList;
import java.util.List;

/**
 * 英雄策略抽象
 */
public interface HeroStrategy {
    public void initMethod(HeroAttribute heroAttribute, List<AbstractAbility> abstractHeroes);
    public void attackMethod(HeroAttribute heroAttribute);
}
