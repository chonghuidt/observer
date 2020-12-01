package com.lp.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lp
 * @Date: 2020/12/1 9:42
 */
public class Station implements Subject {
    private List observers;
    private PlaceVo placeVo;

    public Station() {
        observers = new ArrayList<>(10);
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }

    }

    @Override
    public void notifyMessage() {
        //更新消息告诉所有的观察者
        for (int i = 0; i <observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(placeVo);
        }

    }

    /**
     * 接受实时数据给观察者
     * @param placeVo
     */
    public void setMessage(PlaceVo placeVo){
        this.placeVo = placeVo;
        System.out.println("观察到当前对象:"+placeVo);
        notifyMessage();

    }
}
