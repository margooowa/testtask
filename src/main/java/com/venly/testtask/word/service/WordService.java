package com.venly.testtask.word.service;

import java.util.List;

import com.venly.testtask.word.dto.WordDto;

public interface WordService {

  WordDto createWord(WordDto wordDto);
  List<WordDto> getAllWords();
}
