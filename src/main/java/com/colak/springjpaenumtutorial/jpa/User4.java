package com.colak.springjpaenumtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * In this case enum is converted using attribute converter
 */

@Entity
@Table(name = "users4")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User4 {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    // No need to specify @Enumerated here, as we have a converter
    @Column(name = "role")
    @Convert(converter = RoleTypeConverter.class)
    private RoleType role;
}
