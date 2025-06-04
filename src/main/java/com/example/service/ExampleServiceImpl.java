package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.domain.Example;
import com.example.mapper.ExampleMapper;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleMapper mapper;

    @Override
    public List<Example> getExamples() {
        return mapper.selectExamples();
    }
}
