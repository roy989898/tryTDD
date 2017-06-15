package com.example.pomingpo.trytdd.Modules;

import com.example.pomingpo.trytdd.Presenter.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/15.
 */

@Module
public class MainActivityModules {

    @Provides
    LoginPresenter providePresenter() {
        return new LoginPresenter();
    }
}
