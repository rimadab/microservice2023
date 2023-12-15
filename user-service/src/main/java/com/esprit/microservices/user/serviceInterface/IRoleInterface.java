package com.esprit.microservices.user.serviceInterface;


import com.esprit.microservices.user.Entity.Role;

import java.util.List;

public interface IRoleInterface {
    Role addRole(Role role);


    List<Role> getRole();

    void deleteRole(Long id);

    Role updateRole(Role role);
}
