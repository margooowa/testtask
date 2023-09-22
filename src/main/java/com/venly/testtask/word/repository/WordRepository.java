package com.venly.testtask.word.repository;

import com.venly.testtask.word.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

}

