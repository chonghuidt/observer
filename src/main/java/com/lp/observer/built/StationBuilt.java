package com.lp.observer.built;

import com.lp.observer.simple.PlaceVo;

import java.util.Observable;

/**
 * @Author: lp
 * @Date: 2020/12/1 10:48
 */
public class StationBuilt extends Observable {
//    private PlaceVo placeVo;

    public StationBuilt() {
    }
    public void setMessage(PlaceVo placeVo){
        System.out.println("当前对象为:"+ placeVo);
        setChanged();
        notifyObservers(placeVo);

    }
}
