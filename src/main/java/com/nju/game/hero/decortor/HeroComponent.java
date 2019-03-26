package com.nju.game.hero.decortor;

import com.nju.game.hero.HeroAttribute;

/**
 * 被装饰抽象类
 */
public interface HeroComponent {
//    String desc = "HeroComponent";

//    public String getDesc(){
//        return desc;
//    }
//    public abstract void show();

    public HeroAttribute getHeroAttribute();

    //    public void setHeroAttribute();
    public String getDesc();
}
