package com.pri.abner.service.user;

import com.pri.abner.model.User;

/**
 * Created by abner chow on 2017/10/17.
 */
public interface UserService {

    public void save(User user);

    public void update(User user);

    public User getById(int userId);

    public void  deleteById(int userId);
}
