package com.mega.uwrite.uwriterestapi.dto;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterUser
{
    private String firstName;
    private String lastName;
    private String email;
}
