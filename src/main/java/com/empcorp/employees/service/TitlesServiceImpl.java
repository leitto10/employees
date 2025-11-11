package com.empcorp.employees.service;

import com.empcorp.employees.repository.TitlesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service("titlesService")
public class TitlesServiceImpl implements TitlesService {

    @Autowired
    public TitlesRepository titlesRepository;

    @Override
    public List<String> getDistinctTitles() {
        return titlesRepository.getDistinctTitles();
    }
}
