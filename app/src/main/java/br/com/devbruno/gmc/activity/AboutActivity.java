package br.com.devbruno.gmc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.devbruno.gmc.R;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        String acao;
        try {
            acao = getIntent().getExtras().get("acao").toString();
        } catch (NullPointerException e) {
            acao = "Google Study Jam";
        }
        Toast.makeText(this, acao, Toast.LENGTH_SHORT).show();

    }
}
