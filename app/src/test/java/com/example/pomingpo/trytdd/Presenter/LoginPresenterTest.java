package com.example.pomingpo.trytdd.Presenter;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pomingpo on 2017/6/15.
 */
public class LoginPresenterTest {
    @Before
    public void setUp() throws Exception {




    }

    @Test
    public void checkIfLoginAttemptIsExceeded() {
        LoginPresenter loginPresenter = new LoginPresenter();
        Assert.assertEquals(1, loginPresenter.incrementLoginAttempt());
        Assert.assertEquals(2, loginPresenter.incrementLoginAttempt());
        Assert.assertEquals(3, loginPresenter.incrementLoginAttempt());
        Assert.assertFalse(loginPresenter.isLoginAttempExceeded());
    }

    @Test
    public void checkUsernameAndPasswordIsCorrect(){
        LoginPresenter loginPresenter = new LoginPresenter();
        Assert.assertTrue(loginPresenter.isLoginSuccess("roy","tdd"));
    }

    @After
    public void tearDown() throws Exception {

    }

}