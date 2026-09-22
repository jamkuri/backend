package com.example.registration.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "registered_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    private String username1;

    @NotBlank(message = "Last name is required")
    private String password;

    @NotBlank(message = "Father name is required")
    private String pcc;

    @NotBlank(message = "Address is required")
    @Column(length = 500)
    private String authenticator;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPcc() {
        return pcc;
    }

    public void setPcc(String pcc) {
        this.pcc = pcc;
    }

    public String getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(String authenticator) {
        this.authenticator = authenticator;
    }
}
