package com.example.mystepper;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import ernestoyaquello.com.verticalstepperform.Step;

public class PhoneNumberStep extends Step<String> {

    private EditText etPhoneNumber;

    protected PhoneNumberStep(String title) {
        super(title);
    }

    @Override
    public String getStepData() {
        etPhoneNumber.getText();
        return etPhoneNumber.getText().toString();
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    protected void restoreStepData(String data) {
        etPhoneNumber.setText(getStepData());

    }

    @Override
    protected IsDataValid isStepDataValid(String stepData) {
        boolean isNameValid = etPhoneNumber.length() >= 3;
        String errorMessage = !isNameValid ? "3 characters minimum" : "";
        return new IsDataValid(isNameValid, "Isi nomor telepon");
    }

    @Override
    protected View createStepContentLayout() {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.step_phone_number, null, false);
        etPhoneNumber = view.findViewById(R.id.et_phone);

        etPhoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                markAsCompletedOrUncompleted(true);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        return view;
    }

    @Override
    protected void onStepOpened(boolean animated) {

    }

    @Override
    protected void onStepClosed(boolean animated) {

    }

    @Override
    protected void onStepMarkedAsCompleted(boolean animated) {

    }

    @Override
    protected void onStepMarkedAsUncompleted(boolean animated) {

    }
}
