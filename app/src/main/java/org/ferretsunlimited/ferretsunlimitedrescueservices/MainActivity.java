package org.ferretsunlimited.ferretsunlimitedrescueservices;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Clickable texview takes user to FURS website's homepage
    public void homepageLink(View view) {
        String url = "http://www.ferretsunlimited.org/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Clickable textview takes user to FURS facebook profile page
    public void facebookLink(View view) {
        String url = "https://www.facebook.com/FerretsUnlimited/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Donate Button takes user to PayPal FURS link
    public void donate(View view) {
        String url = "https://www.paypal.com/donate/?token=lkfXEnuoT-mRsyKBjCI0sjOE3G2fIbHgFbwNOHSvgBTeHcyw7rnnOuoaG6-ljyuAzlh620&country.x=US&locale.x=US";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Foster button takes user to FURS website, foster specific page
    public void foster(View view) {
        String url = "http://www.ferretsunlimited.org/foster.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Events link take user to events page on FURS Facebook profile
    public void events(View view) {
        String url = "http://www.facebook.com/pg/FerretsUnlimited/events/?ref=page_internal";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
