package com.nju.game.hero.equipage;

import com.nju.game.hero.decortor.Decorator;
import lombok.ToString;

/**
 * 装备抽象类
 */
@ToString
public abstract class AbstractEquipage extends Decorator {
    protected String name;//装备名称
    protected int level;//等级
    protected int stoneNum;//需要石头个数

    public abstract void upgrade();

    public abstract void init();

}
