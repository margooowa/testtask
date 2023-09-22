package com.venly.testtask.word.mapper;

import java.util.List;

import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.entity.Word;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface WordMapper {

  @Mapping(target = "firstWord", source = "firstWord", qualifiedByName = "toLowercase")
  @Mapping(target = "secondWord", source = "secondWord", qualifiedByName = "toLowercase")
  WordDto wordToWordDto(Word word);

  Word wordDtoToWord(WordDto wordDto);

  List<WordDto> wordsToWordDtos(List<Word> words);

  @Named("toLowercase")
  default String toLowercase(String value) {
    return value.toLowerCase();
  }
}
