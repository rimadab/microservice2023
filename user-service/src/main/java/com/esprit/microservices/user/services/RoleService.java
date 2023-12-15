package com.esprit.microservices.user.services;
import com.esprit.microservices.user.Entity.Role;
import com.esprit.microservices.user.Repository.RoleRepository;
import com.esprit.microservices.user.serviceInterface.IRoleInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RoleService implements IRoleInterface {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getRole() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);

    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }
}
