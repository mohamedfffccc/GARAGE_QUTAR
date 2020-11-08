package com.hegazy.garageqatar.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.fragment.home.HomeUserFragment;
import com.hegazy.garageqatar.view.fragment.login_and_signUp.LoginUserOrGarageFragment;

import static com.hegazy.garageqatar.helpar.HelperMethod.replaceFragment;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        replaceFragment(getSupportFragmentManager(), R.id.home_activity, new HomeUserFragment());
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}