package ru.itis.springbootdemo.models;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String hashpassword;
    private String firstname;
    private String lastname;
    private String phone;

    @Enumerated(value = EnumType.STRING)
    private State state;

    private String confirmCode;

    @Enumerated(value = EnumType.STRING)
    private Role role;
}
