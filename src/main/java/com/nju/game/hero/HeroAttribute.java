package com.nju.game.hero;

import com.nju.game.observer.Observer;
import com.nju.game.observer.Subject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

/**
 * 英雄属性值
 */
@Setter
@Getter
//@ToString
public class HeroAttribute implements Subject {
    private ArrayList<Observer> observers=new ArrayList<Observer>();//观察者们

    private String name;//角色名
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

    public void copy(HeroAttribute heroAttribute) {
        this.name = heroAttribute.getName();
        this.attackPoint = heroAttribute.getAttackPoint();
        this.armorPoint = heroAttribute.getArmorPoint();
        this.currentHealthPoint = heroAttribute.getCurrentHealthPoint();
        this.totalHealthPoint = heroAttribute.getTotalHealthPoint();
        this.level = heroAttribute.getLevel();
        this.currentXP = heroAttribute.getCurrentXP();
        this.levelXP = heroAttribute.getLevelXP();
        this.currentMana = heroAttribute.getCurrentMana();
        this.levelMana = heroAttribute.getLevelMana();

    }

    public HeroAttribute(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public HeroAttribute() {
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            HeroAttribute heroAttribute = new HeroAttribute();
            heroAttribute.setAttackPoint(attackPoint);
            heroAttribute.setArmorPoint(armorPoint);
            heroAttribute.setCurrentHealthPoint(currentHealthPoint);
            heroAttribute.setTotalHealthPoint(totalHealthPoint);
            heroAttribute.setLevel(level);
            heroAttribute.setCurrentXP(currentXP);
            heroAttribute.setLevelXP(levelXP);
            heroAttribute.setCurrentMana(currentMana);
            heroAttribute.setLevelMana(levelMana);
//            observer.update(attackPoint, armorPoint, currentHealthPoint, totalHealthPoint, level, currentXP, levelXP, currentMana, levelMana);
            observer.update(heroAttribute);
        }

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasureMents(HeroAttribute myattribute) {
        this.attackPoint = myattribute.getAttackPoint();
        this.armorPoint = myattribute.getArmorPoint();
        this.currentHealthPoint = myattribute.getCurrentHealthPoint();
        this.totalHealthPoint = myattribute.getTotalHealthPoint();
        this.level = myattribute.getLevel();
        this.currentXP = myattribute.getCurrentXP();
        this.levelXP = myattribute.getLevelXP();
        this.currentMana = myattribute.getCurrentMana();
        this.levelMana = myattribute.getLevelMana();
        measurementsChanged();
    }
}
