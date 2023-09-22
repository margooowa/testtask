package com.venly.testtask.word.dto;

import com.venly.testtask.word.entity.Relation;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class WordDto {

  private Long id;

  @NonNull
  private String firstWord;

  @NonNull
  private String secondWord;

  @NonNull
  private Relation relation;


}
