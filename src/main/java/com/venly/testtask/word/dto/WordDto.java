package com.venly.testtask.word.dto;

import com.venly.testtask.word.entity.Relation;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WordDto {

  private Long id;

  @NotNull(message = "firstWord cannot be null")
  @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only alphabets and spaces are allowed")
  private String firstWord;

  @NotNull(message = "secondWord cannot be null")
  @Pattern(regexp = "^[a-zA-Z ]+$", message = "Only alphabets and spaces are allowed")
  private String secondWord;

  @NotNull(message = "relation cannot be null")
  private Relation relation;

  private Inversed inversed;


}
