package com.bjsxt.dao.Impl;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    @Override
    public int insFlower(Flower flower) {
        int index = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?serverTimezone=GMT%2B8", "root", "123456");
            ps = conn.prepareStatement("insert into flower values (default,?,?,?)");
            ps.setObject(1,flower.getName());
            ps.setObject(2,flower.getPrice());
            ps.setObject(3,flower.getProduction());
            index = ps.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return index;
    }

    @Override
    public List<Flower> selAll() {
        List<Flower> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false", "root", "123456");
            ps = conn.prepareStatement("SELECT * from flower");
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Flower(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;

    }
}
