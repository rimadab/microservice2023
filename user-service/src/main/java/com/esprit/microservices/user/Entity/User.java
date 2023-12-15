package com.esprit.microservices.user.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Table(name = "\"USER\"")
public class User implements Serializable {

    String userName;
    String Password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))

    private List<Role> roles = new ArrayList<>();
    @Column(name = "reset_password_token")
    private String resetPasswordToken;
    private String email;
    @Id
    @GeneratedValue
    private Long id;

    public void setResetToken(String resetToken) {
        this.resetPasswordToken = resetToken;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}