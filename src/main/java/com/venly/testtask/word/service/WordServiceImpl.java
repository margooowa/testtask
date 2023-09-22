package com.venly.testtask.word.service;

import java.util.ArrayList;
import java.util.List;

import com.venly.testtask.word.dto.Inversed;
import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.entity.Relation;
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
  public List<WordDto> findWords(Relation relation, Boolean inverse) {
    List<Word> words = wordRepository.findByRelation(relation);
    List<WordDto> wordDtos = wordMapper.wordsToWordDtos(words);
    if (inverse!=null && inverse) {
      this.inverseList(wordDtos);
    }
    return wordDtos;
  }

  private void inverseList(List<WordDto> list) {
    List<WordDto> inversed = new ArrayList<>(list.size());
    list.forEach(word -> {
      word.setInversed(Inversed.NO);
      inversed.add(WordDto.builder()
          .firstWord(word.getSecondWord())
          .secondWord(word.getFirstWord())
          .relation(word.getRelation())
          .inversed(Inversed.YES)
          .build());
    });
    list.addAll(inversed);
  }
}
