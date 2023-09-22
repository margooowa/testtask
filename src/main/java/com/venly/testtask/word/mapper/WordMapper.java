package com.venly.testtask.word.mapper;

import java.util.List;

import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.entity.Word;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WordMapper {

  WordDto wordToWordDto(Word word);

  Word wordDtoToWord(WordDto wordDto);

  List<WordDto> wordsToWordDtos(List<Word> words);
}
