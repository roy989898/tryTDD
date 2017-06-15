package com.example.pomingpo.trytdd.Presenter;

import com.example.pomingpo.trytdd.Components.DaggerMainactivityComponent;
import com.example.pomingpo.trytdd.Components.MainactivityComponent;
import com.example.pomingpo.trytdd.Modules.MainActivityModules;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pomingpo on 2017/6/15.
 */
public class LoginPresenterTest {

    LoginPresenter loginPresenter;


    @Before
    public void setUp() throws Exception {
        MainactivityComponent component = DaggerMainactivityComponent.builder().mainActivityModules(new MainActivityModules()).build();
        loginPresenter = component.getLoginPresenter();


    }

    @Test
    public void checkIfLoginAttemptIsExceeded() {
        Assert.assertEquals(1, loginPresenter.incrementLoginAttempt());
        Assert.assertEquals(2, loginPresenter.incrementLoginAttempt());
        Assert.assertEquals(3, loginPresenter.incrementLoginAttempt());
        Assert.assertFalse(loginPresenter.isLoginAttempExceeded());
    }

    @Test
    public void checkUsernameAndPasswordIsCorrect() {
        Assert.assertTrue(loginPresenter.isLoginSuccess("roy", "tdd"));
    }

    @After
    public void tearDown() throws Exception {

    }

}