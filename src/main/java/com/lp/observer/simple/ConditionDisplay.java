package com.lp.observer.simple;

/**
 * @Author: lp
 * @Date: 2020/12/1 9:55
 */
public class ConditionDisplay implements Observer,DisplayElement {
    private PlaceVo placeVo;
    private Subject Station;

    public ConditionDisplay(Subject station) {
        this.Station = station;
        station.register( this);
    }

    @Override
    public void display() {
        //显示数据
        System.out.println("显示当前对象:"+placeVo);

    }

    @Override
    public void update(PlaceVo placeVo) {
        //接受新的数据
        this.placeVo = placeVo;
        display();

    }
}
