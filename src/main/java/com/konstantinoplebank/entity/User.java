package com.konstantinoplebank.entity;


import lombok.*;
import com.konstantinoplebank.response.UserProfile;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple JavaBean domain object that represents a User
 *
 * @author Konstantin Artushkevich
 * @version 1.0
 */

@EqualsAndHashCode(callSuper = true)
@ToString
public class User extends UserProfile {

    private long id;

    private String name;

    private String email;

    private String password;

    private String description;

    private String address;

    private int age;

    private Set<Bill> bills = new HashSet<>();

    private Set<Role> roles = new HashSet<>();

    private String confirmPassword;

    public User(String name, String email, String password, String description, String address, int age,
                Set<Role> roles) {
        super(name, email, password, description, address, age);
        this.name = name;
        this.email = email;
        this.password = password;
        this.description = description;
        this.address = address;
        this.age = age;
        this.roles.addAll(roles);
    }

    public User() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}