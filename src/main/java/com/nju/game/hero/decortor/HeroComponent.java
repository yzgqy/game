package com.nju.game.hero.decortor;

import com.nju.game.hero.HeroAttribute;

/**
 * 被装饰抽象类
 */
public interface HeroComponent {

    HeroAttribute getHeroAttribute();
    String getDesc();
}
