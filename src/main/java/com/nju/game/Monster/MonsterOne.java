package com.nju.game.Monster;

/**
 * @author: eumes
 * @date: 2019/3/27
 **/
public class MonsterOne extends Monster{

    public MonsterOne() {
        super(50, 10, 10);
    }

    public MonsterOne(int totalHP, int attackPoint, int armorPoint) {
        super(totalHP, attackPoint, armorPoint);
    }

    @Override
    public int attack() {
        return attackPoint;
    }
}
