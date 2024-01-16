package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn_menu = findViewById(R.id.menu_button);
    private int count_pressing = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);



        setMenuFragment();
        if (count_pressing == 0){
            btn_menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setMenuFragment();
                    count_pressing += 1;
                }
            });
        }else{
            MenuFragment1 menuFragment1 = new MenuFragment1();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.menu_layout,menuFragment1);

        }
    }

    private void setMenuFragment() {
        MenuFragment1 menuFragment1 = new MenuFragment1();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.menu_layout,menuFragment1);
        ft.commit();

    }
}