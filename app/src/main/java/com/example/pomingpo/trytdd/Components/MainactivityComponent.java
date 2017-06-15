package com.example.pomingpo.trytdd.Components;

import com.example.pomingpo.trytdd.MainActivity;
import com.example.pomingpo.trytdd.Modules.MainActivityModules;
import com.example.pomingpo.trytdd.Presenter.LoginPresenter;

import dagger.Component;

/**
 * Created by pomingpo on 2017/6/15.
 */

@Component(modules = MainActivityModules.class)
public interface MainactivityComponent {
    void inject(MainActivity activity);

    LoginPresenter getLoginPresenter();
}
