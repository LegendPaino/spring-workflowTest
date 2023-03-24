package com.example.demo.domain;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestMapper {
    Test TestDtoToTest(TestDto testDto);
}
