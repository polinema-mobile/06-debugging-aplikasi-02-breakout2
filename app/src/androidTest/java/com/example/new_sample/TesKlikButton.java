package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }

    @Test
    public void tesKlikButtonDua(){
        //cari id button2 terus di klik
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }

    @Test
    public void tesKlikButtonTiga(){
        //cari id button3 terus di klik
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }

    @Test
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }

    @Test
    public void tesKlikButtonDua(){
        //cari id button2 terus di klik
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }

    @Test
    public void tesKlikButtonTiga(){
        //cari id button3 terus di klik
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }

    @Test
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonTiga(){
        //cari id button3 terus di klik
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }

    @Test
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonEmpat(){
        //cari id button2 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }
}
