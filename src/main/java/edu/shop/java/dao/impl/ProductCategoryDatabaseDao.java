package edu.shop.java.dao.impl;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.models.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "productCategoryDatabaseDao")
public class ProductCategoryDatabaseDao extends HibernateAbstractDao<ProductCategory> implements ProductCategoryDao {

    public ProductCategoryDatabaseDao() {
    }

}
