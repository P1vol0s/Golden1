package com.example.golden_knight_project;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class WhoAreYouDialog extends DialogFragment implements Postman  {

    public String wich_rbuttop_presed;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] catNamesArray = {"Спортсмен", "Тренер", "Родитель"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите любимое имя кота")
                .setSingleChoiceItems(catNamesArray, -1,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int item) {

                                wich_rbuttop_presed = catNamesArray[item];
                            }
                        })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }


    @Override
    public void fragmentMail(String who_are_you_radiobutton) {
        who_are_you_radiobutton = wich_rbuttop_presed;
    }
}
