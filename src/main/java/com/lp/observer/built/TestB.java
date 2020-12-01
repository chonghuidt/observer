package com.lp.observer.built;

import com.lp.observer.simple.PlaceVo;

/**
 * @Author: lp
 * @Date: 2020/12/1 11:13
 */
public class TestB {
    public static void main(String[] args) {
        StationBuilt stationBuilt = new StationBuilt();
        ConditionDisplayBuilt conditionDisplayBuilt = new ConditionDisplayBuilt(stationBuilt);
        stationBuilt.setMessage(new PlaceVo("root","token"));


    }
}
