package com.venly.testtask.word.service;

import java.util.List;

import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.entity.Word;
import com.venly.testtask.word.mapper.WordMapper;
import com.venly.testtask.word.repository.WordRepository;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

  private final WordRepository wordRepository;

  private final WordMapper wordMapper;

  public WordServiceImpl(WordRepository wordRepository, WordMapper wordMapper) {
    this.wordRepository = wordRepository;
    this.wordMapper = wordMapper;
  }

  @Override
  public WordDto createWord(WordDto wordDto) {
    Word word = wordMapper.wordDtoToWord(wordDto);
    word = wordRepository.save(word);
    return wordMapper.wordToWordDto(word);
  }

  @Override
  public List<WordDto> getAllWords() {
    List<Word> words = wordRepository.findAll();
    return wordMapper.wordsToWordDtos(words);
  }
}
