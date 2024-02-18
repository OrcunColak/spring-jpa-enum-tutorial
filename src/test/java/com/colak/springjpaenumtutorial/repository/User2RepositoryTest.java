package com.colak.springjpaenumtutorial.repository;

import com.colak.springjpaenumtutorial.jpa.Role;
import com.colak.springjpaenumtutorial.jpa.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class User2RepositoryTest {

    @Autowired
    private User2Repository repository;

    @Test
    void findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        List<User2> list = repository.findAll(sort);


        // johnDoe
        User2 first = list.getFirst();
        assertThat(first.getRole()).isEqualTo(Role.TEACHER);

        //janeSmith
        User2 last = list.getLast();
        assertThat(last.getRole()).isEqualTo(Role.STUDENT);
    }
}
