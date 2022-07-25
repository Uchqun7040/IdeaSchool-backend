package com.example.IdeaBackend;

import com.example.IdeaBackend.entity.Class;
import com.example.IdeaBackend.entity.Room;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class IdeaBackendApplicationTests {

    @Test
    void contextLoads() throws Exception {

    }
    @Bean
    public TestRestTemplate testRestTemplate() {
        return new TestRestTemplate();
    }

}
