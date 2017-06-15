package com.example.pomingpo.trytdd.Presenter;

import javax.inject.Inject;

/**
 * Created by pomingpo on 2017/6/15.
 */

public class LoginPresenter {
    private int loginAttempt;
    private static final int MAX_LOGIN_ATTEMPT = 3;

    public LoginPresenter() {
    }

    public int incrementLoginAttempt() {
        loginAttempt++;
        return loginAttempt;
    }

    public boolean isLoginAttempExceeded() {
        return loginAttempt > MAX_LOGIN_ATTEMPT;
    }

    public boolean isLoginSuccess(String name, String password) {
        return name.equals("roy") && password.equals("tdd");
    }
}
