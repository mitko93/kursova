package courier.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
    }
    public void Reset(View view) {
        EditText name = (EditText) findViewById(R.id.regFullName);
        name.setText(null);
        EditText email = (EditText) findViewById(R.id.regEmail);
        email.setText(null);
        EditText city = (EditText) findViewById(R.id.regCity);
        city.setText(null);
        EditText addr = (EditText) findViewById(R.id.regAddress);
        addr.setText(null);
        EditText postCode = (EditText) findViewById(R.id.regPostCode);
        postCode.setText(null);
        EditText phone = (EditText) findViewById(R.id.regPhone);
        phone.setText(null);
        EditText pass = (EditText) findViewById(R.id.regPass);
        pass.setText(null);


    }


}
