package com.shellys_capstone.shellyscapstone.models.data;

import com.shellys_capstone.shellyscapstone.models.forms.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;


    @Repository
    @Transactional
    public interface UserDao extends CrudRepository<User, Integer> {
    }



