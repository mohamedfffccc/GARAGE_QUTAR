package com.hegazy.garageqatar.view.activity;

import android.os.Bundle;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.fragment.login_and_signUp.SignUpUserFragment;

import static com.hegazy.garageqatar.helpar.HelperMethod.replaceFragment;

public class SignUpUserActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_user);


        replaceFragment(getSupportFragmentManager(), R.id.activity_sign_up_user, new SignUpUserFragment());

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}