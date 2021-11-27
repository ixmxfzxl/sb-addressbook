package com.bridgelabz.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    @Pattern( regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "First Letter Should Be Capital")
    @NotBlank
    private String street;

    @Pattern( regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "First Letter Should Be Capital")
    @NotBlank
    private String city;

    @Pattern( regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "First Letter Should Be Capital")
    @NotBlank
    private String state;

    @Pattern( regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "First Letter Should Be Capital")
    @NotBlank
    private String country;

    @Pattern( regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "First Letter Should Be Capital")
    @NotBlank
    private String postCode;
}