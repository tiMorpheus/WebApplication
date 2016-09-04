package edu.shop.java.dao.impl;

import edu.shop.java.dao.OrderDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.models.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "orderDatabaseDao")
public class OrderDatabaseDao extends HibernateAbstractDao<Order> implements OrderDao {

    public OrderDatabaseDao() {
    }



}
