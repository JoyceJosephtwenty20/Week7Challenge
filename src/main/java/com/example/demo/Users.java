package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="users_table")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="userName")
    private String userName;

    @Column(name = "role")
    private String role;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    public Users() {
    }

    public Users(String userName,
                 String role,
                 String password,
                 boolean enabled) {
        this.userName = userName;
        this.role = role;
        this.password = password;
        this.enabled = enabled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
