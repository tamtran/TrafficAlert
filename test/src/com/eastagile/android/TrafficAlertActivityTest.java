package com.eastagile.android;

import com.eastagile.android.TrafficAlertActivity;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.util.Log;
import android.view.KeyEvent;

import com.eastagile.android.mock.*;

public class TrafficAlertActivityTest extends ActivityInstrumentationTestCase2<TrafficAlertActivity> {
	TrafficAlertActivity trafficActivity;
	public static final String tag = "Test Logging";
	public TrafficAlertActivityTest() {
		super("com.eastagile.android", TrafficAlertActivity.class);
	}
	
	MockOnDisplayLocation mockOnDisplayLocation;

	@Override
  protected void setUp() throws Exception {
	  // TODO Auto-generated method stub
	  super.setUp();
	  setActivityInitialTouchMode(false);
	  Intent addEvent = new Intent();
	  addEvent.putExtra("MockOnDisplayLocation", "yes");
	  mockOnDisplayLocation = new MockOnDisplayLocation();
	  setActivityIntent(addEvent);
	  trafficActivity = (TrafficAlertActivity)getActivity();
	  Thread.sleep(5000);
  }
	
	public void testDisplayMapView() throws InterruptedException{
		assertNotNull(trafficActivity.mapView);
		assertTrue(trafficActivity.pushpinMineBitMap.getHeight() > 0);
		assertTrue(trafficActivity.pushpinMineBitMap.getWidth() > 0);
	}
	
	public void testDisplayCurrentLocation() throws InterruptedException{
		testDisplayMapView();
		logging("" + trafficActivity.myCurrentLat);
		logging("" + trafficActivity.myCurrentLong);
		assertEquals(10, (int)trafficActivity.myCurrentLat);
		assertEquals(100, (int)trafficActivity.myCurrentLong);
		assertTrue(true);
	}
	
	public void testDisplayOtherFriends() throws InterruptedException{
		assertNotNull(trafficActivity.mapView);
		assertTrue(trafficActivity.pushpinFriendBitMap.getHeight() > 0);
		assertTrue(trafficActivity.pushpinFriendBitMap.getWidth() > 0);
	}

	public void testDisplayMenuOption() throws InterruptedException{
		assertNotNull(trafficActivity.getMenuInflater());
	}
	
	public static void logging(String input) {
		Log.d(tag, input);
	}

}
