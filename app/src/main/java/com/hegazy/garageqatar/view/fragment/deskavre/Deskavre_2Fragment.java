package com.hegazy.garageqatar.view.fragment.deskavre;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.activity.GarageOrUserActivity;
import com.hegazy.garageqatar.view.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class Deskavre_2Fragment extends BaseFragment {


    public Deskavre_2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deskavre_2, container, false);

        ButterKnife.bind(this, view);

        return view;


    }

    @Override
    public void onback() {

    }

    @OnClick({R.id.fragment_deskavre_2_iv_bake, R.id.fragment_deskavre_2_tv_skip})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_deskavre_2_iv_bake:
                onBack();
                break;
            case R.id.fragment_deskavre_2_tv_skip:
                startActivity(new Intent(getActivity(), GarageOrUserActivity.class));

                break;
        }
    }
}
