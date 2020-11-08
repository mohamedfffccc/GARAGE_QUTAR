package com.hegazy.garageqatar.view.fragment.login_and_signUp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.fragment.BaseFragment;

import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class VerificationFragment extends BaseFragment {


    public VerificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_verification, container, false);

        ButterKnife.bind(this,view);

        return view;


    }

    @Override
    public void onback() {

    }

}
