package com.showoffs.zingrides.repo.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.showoffs.zingrides.domain.users.Login;



@RepositoryRestResource(collectionResourceRel = "login", path = "login")
public interface LoginRepo extends JpaRepository<Login, String>{

    List<Login> findByUserName(@Param("name") String name);
}