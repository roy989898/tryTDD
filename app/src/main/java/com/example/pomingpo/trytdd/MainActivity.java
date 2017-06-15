package com.example.pomingpo.trytdd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.pomingpo.trytdd.Components.DaggerMainactivityComponent;
import com.example.pomingpo.trytdd.Modules.MainActivityModules;
import com.example.pomingpo.trytdd.Presenter.LoginPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainactivityComponent.builder().mainActivityModules(new MainActivityModules()).build().inject(this);


        Log.d("asd", "sad");
    }
}
