package com.nju.game;

import com.sun.org.apache.xml.internal.security.Init;

public interface HeroStrategy {
    public void initMethod(Hero hero);
    public void attackMethod(Hero hero);
}
