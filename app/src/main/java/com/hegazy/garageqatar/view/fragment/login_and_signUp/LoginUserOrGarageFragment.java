package com.hegazy.garageqatar.view.fragment.login_and_signUp;


import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.view.activity.HomeActivity;
import com.hegazy.garageqatar.view.activity.SignUpUserActivity;
import com.hegazy.garageqatar.view.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginUserOrGarageFragment extends BaseFragment {


    @BindView(R.id.fragment_login_user_tv_phone_number)
    EditText fragmentLoginUserTvPhoneNumber;
    @BindView(R.id.fragment_login_user_tv_password)
    EditText fragmentLoginUserTvPassword;
    @BindView(R.id.fragment_login_user_btn_login)
    Button fragmentLoginUserBtnLogin;
    @BindView(R.id.fragment_login_user_tv_sign_up)
    TextView fragmentLoginUserTvSignUp;

    public LoginUserOrGarageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_user_or_garage, container, false);

        ButterKnife.bind(this, view);


        fragmentLoginUserTvSignUp.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


        return view;


    }

    @Override
    public void onback() {

    }


    @OnClick({R.id.fragment_login_user_btn_login, R.id.fragment_login_user_tv_sign_up})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fragment_login_user_btn_login:
                startActivity(new Intent(getActivity(), HomeActivity.class));

                break;
            case R.id.fragment_login_user_tv_sign_up:
                startActivity(new Intent(getActivity(), SignUpUserActivity.class));
                break;
        }
    }
}
