package com.showoffs.zingrides.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
public @Data class Users {
    
    @Id
    String userName;
    String firstName;
    String lastName;
    int mobileNumber;
    @OneToOne
    Address address;
    
    @OneToOne
    Login login;

}
