package edu.shop.java.dao.impl;

import edu.shop.java.dao.OrderDao;
import edu.shop.java.dao.accessors.FileDatasourceAccessor;
import edu.shop.java.models.Order;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository(value = "orderFileDao")
public class OrderFileDao extends FileAbstractDao<Order> implements OrderDao {

    public OrderFileDao() {
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order getById(Long id) {
        return null;
    }



    @Override
    public String getDatasourceName() {
        return null;
    }
}
