package com.manuni.viewbindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.manuni.viewbindingdemo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    //the differences is here only in the activity name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // all the codes are same

        binding.myTxtViewId.setText("Gabriel");

        //just only seeing purpose...ok?
    }
}