package com.example.AndroidSignUpPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.AndroidSignUpPage.model.UserDetailModel;
import com.example.radhekrishnya.R;
import com.example.radhekrishnya.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnSign.setOnClickListener(view -> {
            String name = binding.name.getText().toString();
            String email = binding.email.getText().toString();
            String password = binding.password.getText().toString();
            UserDetailModel userModel = new  UserDetailModel(name, email, password);
            Intent intent = new Intent(this, UserDetailActivity.class);
            intent.putExtra("userModel", userModel);
            startActivity(intent);
        });

    }
}