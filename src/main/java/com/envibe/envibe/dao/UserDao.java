package com.envibe.envibe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.envibe.envibe.model.User;
import com.envibe.envibe.rowmapper.UserRowMapper;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUser(final String username) {
        return jdbcTemplate.queryForObject("SELECT u.user_name user_name, u.user_pass user_pass, u.user_email user_email, ur.user_role user_role FROM user u, user_role ur where u.user_name = ? and u.user_name = ur.user_name",
                new String[] { username }, new UserRowMapper());
    }
}
