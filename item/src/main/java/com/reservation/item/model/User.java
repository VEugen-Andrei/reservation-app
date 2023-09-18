package com.reservation.item.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "user")
@Table(
        name = "_user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "email")
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String password;

    @Column(name = "email", nullable = false, unique = true, columnDefinition = "TEXT")
    @Email
    private String email;
}
