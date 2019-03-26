package com.nju.game.hero;

import lombok.ToString;

/**
 * 进攻型英雄
 */
public class OffensiveHero extends AbstractHero{
    @Override
    public void show() {
        System.out.println("创建了攻击型英雄");
    }
}
