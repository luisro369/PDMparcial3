package com.luisro00005513.pdmparcial3.StepperLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.luisro00005513.pdmparcial3.R;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;


public class Stepper extends AppCompatActivity implements StepperLayout.StepperListener {

    private StepperLayout mStep;
    private StepperAdapter mStepperAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper);
        mStep= findViewById(R.id.stepper_layout);
        mStepperAdapter = new StepperAdapter(getSupportFragmentManager(),this);

        mStep.setAdapter(mStepperAdapter);
        mStep.setListener(this);
    }

    @Override
    public void onCompleted(View completeButton) {


    }

    @Override
    public void onError(VerificationError verificationError) {

    }

    @Override
    public void onStepSelected(int newStepPosition) {

    }

    @Override
    public void onReturn() {
        finish();
    }
}

