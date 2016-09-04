package edu.shop.java.dao.impl;

import edu.shop.java.dao.ProductCategoryDao;
import edu.shop.java.dao.accessors.FileDatasourceAccessor;
import edu.shop.java.models.ProductCategory;

import java.util.List;

public class ProductCategoryFileDao extends FileAbstractDao<ProductCategory> implements ProductCategoryDao {

    public ProductCategoryFileDao() {
    }

    @Override
    public List<ProductCategory> getAll() {
        return null;
    }

    @Override
    public ProductCategory getById(Long id) {
        return null;
    }


    @Override
    public String getDatasourceName() {
        return null;
    }
}
