package com.hegazy.garageqatar.view.activity;

import android.os.Bundle;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.fragment.login_and_signUp.LoginUserOrGarageFragment;

import static com.hegazy.garageqatar.helpar.HelperMethod.replaceFragment;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        replaceFragment(getSupportFragmentManager(), R.id.activity_login, new LoginUserOrGarageFragment());

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}