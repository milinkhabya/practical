package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t1;
    FirebaseDatabase f;
    DatabaseReference r;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b= (Button)findViewById(R.id.button);
       t1=(EditText)findViewById(R.id.text2);

    }

    public void onSubmit(View view) {
        final String e = t1.getText().toString();
        user = new User();
        r=f.getInstance().getReference().child("Email");
        user.setEmail(e);
        r.push().setValue(user);

    }

}