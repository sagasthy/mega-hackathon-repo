package com.mega.uwrite.uwriterestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegister
{
    private String firstName;
    private String lastName;
    private String email;
}
