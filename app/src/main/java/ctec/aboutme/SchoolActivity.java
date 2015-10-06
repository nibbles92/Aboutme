package ctec.aboutme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SchoolActivity extends AppCompatActivity
{
    private Button familyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_school);

        familyButton = (Button) findViewById(R.id.goToFamilyButton);

        setupListeners();
    }

    private void setupListeners()
    {
        familyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(familyButton.getContext(), FamilyActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}
