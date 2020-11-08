package com.hegazy.garageqatar.view.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.adapter.ViewPagerDeskavreAdapter;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_1Fragment;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_2Fragment;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_3Fragment;
import com.hegazy.garageqatar.view.fragment.signUpGarage.SignUp1Fragment;
import com.hegazy.garageqatar.view.fragment.signUpGarage.SignUp2Fragment;
import com.hegazy.garageqatar.view.fragment.signUpGarage.SignUp3Fragment;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpGarageActivity extends BaseActivity {

    @BindView(R.id.activity_sign_up_garage_vp_sign_up_garage)
    ViewPager activitySignUpGarageVpSignUpGarage;
    @BindView(R.id.activity_sign_up_garage_indicator)
    DotsIndicator activitySignUpGarageIndicator;


    ViewPagerDeskavreAdapter viewPagerDeskavreAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_garage);
        ButterKnife.bind(this);



        viewPagerDeskavreAdapter = new ViewPagerDeskavreAdapter(getSupportFragmentManager());
        viewPagerDeskavreAdapter.addPager(new SignUp1Fragment());
        viewPagerDeskavreAdapter.addPager(new SignUp2Fragment());
        viewPagerDeskavreAdapter.addPager(new SignUp3Fragment());
        activitySignUpGarageVpSignUpGarage.setAdapter(viewPagerDeskavreAdapter);
        activitySignUpGarageIndicator.setViewPager(activitySignUpGarageVpSignUpGarage);


    }
}