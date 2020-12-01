package com.lp.observer.simple;

import lombok.Data;

/**
 * @Author: lp
 * @Date: 2020/12/1 9:35
 */

public class PlaceVo {
    private String placeId;
    private String token;

    @Override
    public String toString() {
        return "PlaceVo{" +
                "placeId='" + placeId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public PlaceVo(String placeId, String token) {
        this.placeId = placeId;
        this.token = token;
    }
}
