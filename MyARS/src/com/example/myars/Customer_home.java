package com.example.myars;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class Customer_home extends ListActivity {
	String user1,password1;

	static final String[]FRUITS={"Search Flight","Ticket Reservation","Ticket Cancellation","PNR Status","Fare Enquiry","Flight Status","Profile"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent pqu= getIntent();
         user1=pqu.getStringExtra("username");
         password1=pqu.getStringExtra("password");
         
		setListAdapter(new ArrayAdapter<Object>(this,R.layout.customer_home,FRUITS));
		android.widget.ListView listview=getListView();
		//setContentView(R.layout.activity_one);
		listview.setOnItemClickListener(new OnItemClickListener() {
	

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		
		if(((TextView)view).getText()=="Search Flight")
		{
			Intent a=new Intent(Customer_home.this,Searchflight.class);
			startActivity(a);
		}
		 if(((TextView)view).getText()=="Ticket Reservation")
		{
			 Intent b=new Intent(Customer_home.this,Reservation.class);
				startActivity(b);
			
		}
		 if(((TextView)view).getText()=="Ticket Cancellation")
			{
			 Intent c=new Intent(Customer_home.this,Cancellation.class);
			 c.putExtra("password", password1);
				startActivity(c);
			}
		 if(((TextView)view).getText()=="PNR Status")
			{
			 Intent d=new Intent(Customer_home.this,Pnrenquiry.class);
				startActivity(d);
			}
		 if(((TextView)view).getText()=="Fare Enquiry")
			{
			 Intent e=new Intent(Customer_home.this,Fareenquiry.class);
				startActivity(e);
			}
		 if(((TextView)view).getText()=="Flight Status")
			{
			 Intent f=new Intent(Customer_home.this,Flightstatus.class);
				startActivity(f);
				
			}
		 if(((TextView)view).getText()=="Profile")
			{
			 Intent g=new Intent(Customer_home.this,Profile.class);
			 g.putExtra("username", user1);
				startActivity(g);
			}
	}
		});
		
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.one, menu);
		return true;
	}

}
