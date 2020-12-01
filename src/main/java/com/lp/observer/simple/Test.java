package com.lp.observer.simple;

/**
 * @Author: lp
 * @Date: 2020/12/1 10:13
 */
public class Test {
    public static void main(String[] args) {
        Station station = new Station();
        ConditionDisplay conditionDisplay = new ConditionDisplay(station);
        station.setMessage(new PlaceVo("1234","aaa"));
        station.setMessage(new PlaceVo("5678","bbb"));

    }
}
