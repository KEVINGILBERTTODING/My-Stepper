package com.example.mystepper;

import static android.app.Activity.RESULT_OK;
import static androidx.core.app.ActivityCompat.startActivityForResult;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import java.io.FileNotFoundException;
import java.io.IOException;

import ernestoyaquello.com.verticalstepperform.Step;

public class PassportImage extends Step<String> {
    private ImageView ivPassport;
    private Button btnSelectImage;
    Bitmap bitmap;
    private final int TAG_GALLERY = 2222;


    public PassportImage(String title) {
        super(title);
    }

    @Override
    public String getStepData() {
        return null;
    }

    @Override
    public String getStepDataAsHumanReadableString() {
        return null;
    }

    @Override
    protected void restoreStepData(String data) {

    }

    @Override
    protected IsDataValid isStepDataValid(String stepData) {
        return null;
    }

    @Override
    protected View createStepContentLayout() {

        View root = LayoutInflater.from(getContext()).inflate(R.layout.step_passport, null, false);

        btnSelectImage = root.findViewById(R.id.btn_sleect);

       btnSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        return root;

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
