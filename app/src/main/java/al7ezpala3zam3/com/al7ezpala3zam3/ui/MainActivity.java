package al7ezpala3zam3.com.al7ezpala3zam3.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.github.barteksc.pdfviewer.PDFView;

import al7ezpala3zam3.com.al7ezpala3zam3.R;

public class MainActivity extends AppCompatActivity {


    PDFView al7ezAla3zam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        al7ezAla3zam=findViewById(R.id.pdfBook);

        String PDF = getIntent().getStringExtra("PDF");
        switch (PDF) {
            case "intro":
                al7ezAla3zam.fromAsset("introduction.pdf").load();
                break;
            case "sat":
                al7ezAla3zam.fromAsset("saturday.pdf").load();
                break;
            case "sun":
                al7ezAla3zam.fromAsset("sunday.pdf").load();
                break;
            case "mon":
                al7ezAla3zam.fromAsset("monday.pdf").load();
                break;
            case "tue":
                al7ezAla3zam.fromAsset("tuesday.pdf").load();
                break;
            case "wed":
                al7ezAla3zam.fromAsset("wednesday.pdf").load();
                break;
            case "thu":
                al7ezAla3zam.fromAsset("thursday.pdf").load();
                break;
            case "fri":
                al7ezAla3zam.fromAsset("friday.pdf").load();
                break;
            case "importantReferences":
                al7ezAla3zam.fromAsset("importantReferences.pdf").load();
                break;

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.btn_intro:
                al7ezAla3zam.fromAsset("introduction.pdf").load();
                return true;
            case R.id.btn_Saturday:
                al7ezAla3zam.fromAsset("saturday.pdf").load();
                return true;
            case R.id.btn_Sunday:
                al7ezAla3zam.fromAsset("sunday.pdf").load();
                return true;
            case R.id.btn_Monday:
                al7ezAla3zam.fromAsset("monday.pdf").load();
                return true;
            case R.id.btn_Tuesday:
                al7ezAla3zam.fromAsset("tuesday.pdf").load();
                return true;
            case R.id.btn_Wednesday:
                al7ezAla3zam.fromAsset("wednesday.pdf").load();
                return true;
            case R.id.btn_Friday:
                al7ezAla3zam.fromAsset("friday.pdf").load();
                return true;
            case R.id.btn_importantReferences:
                al7ezAla3zam.fromAsset("importantReferences.pdf").load();
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        Intent books =new Intent(getApplicationContext(),PdfBook.class);
        startActivity(books);
        finish();
    }
}
