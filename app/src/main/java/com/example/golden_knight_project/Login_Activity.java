package com.example.golden_knight_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.os.Bundle;

import android.view.View;
import android.widget.*;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {

    private Button entrybtton;
    private Button loginbutton;
    private LoginFragment loginFragment = new LoginFragment();
    private EntryFragment entryFragment = new EntryFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        entrybtton = findViewById(R.id.entrybutton);
        entrybtton.setOnClickListener(this);

        loginbutton = findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(this);







    }

    @Override
    public void onClick(View view) {
        int onClick = view.getId();
        final int entrybuttonId = entrybtton.getId();
        final int loginbuttonId = loginbutton.getId();
        if (onClick == entrybuttonId) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.e_l_fragment, entryFragment);
            ft.commit();
        } else if (onClick == loginbuttonId) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.e_l_fragment, loginFragment);
            ft.commit();
        }
    }

    public void showDialog(View v) {
        WhoAreYouDialog whoAreYouDialog = new WhoAreYouDialog();
        whoAreYouDialog.show(getSupportFragmentManager(), "custom");
    }

}

