package com.acme.loginsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Carlos on 29/04/2016.
 */
public class Welcome_Activity extends Activity {


    private TextView textViewUserName;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page_layout);

        username = getIntent().getStringExtra("userName");
        textViewUserName =  (TextView) findViewById(R.id.textview_user_name);

        textViewUserName.setText(username);

    }

}
