package com.hegazy.garageqatar.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.adapter.ViewPagerDeskavreAdapter;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_1Fragment;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_2Fragment;
import com.hegazy.garageqatar.view.fragment.deskavre.Deskavre_3Fragment;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class DeskavreActivity extends BaseActivity {

    ViewPager vp_descovery;
    ViewPagerDeskavreAdapter viewPagerDeskavreAdapter;
    DotsIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskavre);
        vp_descovery = findViewById(R.id.activity_deskavre_vp_deskavre);
        indicator = findViewById(R.id.activity_deskavre_indicator);


        viewPagerDeskavreAdapter = new ViewPagerDeskavreAdapter(getSupportFragmentManager());
        viewPagerDeskavreAdapter.addPager(new Deskavre_1Fragment());
        viewPagerDeskavreAdapter.addPager(new Deskavre_2Fragment());
        viewPagerDeskavreAdapter.addPager(new Deskavre_3Fragment());
        vp_descovery.setAdapter(viewPagerDeskavreAdapter);
        indicator.setViewPager(vp_descovery);



    }
}