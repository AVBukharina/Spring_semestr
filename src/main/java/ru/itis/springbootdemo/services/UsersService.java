package ru.itis.springbootdemo.services;

import org.springframework.stereotype.Controller;
import ru.itis.springbootdemo.dto.UserDto;

import java.util.List;

@Controller
public interface UsersService {
    List<UserDto> getAllUsers();

    UserDto getUser(Long userId);
}
