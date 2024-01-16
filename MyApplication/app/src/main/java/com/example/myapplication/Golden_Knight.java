package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Golden_Knight extends AppCompatActivity {

    private Button btn_menu = findViewById(R.id.menu_button);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        //setMenuFragment();

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMenuFragment();

            }
        });

    }

    private void setMenuFragment() {
        MenuFragment1 menuFragment1 = new MenuFragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.menu_layout, menuFragment1);
        ft.commit();

    }
}