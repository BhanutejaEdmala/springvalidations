package com.example.springvalidations.entities;

import com.example.springvalidations.validations.MyValid;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class User {
   @NotEmpty
    private String uid;
    @NotBlank(message = "user name must not be blank")
    private String uname;
  @Email(message = "enter mail correctly")
    private String email;
   //@Size(min = 3,max = 10)
   @MyValid
    private String password;
}
