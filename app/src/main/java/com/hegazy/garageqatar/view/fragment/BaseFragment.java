package com.hegazy.garageqatar.view.fragment;


import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.view.activity.BaseActivity;


public abstract class BaseFragment extends Fragment {

    public BaseActivity baseActivity;

    public void setUpActivity() {
        baseActivity = (BaseActivity) getActivity();
        baseActivity.baseFragment = this;

    }

    public void onbacks(){
        baseActivity.superBackPressed();
    }

    public void onback(){
        baseActivity.superBackPressed();
        baseActivity.finish();

    }

    public void onBack() {
        baseActivity.superBackPressed();
       // baseActivity.finish();

    }


    @Override
    public void onStart() {
        super.onStart();
        setUpActivity();
    }


}
