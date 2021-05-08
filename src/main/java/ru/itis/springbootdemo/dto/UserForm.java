package ru.itis.springbootdemo.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserForm {
    private String email;
    private String hashpassword;
    private String firstname;
    private String lastname;
    private String phone;
}
