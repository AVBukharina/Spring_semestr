package ru.itis.springbootdemo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    @Qualifier("customUserDetailsService")
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/css/**", "/image/**", "/js/**").permitAll()
                .antMatchers("/signUp").permitAll()
                .antMatchers("/aboutUs").permitAll()
                .antMatchers("/main").permitAll()
                .antMatchers("/shop").permitAll()
                .antMatchers("/blog").permitAll()
                .antMatchers("/works").permitAll()
                .antMatchers("/contact").permitAll()
                .antMatchers("/thanks").permitAll()
                .antMatchers("/files/**").permitAll()
                .antMatchers("/confirm/{confirm-code}").permitAll()
                .antMatchers("/papers/search/**").permitAll()
                .antMatchers("/**").authenticated()
                .antMatchers("/users").hasAnyAuthority("ADMIN")
                .antMatchers("/profile").authenticated()
                .and()
                .formLogin()
                .loginPage("/signIn")
                .usernameParameter("email")
                .defaultSuccessUrl("/profile")
                .failureUrl("/signIn?error")
                .permitAll();
    }
}
