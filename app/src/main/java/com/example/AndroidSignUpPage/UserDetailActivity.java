package com.example.AndroidSignUpPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.AndroidSignUpPage.model.UserDetailModel;
import com.example.radhekrishnya.R;
import com.example.radhekrishnya.databinding.ActivityUserDetailBinding;

public class UserDetailActivity extends AppCompatActivity {
    private ActivityUserDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail);
        Intent intent = getIntent();
        UserDetailModel userDetailModel = (UserDetailModel) intent.getSerializableExtra("userModel");
        if (userDetailModel != null) {
            binding.tvUserDetail.setText(
                    "Name- " + userDetailModel.getName() + "\n" + "Email- " + userDetailModel.getEmail() + "\n" + "Password- " + userDetailModel.getPassword()
            );
        } else {
            binding.tvUserDetail.setText("No data found");
        }

    }

}