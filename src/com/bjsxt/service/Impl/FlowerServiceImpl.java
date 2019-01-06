package com.bjsxt.service.Impl;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.dao.Impl.FlowerDaoImpl;
import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDao = new FlowerDaoImpl();

    @Override
    public int add(Flower flower) {
        return flowerDao.insFlower(flower);
    }

    @Override
    public List<Flower> show() {
        return flowerDao.selAll();
    }
}
