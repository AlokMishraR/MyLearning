package com.example.myars;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dbhelper extends SQLiteOpenHelper {
	static String DATABASE_NAME="ARS";
	
	public static final String TABLE_NAME1="login";
	public static final String TABLE_NAME2="customer";
	public static final String TABLE_NAME3="fare";
	public static final String TABLE_NAME4="flightinfo";
	public static final String TABLE_NAME5="reservation";
	public static final String TABLE_NAME6="reservationpnr";
	// Login Table Attributes
	public  final static String KEY_USER="username";
	public final  String KEY_PASSWORD="password";
	public final  String KEY_ROLE="role";
	//Customer Table Attributes
	public final static String KEY_USER1="username";
	public final static String KEY_PASSWORD1="password";
	public final static  String KEY_DOB="dob";
	public final static String KEY_GENDER="gender";
	public final static  String KEY_CITY="city";
	public final static  String KEY_CONTACT="contact";
	//Fare Table Attributes
	public final static  String KEY_SOURCE="source";
	public final static String KEY_DESTINATION="destination";
	public final static  String KEY_CLASS="class";
	public final static String KEY_FARE="fare";
    // FlightInfo Table Attributes
	public final static  String KEY_FLIGHTNO="flightno";
	public final static  String KEY_FLIGHTNAME="flightname";
	public final static  String KEY_FLIGHTSOURCE="source";
	public final static  String KEY_FLIGHTDESTINATION="destination";
	public final static  String KEY_FLIGHTDATE="date";
	public final static  String KEY_FLIGHTARRIVAL="arrival";
	public final static  String KEY_FLIGHTDEPARTURE="departure";
	// Reservation Attributes
	public final static  String KEY_PASSPORTID="passportid";
	public final static  String KEY_CUSTOMERNAME="customername";
	public final static String KEY_GENDER1="gender";
	public final static  String KEY_CITY1="city";
	public final static  String KEY_CONTACT1="contact";
	public final static  String KEY_CLASS1="class";
	public final static  String KEY_FLIGHTNO1="flightno";
	// Reservation Pnr Attributes
	public final static  String KEY_PNR="pnr";
	public final static String KEY_FLIGHTNO2="flightno";
	public final static String KEY_FLIGHTNAME1="fare";
	public final static  String KEY_SOURCE1="source";
	public final static  String KEY_DESTINATION1="destination";
	public final static  String KEY_DATE="date";
	public final static String KEY_ARRIVAL="arrival";
	public final static  String KEY_DEPARTURE="departure";
	public Dbhelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_TABLE1="CREATE TABLE "+TABLE_NAME1+"("+KEY_USER+" TEXT, "+KEY_PASSWORD+" TEXT, "+KEY_ROLE+" TEXT)";
		String CREATE_TABLE2="CREATE TABLE "+TABLE_NAME2+"("+KEY_USER1+" TEXT, "+KEY_PASSWORD1+" TEXT, "+KEY_DOB+" TEXT, "+KEY_GENDER+" TEXT, "+KEY_CITY+" TEXT, "+KEY_CONTACT+" TEXT)";
		String CREATE_TABLE3="CREATE TABLE "+TABLE_NAME3+"("+KEY_SOURCE+" TEXT, "+KEY_DESTINATION+" TEXT, "+KEY_CLASS+" TEXT, "+KEY_FARE+" TEXT)";
		String CREATE_TABLE4="CREATE TABLE "+TABLE_NAME4+"("+KEY_FLIGHTNO+" TEXT, "+KEY_FLIGHTNAME+" TEXT, "+KEY_FLIGHTSOURCE+" TEXT, "+KEY_FLIGHTDESTINATION+" TEXT, "+KEY_FLIGHTDATE+" TEXT, "+KEY_FLIGHTARRIVAL+" TEXT,"+KEY_FLIGHTDEPARTURE+" TEXT)";
		String CREATE_TABLE5="CREATE TABLE "+TABLE_NAME5+"("+KEY_PASSPORTID+" TEXT, "+KEY_CUSTOMERNAME+" TEXT, "+KEY_GENDER1+" TEXT, "+KEY_CITY1+" TEXT, "+KEY_CONTACT1+" TEXT, "+KEY_CLASS1+" TEXT,"+KEY_FLIGHTNO1+" TEXT)";
		String CREATE_TABLE6="CREATE TABLE "+TABLE_NAME6+"("+KEY_PNR+" TEXT, "+KEY_FLIGHTNO2+" TEXT, "+KEY_FLIGHTNAME1+" TEXT, "+KEY_SOURCE1+" TEXT, "+KEY_DESTINATION1+" TEXT, "+KEY_DATE+" TEXT,"+KEY_ARRIVAL+" TEXT,"+KEY_DEPARTURE+" TEXT)";
		db.execSQL(CREATE_TABLE1);
		db.execSQL(CREATE_TABLE2);
		db.execSQL(CREATE_TABLE3);
		db.execSQL(CREATE_TABLE4);
		db.execSQL(CREATE_TABLE5);
		db.execSQL(CREATE_TABLE6);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME4);
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME5);
		db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME6);
		onCreate(db);

	}
}
