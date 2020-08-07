package com.example.demo;

import com.sun.tools.javah.Gen;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sun.jvm.hotspot.memory.Generation;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name="role_table")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "role")
    private String role;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    @NotEmpty
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    @NotNull
    private String lastName;

    @Column(name = "enabled")
    private boolean enable;


    public Role(){

    }

    public Role(String username, String role, String password,
                @NotEmpty @NotNull String firstName,
                @NotEmpty @NotNull String lastName,
                boolean enable) {

        this.username = username;
        this.role = role;
        this.setPassword(password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.enable = enable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
