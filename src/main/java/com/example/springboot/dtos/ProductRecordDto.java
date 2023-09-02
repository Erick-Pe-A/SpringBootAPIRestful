package com.example.springboot.dtos;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name,@NotNull BigDecimal value) {

}
