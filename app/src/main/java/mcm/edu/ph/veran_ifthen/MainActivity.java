package mcm.edu.ph.veran_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("Diluc offers you to walk home to your apartment, what would you do?");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtDecision);





        switch (view.getId()){
            case R.id.btnDecision1:
                txtDecision.setText("Diluc offers his hand to you and walked you home safely.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("Diluc nodded with a sad smile and asked you to message him if you got home safely.");
                break;

        }
    }
}