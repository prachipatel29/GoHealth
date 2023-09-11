package com.uwindsor.gohealth.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Role implements GrantedAuthority, Serializable {

    @Serial
    private static final long serialVersionUID = 4243203380781242172L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_Id")
    private int authId;

    @Column(name = "authority", nullable = false)
    private String authority;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "authorities")
    private Set<User> users = new HashSet<>();

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
