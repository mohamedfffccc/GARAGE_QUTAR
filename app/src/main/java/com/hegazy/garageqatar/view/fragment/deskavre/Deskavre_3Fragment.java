package com.hegazy.garageqatar.view.fragment.deskavre;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.activity.LoginActivity;
import com.hegazy.garageqatar.view.activity.GarageOrUserActivity;
import com.hegazy.garageqatar.view.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class Deskavre_3Fragment extends BaseFragment {


    public Deskavre_3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deskavre_3, container, false);

        ButterKnife.bind(this, view);

        return view;


    }

    @Override
    public void onback() {

    }

    @OnClick({R.id.fragment_deskavre_3_iv_bake, R.id.fragment_deskavre_3_tv_skip, R.id.activity_login_garage_or_user_btn_login,R.id.activity_login_sign_up})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_deskavre_3_iv_bake:
                onBack();
                break;
            case R.id.fragment_deskavre_3_tv_skip:
                startActivity(new Intent(getActivity(), GarageOrUserActivity.class));

                break;
            case R.id.activity_login_garage_or_user_btn_login:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
                case R.id.activity_login_sign_up:
                startActivity(new Intent(getActivity(), GarageOrUserActivity.class));
                break;
        }
    }
}
