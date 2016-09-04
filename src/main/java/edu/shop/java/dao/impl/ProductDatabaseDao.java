package edu.shop.java.dao.impl;


import edu.shop.java.dao.ProductDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDatabaseDao extends HibernateAbstractDao<Product> implements ProductDao{

    public ProductDatabaseDao() {
    }

}
