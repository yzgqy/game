package com.nju.game.hero.ability;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 暴击技能
 */
@Getter
@Setter
@ToString
public class CritAbility extends AbstractAbility{
    private double critPoint;//暴击值

    @Override
    public void upgrade() {
        if(this.level<4){
            this.level ++;
            this.damage += 10*level;
            this.mana += 5*level;
            this.critPoint += 0.5*level;
        }
    }
}
