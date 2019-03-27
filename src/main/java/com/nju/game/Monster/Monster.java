package com.nju.game.Monster;

/**
 * @author: eumes
 * @date: 2019/3/27
 **/

/**
 * 怪物抽象类
 */
public class Monster {
    protected final int totalHP;
    protected int currentHP;
    protected int attackPoint;
    protected int armorPoint;

    protected String name;

    public Monster(int totalHP, int attackPoint, int armorPoint) {
        this.totalHP = totalHP;
        this.currentHP = totalHP;
        this.armorPoint = attackPoint;
        this.armorPoint = armorPoint;
    }

    public int attack() {
        return attackPoint;
    }

}
