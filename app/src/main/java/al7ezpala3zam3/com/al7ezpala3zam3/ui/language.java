package al7ezpala3zam3.com.al7ezpala3zam3.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import al7ezpala3zam3.com.al7ezpala3zam3.R;

public class language extends AppCompatActivity implements View.OnClickListener {

    Button englishBtn,arabicBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        englishBtn=findViewById(R.id.btn_En);
        arabicBtn=findViewById(R.id.btn_ar);
        englishBtn.setOnClickListener(this);
        arabicBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_En:
                Intent intent = new Intent(getBaseContext(), PdfBook.class);
                startActivity(intent);
                updateLanguage("en");
                finish();
                break;

            case R.id.btn_ar:
                Intent intent2 = new Intent(getBaseContext(), PdfBook.class);
                startActivity(intent2);
                updateLanguage("ar");
                finish();
                break;
        }

    }

    @Override
    public void recreate() {
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            super.recreate();
        } else {
            startActivity(getIntent());
            finish();
        }
    }

    private void updateLanguage(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        SharedPreferences languagepref = getSharedPreferences("language", MODE_PRIVATE);
        SharedPreferences.Editor editor = languagepref.edit();
        editor.putString("languageToLoad", language);
        editor.apply();

        recreate();
    }
        @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.splashscreen)
                .setTitle(R.string.exit)
                .setMessage(R.string.Do_you_want_to_exit)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        })
                .show();
    }
}
