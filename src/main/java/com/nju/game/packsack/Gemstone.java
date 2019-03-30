package com.nju.game.packsack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Gemstone implements GridI{
    private int type;//宝石类型：1、武器宝石；2、盔甲宝石
    private String name;//宝石的名字
    private int count;//宝石的数量
}
