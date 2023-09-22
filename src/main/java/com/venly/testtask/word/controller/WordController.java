package com.venly.testtask.word.controller;

import com.venly.testtask.word.dto.WordDto;
import com.venly.testtask.word.service.WordService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/words")
public class WordController {

  private final WordService wordService;

  public WordController(WordService wordService) {
    this.wordService = wordService;
  }

  @PostMapping
  @ResponseStatus(value = HttpStatus.CREATED)
  public WordDto createWord(@RequestBody @Valid WordDto wordDto) {
    return wordService.createWord(wordDto);
  }
}
