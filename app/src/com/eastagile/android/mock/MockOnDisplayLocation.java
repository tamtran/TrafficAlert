package com.eastagile.android.mock;

import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

import com.eastagile.android.TrafficAlertActivity;

public class MockOnDisplayLocation extends TrafficAlertActivity.OnDisplayLocation {
	private static final String TAG = "MockOnDisplayLocation Logging";

	public MockOnDisplayLocation() {
		super(null);
	}

	@Override
	public Location callGetCurrentLocation() {
		Location local = new Location(LocationManager.GPS_PROVIDER);
		local.setLatitude(10.00);
		local.setLongitude(100.00);
		return local;
	}

	public static void logging(String input) {
		Log.d(TAG, input);
	}
}