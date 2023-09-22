package com.venly.testtask.word.repository;

import java.util.List;

import com.venly.testtask.word.entity.Relation;
import com.venly.testtask.word.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

  List<Word> findByRelation(Relation relation);
}

