package com.example.myars;
import com.example.myars.Dbhelper;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cancellation extends Activity {
	String password;
    EditText pnr,pass;
    public Dbhelper mHelper;
    String pnr1,pass1;
    Button cancel;
   
	public SQLiteDatabase database;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cancellation);
		Intent pqc= getIntent();
        password=pqc.getStringExtra("password");
		pnr=(EditText) findViewById(R.id.editText1);
		pass=(EditText) findViewById(R.id.editText2);
		cancel=(Button) findViewById(R.id.button1);
		mHelper=new Dbhelper(this);
		cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				pnr1=pnr.getText().toString().trim();
				pass1=pass.getText().toString().trim();
				System.out.println(password);
				System.out.println(pass1);
				if(password.equals(pass1))
				{
					System.out.println("+++++++++++++++++++++++");
				database=mHelper.getWritableDatabase();
				database.delete(Dbhelper.TABLE_NAME6, Dbhelper.KEY_PNR+"="+pnr1, null);
				Toast.makeText(getApplicationContext(), "Your Ticket is Successfully Cancelled Amount will be refunded to Your Account", Toast.LENGTH_LONG).show();	
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Password Does'nt Match", Toast.LENGTH_LONG).show();	
				}
				
			}
		});
	}	
}
