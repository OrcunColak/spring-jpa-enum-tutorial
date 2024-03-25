package com.colak.springjpaenumtutorial.repository;

import com.colak.springjpaenumtutorial.jpa.Role;
import com.colak.springjpaenumtutorial.jpa.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class User1RepositoryTest {

    @Autowired
    private User1Repository repository;

    @Test
    void findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        List<User1> list = repository.findAll(sort);


        // johnDoe
        User1 first = list.getFirst();
        assertThat(first.getRole()).isEqualTo(Role.TEACHER);

        //janeSmith
        User1 last = list.getLast();
        assertThat(last.getRole()).isEqualTo(Role.STUDENT);
    }
}
