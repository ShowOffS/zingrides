package com.showoffs.zingrides.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "login")
public @Data class Login {
    
    @Id
    String userName;
    String password;
    
    @OneToOne
    Users users;

}
