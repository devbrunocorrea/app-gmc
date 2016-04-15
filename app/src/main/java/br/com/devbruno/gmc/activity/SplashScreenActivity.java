package br.com.devbruno.gmc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.devbruno.gmc.R;

public class SplashScreenActivity extends Activity implements Runnable {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        Handler handler = new Handler();
        handler.postDelayed(this, 3000);

    }

    @Override
    public void run() {
        Intent intent = new Intent(this, PrincipalActivity.class);
        startActivity(intent);
    }
}
