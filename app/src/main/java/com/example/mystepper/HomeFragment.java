package com.example.mystepper;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialDialogs;

import ernestoyaquello.com.verticalstepperform.Step;
import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;
import ernestoyaquello.com.verticalstepperform.listener.StepperFormListener;

public class HomeFragment extends Fragment implements StepperFormListener {
    private VerticalStepperFormView verticalStepperFormView;
    private UserNameStep userNameStep;
    private PassportImage passportImage;
    private PhoneNumberStep phoneNumberStep;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // Create the steps.
        userNameStep = new UserNameStep("Nama lengkap");
        phoneNumberStep = new PhoneNumberStep("No telepon");


        // Find the form view, set it up and initialize it.
        verticalStepperFormView = root.findViewById(R.id.stepper_form);
        verticalStepperFormView
                .setup(this, userNameStep, phoneNumberStep)
                .init();





        return root;

    }

    @Override
    public void onCompletedForm() {
        Dialog dialog = new Dialog(getContext());
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setContentView(R.layout.custome_dialog);
        final Button btnDone = dialog.findViewById(R.id.btnDone);

        btnDone.setOnClickListener(view -> {
            dialog.dismiss();
        });
        dialog.show();

    }

    @Override
    public void onCancelledForm() {

    }

    @Override
    public void onStepAdded(int index, Step<?> addedStep) {

    }

    @Override
    public void onStepRemoved(int index) {

    }
}




