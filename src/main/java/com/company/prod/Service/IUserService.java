package com.company.prod.Service;

import com.company.prod.Model.Product;
import com.company.prod.Model.Role;
import com.company.prod.Model.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void  addRoleToUser(String username , String name);
    User getUser(String username);
    List<User> getUsers();
}
