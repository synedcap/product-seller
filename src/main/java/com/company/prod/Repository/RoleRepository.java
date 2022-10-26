package com.company.prod.Repository;

import com.company.prod.Model.Role;
import com.company.prod.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
