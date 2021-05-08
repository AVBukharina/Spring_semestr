package ru.itis.springbootdemo.dto;

import lombok.*;
import ru.itis.springbootdemo.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserDto {
    private Long id;
    private String email;
    private String firstname;
    private String lastname;
    private String phone;

    public static UserDto from(User user){
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .phone(user.getPhone())
                .build();
    }

    public static List<UserDto> from(List<User> users){
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }
}
