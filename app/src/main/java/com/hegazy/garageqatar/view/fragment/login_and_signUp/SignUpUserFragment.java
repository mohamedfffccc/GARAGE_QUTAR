package com.hegazy.garageqatar.view.fragment.login_and_signUp;


import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.hegazy.garageqatar.R;
import com.hegazy.garageqatar.helpar.HelperMethod;
import com.hegazy.garageqatar.view.activity.LoginActivity;
import com.hegazy.garageqatar.view.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.hegazy.garageqatar.helpar.HelperMethod.replaceFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpUserFragment extends BaseFragment {


    @BindView(R.id.fragment_sign_up_user_btn_loginiv_bake)
    ImageView fragmentSignUpUserBtnLoginivBake;
    @BindView(R.id.fragment_sign_up_user_tv_user_name)
    EditText fragmentSignUpUserTvUserName;
    @BindView(R.id.fragment_sign_up_user_tv_phone_number)
    EditText fragmentSignUpUserTvPhoneNumber;
    @BindView(R.id.fragment_sign_up_user_tv_password)
    EditText fragmentSignUpUserTvPassword;
    @BindView(R.id.fragment_sign_up_user_btn_sign_uP)
    Button fragmentSignUpUserBtnLogin;
    @BindView(R.id.fragment_sign_up_user_tv_login)
    TextView fragmentSignUpUserTvLogin;

    public SignUpUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up_user, container, false);

        ButterKnife.bind(this, view);


        fragmentSignUpUserTvLogin.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);


        return view;


    }

    @Override
    public void onback() {

    }

    @OnClick({R.id.fragment_sign_up_user_btn_loginiv_bake, R.id.fragment_sign_up_user_btn_sign_uP, R.id.fragment_sign_up_user_tv_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fragment_sign_up_user_btn_loginiv_bake:
                break;
            case R.id.fragment_sign_up_user_btn_sign_uP:
               replaceFragment(getActivity().getSupportFragmentManager(),R.id.activity_sign_up_user,new VerificationFragment());
                break;
            case R.id.fragment_sign_up_user_tv_login:
                startActivity(new Intent(getActivity(), LoginActivity.class));

                break;
        }
    }
}
