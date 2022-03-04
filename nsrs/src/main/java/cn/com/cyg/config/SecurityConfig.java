package cn.com.cyg.config;

import cn.com.cyg.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("encoder:"+encoder);
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeRequests()
                .antMatchers("/","/css/**","/js/**","/layui/**","/images/**","/layuiadmin/**").permitAll()
                .antMatchers("/freshman/**").hasRole("freshman")
                .antMatchers("/teacher/**").hasRole("teacher")
                .antMatchers("/admin/**").hasRole("admin")
                .anyRequest().authenticated()
                .and()
                .formLogin();

        http.formLogin()
                .loginPage("/userLogin").permitAll()
                .usernameParameter("account")
                .passwordParameter("password")
                .defaultSuccessUrl("/")
                .failureUrl("/userLogin?error");
    }
}