package com.nju.game.hero.ability;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 眩晕技能
 */
@Getter
@Setter
@ToString
public class StunAbility extends AbstractAbility{
    private double stubRate;//眩晕概率

    @Override
    public void upgrade() {
        if(this.level<4){
            this.level ++;
            this.damage += 5*level;
            this.mana += 6*level;
            this.stubRate += 0.3*level;
        }
    }
}
