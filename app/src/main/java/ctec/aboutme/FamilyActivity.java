package ctec.aboutme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FamilyActivity extends AppCompatActivity
{
    private Button skateboardingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        skateboardingButton = (Button) findViewById(R.id.Skate);

        setupListeners();
    }

    private void setupListeners()
    {
        skateboardingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View ButtonView)
            {
               Intent myIntent = new Intent(skateboardingButton.getContext(),skateboardingActivity.class);
               startActivityForResult(myIntent, 0);
            }
        });
    }

}
