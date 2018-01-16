package com.example.myars;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.example.myars.Dbhelper;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Cancelflight extends Activity {
	Spinner flightno;
	String flightno1;
	public SQLiteDatabase database;
	   Cursor mCursor;
	   public Dbhelper mHelper;
	   Button cancel;
		 Set<String> set = new HashSet<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cancelflight);
		cancel=(Button) findViewById(R.id.button1);
		final Spinner sp=(Spinner) findViewById(R.id.spinner1);
		mHelper =new Dbhelper(this);
		 database = mHelper.getWritableDatabase();
		 mCursor= database.rawQuery("SELECT * FROM "+ Dbhelper.TABLE_NAME4,null);
         mCursor.moveToFirst();
         while(!mCursor.isAfterLast())
         {
        
             String s2=mCursor.getString(mCursor.getColumnIndex(Dbhelper.KEY_FLIGHTNO));
             set.add(s2);
             mCursor.moveToNext();
         }
         List<String> list = new ArrayList<String>(set);
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         sp.setAdapter(adapter);
         cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String selected=sp.getSelectedItem().toString();
				database=mHelper.getWritableDatabase();
				database.delete(Dbhelper.TABLE_NAME4, Dbhelper.KEY_FLIGHTNO+"="+selected, null);
				Toast.makeText(getApplicationContext(), "Flight Deleted Succesfully", Toast.LENGTH_LONG).show();
				
			}
		});
	}	
}
