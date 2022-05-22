package com.manuni.viewbindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.manuni.viewbindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //you can use binding or any name here as object


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        //just call all the views id using binding here
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              String values =  binding.editTxt.getText().toString();
                binding.textView.setText(values);
            }
        });

        binding.imageViewId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image view is clicked!", Toast.LENGTH_SHORT).show();
            }
        });




    }
}