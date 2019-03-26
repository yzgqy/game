package com.nju.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Hero {
//    攻击力、护甲值、当前生命值、总生命值、等级、当前经验值、等级经验值、（法力值）
    private int attackPoint; //攻击力
    private int armorPoint;//护甲值
    private int currentHealthPoint;//当前生命值
    private int totalHealthPoint;//总生命值
    private int level;//等级
    private int currentXP;//当前经验值
    private int levelXP;//等级经验值
    private int currentMana;//当前法力值
    private int levelMana;//等级法力值
    private HeroStrategy heroStrategy;
}
