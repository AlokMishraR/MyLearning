package com.example.myars;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends Activity {
	  Cursor mCursor;
	    public Dbhelper mHelper;
	    public SQLiteDatabase database;
	EditText username,password,dob,gender,city,contactno;
	String username1,password1,dob1,gender1,city1,contactno1,user1;
	Button update;
	ContentValues values;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		update=(Button) findViewById(R.id.button1);
		Intent pqut= getIntent();
        user1=pqut.getStringExtra("username");
		username=(EditText) findViewById(R.id.editText1);
		password=(EditText) findViewById(R.id.editText2);
		dob=(EditText) findViewById(R.id.editText3);
		gender=(EditText) findViewById(R.id.editText4);
		city=(EditText) findViewById(R.id.editText5);
		contactno=(EditText) findViewById(R.id.editText6);
		mHelper=new Dbhelper(this);
        database=mHelper.getWritableDatabase(); 
        mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME2,null);
	     mCursor.moveToFirst();
	     while(!mCursor.isAfterLast())
         {
         	    username1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_USER1));
              password1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_PASSWORD1));
              dob1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_DOB));
             gender1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_GENDER));
             city1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_CITY));
             contactno1=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_CONTACT));
            
            if(username1.equals(user1))
            {
          	 username.setText(username1);
          	password.setText(password1);
          	dob.setText(dob1);
          	gender.setText(gender1);
          	city.setText(city1);
          	contactno.setText(contactno1);
            }
           
             mCursor.moveToNext();
         }
	     update.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				username1=username.getText().toString().trim();
				password1=password.getText().toString().trim();
				dob1=dob.getText().toString().trim();
				gender1=gender.getText().toString().trim();
				city1=city.getText().toString().trim();
				contactno1=contactno.getText().toString().trim();
				database=mHelper.getWritableDatabase();
				values=new ContentValues();
				values.put(Dbhelper.KEY_USER1,username1);
				values.put(Dbhelper.KEY_PASSWORD1,password1);
				values.put(Dbhelper.KEY_DOB,dob1);
				values.put(Dbhelper.KEY_GENDER,gender1);
				values.put(Dbhelper.KEY_CITY,city1);
				values.put(Dbhelper.KEY_CONTACT,contactno1);
				database.insert(Dbhelper.TABLE_NAME2, null, values);
				database.close();
				Toast.makeText(getApplicationContext(), "Value Updated Successfully", Toast.LENGTH_LONG).show();
			}
		});
	     
	}	
}
