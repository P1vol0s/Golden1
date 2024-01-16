package com.example.golden_knight_project;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import android.view.ViewGroup;

import java.util.Objects;


public class LoginFragment extends Fragment implements Postman {

    EditText editText;
    Button who_are_you_button;
    Button finishButton;
    public String who_are_you = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        who_are_you_button = view.findViewById(R.id.who_are_you_button);
        editText = view.findViewById(R.id.firstname);
        who_are_you_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getChildFragmentManager();
                WhoAreYouDialog whoAreYouDialog = new WhoAreYouDialog();
                whoAreYouDialog.show(fm, "whoAreYouDialog");
                System.out.println("Да блять нажата она");
            }
        });

        return view;
    }



    @Override
    public void fragmentMail(String who_are_you_radiobutton) {
        if (Objects.equals(who_are_you_radiobutton, "Спортсмен")){
            Toast.makeText(getActivity(), "Yes", Toast.LENGTH_SHORT).show();
        }



    }
}