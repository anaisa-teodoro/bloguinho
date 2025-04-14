package com.api.bloguinho;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
class BlogAppApplicationTests {

    @Configuration
    static class TestConfig {
       
        @Bean
        public String testMessage() {
            return "Mensagem de teste";
        }
    }

    @Test
    void contextLoads() {
    }

    @Test
    void exampleTest(String testMessage) {
        System.out.println(testMessage);
    }
}