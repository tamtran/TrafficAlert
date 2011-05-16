package com.eastagile.android;

import com.eastagile.android.TrafficAlertActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.util.Log;

public class TrafficAlertActivityTest extends ActivityInstrumentationTestCase2<TrafficAlertActivity> {
	TrafficAlertActivity friendActivity;
	public static final String tag = "Test";
	public TrafficAlertActivityTest() {
		super("com.eastagile.android", TrafficAlertActivity.class);
	}

	@Override
  protected void setUp() throws Exception {
	  // TODO Auto-generated method stub
	  super.setUp();
	  setActivityInitialTouchMode(false);
	  logging("Try to initiate activity from within test");
	  friendActivity = (TrafficAlertActivity)getActivity();	 
  }
	
	@UiThreadTest
	public void testDisplayMapView(){
		assertNotNull(friendActivity.mapView);
	}
	public static void logging(String input) {
		Log.d(tag, input);
	}

}
