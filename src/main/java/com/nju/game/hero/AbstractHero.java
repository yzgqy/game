package com.nju.game.hero;

import com.nju.game.hero.ability.AbstractAbility;
import com.nju.game.hero.decortor.HeroComponent;
import com.nju.game.hero.strategy.HeroStrategy;
import com.nju.game.levels.AbstractLevel;
import com.nju.game.levels.LevelOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * 英雄抽象类
 */
@Setter
@Getter
@ToString
public abstract class AbstractHero implements HeroComponent {

    private AbstractLevel levelState;

    private HeroAttribute heroAttribute = new HeroAttribute();//英雄属性值
    private HeroStrategy heroStrategy;//英雄策略
    private ArrayList<AbstractAbility> abilities = new ArrayList<AbstractAbility>();//英雄技能
    //英雄技能
//    public abstract void show();
    public void init(){
        levelState = new LevelOne(this);
        heroStrategy.initMethod(this.heroAttribute,this.abilities);
    }

    //英雄升级
    public void upgrade() {
        this.levelState.levelUp(this);
    }

    public void attack(){
    }

}
