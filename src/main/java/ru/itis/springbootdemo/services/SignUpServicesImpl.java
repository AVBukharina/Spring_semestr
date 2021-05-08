package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.models.Role;
import ru.itis.springbootdemo.models.State;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.UUID;

@Component
public class SignUpServicesImpl implements SignUpServices {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MailsService mailsService;

    @Autowired
    private SmsService smsService;
    @Override
    public void signUp(UserForm form) {
        User newUser = User.builder()
                .email(form.getEmail())
                .hashpassword(passwordEncoder.encode(form.getHashpassword()))
                .firstname(form.getFirstname())
                .lastname(form.getLastname())
                .phone(form.getPhone())
                .state(State.NOT_CONFIRMED)
                .role(Role.USER)
                .confirmCode(UUID.randomUUID().toString())
                .build();

        usersRepository.save(newUser);

        mailsService.sendEmailForConfirm(newUser.getEmail(), newUser.getConfirmCode());

        smsService.sendSms(form.getPhone(), "Вы зарегистрированы");
    }
}
