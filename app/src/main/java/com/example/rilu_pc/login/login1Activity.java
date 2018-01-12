package com.example.rilu_pc.login;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login1Activity extends AppCompatActivity
{

    EditText et_username, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
    }
    public void rclick(View s)
    {


        Intent i = new Intent(login1Activity.this, SignupActivity.class);
        startActivity(i);
    }

    public static boolean isValidPassword(final String password)
    {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }

    public void click(View r)
    {
        String u = et_username.getText().toString();
        String p = et_password.getText().toString();


        if (!u.equals(""))
        {
            if (!p.equals("")) {
                boolean a=isValidPassword(p);
                if (p.length() < 8 && !a ) {
                    Toast.makeText(this, "password must contain min 8 character", Toast.LENGTH_LONG).show();
                    System.out.println("Not Valid");
                } else {
                    System.out.println("Valid");
                    Intent i = new Intent(login1Activity.this, HomeActivity.class);
                    startActivity(i);
                }
            }

            else
                {
                    Toast.makeText(this, "password can't be empty", Toast.LENGTH_LONG).show();
                }
            }
            else
                {

                Toast.makeText(this, "username can't be empty", Toast.LENGTH_LONG).show();
                }
        }
    }





