package sims.com.simastech.SimsData;

import java.sql.Time;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class Logins {
    private String email;
    private String password;
    @JsonIgnore
    private String token;
    @JsonIgnore
    private LocalTime logintime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalTime getLogintime() {
        return logintime;
    }

    public void setLogintime(LocalTime logintime) {
        this.logintime = logintime;
    }
}
