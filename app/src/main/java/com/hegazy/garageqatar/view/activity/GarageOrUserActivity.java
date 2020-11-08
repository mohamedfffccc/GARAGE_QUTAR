package com.hegazy.garageqatar.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hegazy.garageqatar.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GarageOrUserActivity extends AppCompatActivity {

    @BindView(R.id.activity_garage_or_user_btn_you_are_a_garage_other)
    Button activityGarageOrUserBtnYouAreAGarageOther;
    @BindView(R.id.activity_garage_or_user_btn_you_are_a_user)
    Button activityGarageOrUserBtnYouAreAUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_or_user);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.activity_garage_or_user_btn_you_are_a_garage_other, R.id.activity_garage_or_user_btn_you_are_a_user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.activity_garage_or_user_btn_you_are_a_garage_other:
                startActivity(new Intent(GarageOrUserActivity.this, SignUpGarageActivity.class));

                break;
            case R.id.activity_garage_or_user_btn_you_are_a_user:
                startActivity(new Intent(GarageOrUserActivity.this, SignUpUserActivity.class));
                break;
        }
    }
}