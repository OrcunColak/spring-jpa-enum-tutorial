package com.colak.springjpaenumtutorial.repository;

import com.colak.springjpaenumtutorial.jpa.Role;
import com.colak.springjpaenumtutorial.jpa.User3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class User3RepositoryTest {

    @Autowired
    private User3Repository repository;

    @Test
    void findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        List<User3> list = repository.findAll(sort);


        // johnDoe
        User3 first = list.getFirst();
        assertThat(first.getRole()).isEqualTo(Role.TEACHER);

        //janeSmith
        User3 last = list.getLast();
        assertThat(last.getRole()).isEqualTo(Role.STUDENT);
    }
}
