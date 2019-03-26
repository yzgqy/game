package com.nju.game.hero.decortor;

import com.nju.game.hero.HeroAttribute;

/**
 * 装饰者抽象类
 */
public abstract class Decorator implements HeroComponent {
    protected HeroComponent heroComponent;
    protected HeroAttribute heroAttribute;

    public void setHeroComponent(HeroComponent heroComponent) {
        this.heroComponent = heroComponent;
    }

    public abstract void setHeroAttribute();
}
