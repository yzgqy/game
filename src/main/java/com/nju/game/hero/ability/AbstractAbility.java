package com.nju.game.hero.ability;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 技能抽象类
 */
@Getter
@Setter
@ToString
public abstract class AbstractAbility {
    protected String name;//技能名称
    protected int level;//等级
    protected int type;//技能的类型，1-眩晕，2-暴击
    protected int damage;//伤害值
    protected int cooldown;//冷确时间
    protected int mana;//需要的魔法值

    public abstract void upgrade();

}
