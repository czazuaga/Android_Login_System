package com.acme.loginsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import my_resources.Alerts;

public class Login_Activity extends AppCompatActivity {

    private EditText editTextUserNameField;
    private EditText editTextPasswordField;

    //These parameters may come from requests to the register users list from a database
    private String requiredUser = "Carlos90";
    private String requiredPassword = "1234";

    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page_layout);

        editTextUserNameField = (EditText) findViewById(R.id.editTextUserField);
        editTextPasswordField = (EditText) findViewById(R.id.editTextPasswordField);

        buttonOk = (Button) findViewById(R.id.buttonOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String introducedUser = editTextUserNameField.getText().toString();
                String introducedPassword = editTextPasswordField.getText().toString();

                if (introducedUser.equals(requiredUser)&&introducedPassword.equals(requiredPassword)){
                    access(introducedUser);
                }else{
                    Alerts.showToast(Login_Activity.this,getResources().getString(R.string.insert_username));
                    editTextPasswordField.setText("");
                }

            }
        });

    }

    public void access(String nombreUsuario) {
        Intent i = new Intent(this,Welcome_Activity.class);
        i.putExtra("userName",nombreUsuario);
        startActivity(i);

    }
}
