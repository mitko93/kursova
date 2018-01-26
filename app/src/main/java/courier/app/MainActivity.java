package courier.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Open Courier Login Activity
    public void OpenCourLogIn(View view) {
        Intent intent = new Intent(this, CourierLoginActivity.class);
        startActivity(intent);
    }
    public void OpenUsrLogIn(View view) {
        Intent usrintent = new Intent(this, UserLoginActivity.class);
        startActivity(usrintent);
    }
}
