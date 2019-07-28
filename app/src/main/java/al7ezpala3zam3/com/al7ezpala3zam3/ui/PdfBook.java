package al7ezpala3zam3.com.al7ezpala3zam3.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import al7ezpala3zam3.com.al7ezpala3zam3.R;
import al7ezpala3zam3.com.al7ezpala3zam3.utils.Reminder;

public class PdfBook extends AppCompatActivity implements View.OnClickListener {

    Button introBtn,satBtn,sunBtn,monBtn,tueBtn,wedBtn,thuBtn,friBtn,importantReferencesBtn,addReminderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_book);
        introBtn=findViewById(R.id.btn_intro);
        satBtn=findViewById(R.id.btn_Saturday);
        sunBtn=findViewById(R.id.btn_Sunday);
        monBtn=findViewById(R.id.btn_Monday);
        tueBtn=findViewById(R.id.btn_Tuesday);
        wedBtn=findViewById(R.id.btn_Wednesday);
        thuBtn=findViewById(R.id.btn_Thursday);
        friBtn=findViewById(R.id.btn_Friday);
        importantReferencesBtn=findViewById(R.id.btn_importantReferences);
        addReminderBtn =findViewById(R.id.btn_addReminder);

        introBtn.setOnClickListener(this);
        satBtn.setOnClickListener(this);
        sunBtn.setOnClickListener(this);
        monBtn.setOnClickListener(this);
        tueBtn.setOnClickListener(this);
        wedBtn.setOnClickListener(this);
        thuBtn.setOnClickListener(this);
        friBtn.setOnClickListener(this);
        addReminderBtn.setOnClickListener(this);
        importantReferencesBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_intro:
                Intent intro = new Intent(getBaseContext(), MainActivity.class);
                intro.putExtra("PDF", "intro");
                startActivity(intro);
                finish();
                break;
            case R.id.btn_Saturday:
                Intent sat = new Intent(getBaseContext(), MainActivity.class);
                sat.putExtra("PDF", "sat");
                startActivity(sat);
                finish();
                break;
            case R.id.btn_Sunday:
                Intent sun = new Intent(getBaseContext(), MainActivity.class);
                sun.putExtra("PDF", "sun");
                startActivity(sun);
                finish();
                break;
            case R.id.btn_Monday:
                Intent mon = new Intent(getBaseContext(), MainActivity.class);
                mon.putExtra("PDF", "mon");
                startActivity(mon);
                finish();
                break;
            case R.id.btn_Tuesday:
                Intent tue = new Intent(getBaseContext(), MainActivity.class);
                tue.putExtra("PDF", "tue");
                startActivity(tue);
                finish();
                break;
            case R.id.btn_Wednesday:
                Intent wed = new Intent(getBaseContext(), MainActivity.class);
                wed.putExtra("PDF", "wed");
                startActivity(wed);
                finish();
                break;
            case R.id.btn_Thursday:
                Intent thu = new Intent(getBaseContext(), MainActivity.class);
                thu.putExtra("PDF", "thu");
                startActivity(thu);
                finish();
                break;
            case R.id.btn_Friday:
                Intent fri = new Intent(getBaseContext(), MainActivity.class);
                fri.putExtra("PDF", "fri");
                startActivity(fri);
                finish();
                break;
            case R.id.btn_importantReferences:
                Intent importantReferences = new Intent(getBaseContext(), MainActivity.class);
                importantReferences.putExtra("PDF", "importantReferences");
                startActivity(importantReferences);
                finish();
                break;
            case R.id.btn_addReminder:
                Intent addReminder = new Intent(getBaseContext(), Reminder.class);
                startActivity(addReminder);
                finish();
                break;
        }
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
