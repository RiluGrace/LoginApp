package com.example.rilu_pc.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity
{
    EditText et_name,et_addrs,et_username,et_password;
    RadioButton radioM,radioF;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et_name=findViewById(R.id.et_name);
        et_addrs=findViewById(R.id.et_addrs);
        radioM=findViewById(R.id.radioM);
        radioF=findViewById(R.id.radioF);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);

    }
    public void rclick(View s)

    {
        String n=et_name.getText().toString();
        String a=et_addrs.getText().toString();
        String m=radioM.getText().toString();
        String f=radioF.getText().toString();
        String u=et_username.getText().toString();
        String p=et_password.getText().toString();


        if(!n.equals("")&& !a.equals(""))
        {
        if(!u.equals("")&&!p.equals(""))
                   {
                       Intent i=new Intent(SignupActivity.this,login1Activity.class);
                        startActivity(i);
                    }
            else
            {
                Toast.makeText(this, "username,password can't be empty", Toast.LENGTH_LONG).show();
            }

        }
        else
        {

            Toast.makeText(this, "fill all the fields", Toast.LENGTH_LONG).show();
        }


    }
}
