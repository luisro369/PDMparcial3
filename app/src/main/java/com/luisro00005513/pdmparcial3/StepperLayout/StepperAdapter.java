package com.luisro00005513.pdmparcial3.StepperLayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import com.luisro00005513.pdmparcial3.Fragments.SignIn_Name;
import com.luisro00005513.pdmparcial3.Fragments.SignIn_Username;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;

public class StepperAdapter extends AbstractFragmentStepAdapter{

    private static final String KEY = "CURRENT_STEP_POSITION_KEY";


    public StepperAdapter(@NonNull FragmentManager fm, @NonNull Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position) {


        switch (position) {
            case 0:
                final SignIn_Name step1 = new SignIn_Name();
                Bundle b1 = new Bundle();
                b1.putInt(KEY,position);
                step1.setArguments(b1);
                return (Step) step1;
            case 1:
               final SignIn_Username step2 = new SignIn_Username();
               Bundle b2 = new Bundle();
               b2.putInt(KEY,position);
               step2.setArguments(b2);
               return (Step) step2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
