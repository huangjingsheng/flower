package com.bjsxt.servlet;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.Impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/inster")
public class InsertServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String production = req.getParameter("production");
        FlowerService flowerService = new FlowerServiceImpl();
        Flower flower = new Flower();
        flower.setName(name);
        flower.setPrice(Double.parseDouble(price));
        flower.setProduction(production);
        int index = flowerService.add(flower);

        if(index>0){
            resp.sendRedirect("show");
        }else {
            resp.sendRedirect("add.jsp");
        }
    }
}
