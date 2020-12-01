package com.lp.observer.simple;

/**
 * @Author: lp
 * @Date: 2020/12/1 9:28
 *  主题
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void register(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void remove(Observer observer);
    /**
     * 主题变更的时候，通知观察者
     */
    public void notifyMessage();

}
