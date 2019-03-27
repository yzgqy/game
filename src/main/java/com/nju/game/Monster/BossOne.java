package com.nju.game.Monster;

/**
 * @author: eumes
 * @date: 2019/3/27
 **/
public class BossOne extends Monster {

    public BossOne() {
        super(200, 20, 20);
    }

    public BossOne(int totalHP, int attackPoint, int armorPoint) {
        super(totalHP, attackPoint, armorPoint);
    }

    @Override
    public int attack() {
        return attackPoint;
    }
}
