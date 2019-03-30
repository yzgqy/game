package com.nju.game.observer;

import com.nju.game.hero.HeroAttribute;
import lombok.ToString;

//@ToString
public class HeroAttributeDisplay implements Observer{
    private int attackPoint; //攻击力
    private int armorPoint;//护甲值
    private int currentHealthPoint;//当前生命值
    private int totalHealthPoint;//总生命值
    private int level;//等级
    private int currentXP;//当前经验值
    private int levelXP;//等级经验值
    private int currentMana;//当前法力值
    private int levelMana;//等级法力值

    private Subject heroAttribute;

    //设置观察对象
    public HeroAttributeDisplay(Subject subject) {
        this.heroAttribute = subject;
        heroAttribute.registerObserver(this);
    }

    public void update(HeroAttribute attribute) {
        this.attackPoint = attribute.getAttackPoint();
        this.armorPoint = attribute.getArmorPoint();
        this.currentHealthPoint = attribute.getCurrentHealthPoint();
        this.totalHealthPoint = attribute.getTotalHealthPoint();
        this.level = attribute.getLevel();
        this.currentXP = attribute.getCurrentXP();
        this.levelXP = attribute.getLevelXP();
        this.currentMana = attribute.getCurrentMana();
        this.levelMana = attribute.getLevelMana();
    }
}
