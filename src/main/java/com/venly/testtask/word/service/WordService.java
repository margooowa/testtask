package com.venly.testtask.word.service;

import java.util.List;

import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.entity.Relation;

public interface WordService {

  WordDto createWord(WordDto wordDto);
  List<WordDto> findWords(Relation relation);
}
