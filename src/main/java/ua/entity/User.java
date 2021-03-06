package ua.entity;

import ua.entity.enums.Role;

import javax.persistence.*;

@Entity
@Table(name="_user",  indexes = @Index(columnList = "email"))
public class User extends AbstractEntity {

    private String email;

    private String password;

    private Role role;

    private boolean active;

    @Column(name = "active_code")
    private String activationCode;

    @OneToOne(mappedBy="user", cascade = CascadeType.PERSIST)
    private Driver driver;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}