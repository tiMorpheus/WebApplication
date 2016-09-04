package edu.shop.java.dao.impl;

import edu.shop.java.dao.UserDao;
import edu.shop.java.dao.accessors.DatabaseDatasourceAccessor;
import edu.shop.java.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDatabaseDao extends HibernateAbstractDao<User> implements UserDao{


    public UserDatabaseDao() {
    }

}
