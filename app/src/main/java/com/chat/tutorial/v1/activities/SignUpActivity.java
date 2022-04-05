package com.chat.tutorial.v1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chat.tutorial.v1.R;
import com.chat.tutorial.v1.databinding.ActivitySignInBinding;
import com.chat.tutorial.v1.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(view -> onBackPressed());
    }
}