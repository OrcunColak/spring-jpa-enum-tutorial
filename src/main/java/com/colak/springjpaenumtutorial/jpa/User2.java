package com.colak.springjpaenumtutorial.jpa;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 * This entity uses Hibernate annotation to create a SQL Type
 * CREATE TYPE Role AS ENUM ('TEACHER', 'STUDENT');
 */

@Entity
@Table(name = "users2")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User2 {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    @Basic(optional = false)
    private Role role;
}
