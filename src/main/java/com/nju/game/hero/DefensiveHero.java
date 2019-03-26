package com.nju.game.hero;

import lombok.ToString;

/**
 * 防御型英雄
 */
public class DefensiveHero extends AbstractHero{
    public void show() {
        System.out.println("创建了防御型英雄");
    }


    public String getDesc() {
        return "DefensiveHero";
    }
}
