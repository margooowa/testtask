package com.venly.testtask.word.dto;

import com.venly.testtask.word.entity.Relation;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class WordDto {

  private Long id;

  @NotBlank(message = "first word is mandatory")
  private String firstWord;

  @NotBlank(message = "second word is mandatory")
  private String secondWord;

  @NotBlank(message = "relation word is mandatory")
  private Relation relation;


}
