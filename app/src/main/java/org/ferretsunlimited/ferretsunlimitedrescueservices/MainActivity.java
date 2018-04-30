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

    //Clickable texview takes user to website's homepage
    public void homepageLink(View view) {
        String url = "http://www.ferretsunlimited.org/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Clickable textview takes user to facebook profile page
    public void facebookLink(View view) {
        String url = "https://www.facebook.com/FerretsUnlimited/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Donate Button takes user to PayPal custom link
    public void donate(View view) {
        String url = "https://www.paypal.com/donate/?token=NbMKMLLjtd0J6ROca2oY-UtVT1ILpPOwIRvIyctplxJEt-DygcqWQPqmFCcjRq5CprzyzW&country.x=US&locale.x=US";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Foster button takes user to ferretsunlimited website, foster specific page
    public void foster(View view) {
        String url = "http://www.ferretsunlimited.org/foster.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    //Events link take user to events page on their Facebook profile
    public void events(View view) {
        String url = "http://www.facebook.com/pg/FerretsUnlimited/events/?ref=page_internal";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
