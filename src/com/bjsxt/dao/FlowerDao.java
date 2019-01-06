package com.bjsxt.dao;

import com.bjsxt.pojo.Flower;

import java.util.List;

public interface FlowerDao {
    List<Flower> selAll();

    int insFlower(Flower flower);
}
