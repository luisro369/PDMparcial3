package com.luisro00005513.pdmparcial3;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.luisro00005513.pdmparcial3.ViewModels.AppViewModel;


public class MainActivity extends AppCompatActivity {
    AppViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(AppViewModel.class);


        viewModel.token("00117716","00117716");

    }



}
