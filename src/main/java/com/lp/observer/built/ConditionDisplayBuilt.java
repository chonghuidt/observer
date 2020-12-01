package com.lp.observer.built;

import com.lp.observer.simple.DisplayElement;
import com.lp.observer.simple.PlaceVo;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: lp
 * @Date: 2020/12/1 10:59
 */
public class ConditionDisplayBuilt implements Observer, DisplayElement {
    private Observable observable;
    private PlaceVo placeVo;

    public ConditionDisplayBuilt(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //显示数据
        System.out.println("显示数据为："+placeVo);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof StationBuilt){
            this.placeVo = (PlaceVo) arg;
            display();
        }

    }
}
