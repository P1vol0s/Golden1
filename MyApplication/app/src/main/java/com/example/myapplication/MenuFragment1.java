package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MenuFragment1 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Golden_Knight Gk = new Golden_Knight();
        Intent i = new Intent(Gk, Login_activity.class);
        startActivity(i);
        return inflater.inflate(R.layout.fragment_menu1, container, false);
    }
}