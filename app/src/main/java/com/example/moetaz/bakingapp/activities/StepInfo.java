package com.example.moetaz.bakingapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.moetaz.bakingapp.R;
import com.example.moetaz.bakingapp.fragments.StepInfoFragment;
import com.example.moetaz.bakingapp.fragments.ingredientsFragment;
import com.example.moetaz.bakingapp.utilities.MyUtilities;

public class StepInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_info);

        if(MyUtilities.IsIngredientFragment){
            MyUtilities.IsIngredientFragment = false;
            if(savedInstanceState == null){
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fstep,new ingredientsFragment(),"Ingredientinfo").commit();
            }
        }else {
            if(savedInstanceState == null){
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fstep,new StepInfoFragment(),"stepinfo").commit();
            }
        }

    }
}
