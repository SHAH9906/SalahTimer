package aidev.com.salahtimer.view;

import aidev.com.salahtimer.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {


    private static int SPLASH_SCREEN_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);




        new Handler().postDelayed(() -> {
            Intent i=new Intent(SplashScreen.this,
                    Router.class);
            //Intent is used to switch from one activity to another.


            startActivity(i);

            finish();
            //invoke the SecondActivity.
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT);


    }
}