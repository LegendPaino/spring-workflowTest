package com.example.demo.domain;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@AllArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {
    final private TestMapper testMapper;

    @GetMapping
    public ResponseEntity getTest() {
        Test test = testMapper.TestDtoToTest(new TestDto(1, 2, 3));

        return ResponseEntity.ok().build();
    }
}
