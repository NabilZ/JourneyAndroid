package com.journey.journeyandroid.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;
import android.test.JourneyActivityUnitTestCase;
import android.view.ContextThemeWrapper;
import android.widget.Button;

import com.journey.journeyandroid.R;

public class WelcomeActivityTest extends JourneyActivityUnitTestCase<WelcomeActivity> {
    private Intent intent;
    private Activity activity;

    public WelcomeActivityTest() {
        super(WelcomeActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        ContextThemeWrapper context = new ContextThemeWrapper(
                getInstrumentation().getTargetContext(), R.style.AppTheme);

        setActivityContext(context);

        this.intent = new Intent(getInstrumentation().getTargetContext(), WelcomeActivity.class);

        startActivity(this.intent, null, null);

        this.activity = getActivity();

        this.activity.setTheme(R.style.Base_Theme_AppCompat);

    }

    public void testLayoutContainsButton() throws Exception {
        assertNotNull(activity.findViewById(R.id.driveButton));
        assertNotNull(activity.findViewById(R.id.driveLogButton));

        final Button driveButton = (Button) this.activity.findViewById(R.id.driveButton);
        final Button driveLogButton = (Button) this.activity.findViewById(R.id.driveLogButton);

        assertEquals("Incorrect label of the button", "START DRIVING", driveButton.getText());
        assertEquals("Incorrect label of the button", "LOG", driveLogButton.getText());
    }

    public void testDriveTrackingActivityWasLaunchedWithIntent() {
        final Button driveButton = (Button) this.activity.findViewById(R.id.driveButton);

        driveButton.performClick();

        final Intent launchIntent = getStartedActivityIntent();

        assertNotNull("DriveTrackingActivity intent was null", launchIntent);
    }

    public void testDriveLogActivityWasLaunchedWithIntent() {
        final Button driveLogButton = (Button) this.activity.findViewById(R.id.driveLogButton);

        driveLogButton.performClick();

        final Intent launchIntent = getStartedActivityIntent();

        assertNotNull("DriveTrackingActivity intent was null", launchIntent);
    }
}
