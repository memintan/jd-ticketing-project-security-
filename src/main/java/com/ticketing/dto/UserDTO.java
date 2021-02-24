package com.ticketing.dto;

import com.ticketing.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String id;

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean confirmPassword;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

}
