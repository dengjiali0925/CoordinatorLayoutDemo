package com.example.administrator.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button useConstraintLayout;
    private Button useCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();
    }

    private void initView()
    {
        useConstraintLayout = (Button) findViewById(R.id.use_constraint_layout);
        useCoordinatorLayout = (Button) findViewById(R.id.use_coordinator_layout);
    }

    private void setListener()
    {
        useConstraintLayout.setOnClickListener(this);
        useCoordinatorLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.use_constraint_layout:
            {
                startActivity(new Intent(this, ConstrainLayoutUsedActivity.class));
                break;
            }

            case R.id.use_coordinator_layout:
            {
                startActivity(new Intent(this, CoordinatorLayoutUsedActivity.class));
                break;
            }
            default:
                break;
        }
    }
}
