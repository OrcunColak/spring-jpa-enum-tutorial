package com.colak.springjpaenumtutorial.repository;

import com.colak.springjpaenumtutorial.jpa.RoleType;
import com.colak.springjpaenumtutorial.jpa.User4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class User4RepositoryTest {

    @Autowired
    private User4Repository repository;

    @Test
    void findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        List<User4> list = repository.findAll(sort);


        // johnDoe
        User4 first = list.getFirst();
        assertThat(first.getRole()).isEqualTo(RoleType.ADMIN);

        // janeSmith
        User4 last = list.getLast();
        assertThat(last.getRole()).isEqualTo(RoleType.USER);
    }
}
