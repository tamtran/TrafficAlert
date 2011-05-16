package com.eastagile.android;

import com.eastagile.android.FriendsExplorerActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.util.Log;

public class FriendExplorerActivityTest extends ActivityInstrumentationTestCase2<FriendsExplorerActivity> {

	public FriendExplorerActivityTest() {
		super("com.eastagile.android", FriendsExplorerActivity.class);
	}
	FriendsExplorerActivity friendActivity;

	@Override
  protected void setUp() throws Exception {
	  // TODO Auto-generated method stub
	  super.setUp();
	  //setActivityInitialTouchMode(false);
	  Log.d("Test", "Try to initiate activity from within test");
	  friendActivity = (FriendsExplorerActivity)getActivity();	 
  }
	
	@UiThreadTest
	public void testDisplayMapView(){
//		assertNotNull(friendActivity.mapView);
		assertFalse(false);
	}	

}
