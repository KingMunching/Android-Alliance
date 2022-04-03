package com.example.testing;

import static org.junit.Assert.*;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;
    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void testLaunch(){
        Button view = mActivity.findViewById(R.id.easy);

        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}