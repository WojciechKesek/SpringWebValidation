package com.example.example_exception_handling.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@Builder
public class CustomerDto {
    @NotNull
    @Min(0)
    private Long id;
    @Pattern(regexp = "[a-zA-Z]+")
    private String name;
    @NotEmpty
    private String address;
    @Min(10000000000L)
    @Max(99999999999L)
    private Long pesel;
}
