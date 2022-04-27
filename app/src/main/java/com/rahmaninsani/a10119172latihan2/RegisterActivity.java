package com.rahmaninsani.a10119172latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    NIM     : 10119172
    Nama    : Rahman Insani
    Kelas   : IF-5

    Senin, 25 April 2022
*/

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.back_button)
    void backToLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.register_button)
    void almostThereActivity() {
        Intent intent = new Intent(this, AlmostThereActivity.class);
        startActivity(intent);
    }
}