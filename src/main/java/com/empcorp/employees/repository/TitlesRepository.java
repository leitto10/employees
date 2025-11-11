package com.empcorp.employees.repository;

import com.empcorp.employees.entity.Titles;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TitlesRepository extends PagingAndSortingRepository<Titles, Integer> {

    @Query("SELECT DISTINCT t.title FROM Titles t")
    List<String> getDistinctTitles();
}
