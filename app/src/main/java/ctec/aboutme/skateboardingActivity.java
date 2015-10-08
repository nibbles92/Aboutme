package ctec.aboutme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class skateboardingActivity extends AppCompatActivity
{
    private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skateboarding);

        HomeButton = (Button) findViewById(R.id.house);

        setupListeners();
    }

    private void setupListeners()
    {
        HomeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View ButtonView)
            {
               Intent myIntent = new Intent(HomeButton.getContext(), HomeActivity.class);
               startActivityForResult(myIntent, 0);
            }
        });
    }

}
