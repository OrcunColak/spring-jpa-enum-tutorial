package com.colak.springjpaenumtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * A check constraint is created
 * <p>
 * CREATE TABLE users (
 * id BIGINT NOT NULL,
 * name VARCHAR(255),
 * role VARCHAR(255) CHECK (role IN ('TEACHER','STUDENT')),
 * PRIMARY KEY (id)
 * )
 */
@Entity
@Table(name = "users")

@Getter
@Setter
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
