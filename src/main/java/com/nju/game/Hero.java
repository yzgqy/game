package com.nju.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Hero {
//    攻击力、护甲值、当前生命值、总生命值、等级、当前经验值、等级经验值、（法力值）
    private int attackPoint;
    private int armorPoint;
    private int currentHealthPoint;
    private int totalHealthPoint;
    private int level;
    private int currentXP;
    private int levelXP;
    private int currentMana;
    private int levelMana;
}
