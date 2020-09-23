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
        //cari id button4 terus di klik
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonLima(){
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }

    @Test
    public void tesKlikButtonEnam(){
        //cari id button6 terus di klik
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
    }

    @Test
    public void tesKlikButtonTujuh(){
        //cari id button7 terus di klik
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
    }

    @Test
    public void tesKlikButtonDelapan(){
        //cari id button8 terus di klik
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
    }

    @Test
    public void tesKlikButtonSembilan(){
        //cari id button9 terus di klik
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
    }

    @Test
    public void tesKlikButtonNol(){
        //cari id button0 terus di klik
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
    }

    @Test
    public void tesKlikButtonHapus() {
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        //cari id button9 terus di klik
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("59")));
        //cari id button_hapus terus di klik, akan kembali '5'
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }

    @Test
    public void tesKlikButtonTambah() {
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0.5")));
    }

    @Test
    public void tesKlikButtonKurang() {
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-10.5")));
    }

    @Test
    public void tesKlikButtonKali() {
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("27.5")));
    }

    @Test
    public void tesKlikButtonBagi() {
        //cari id button5 terus di klik
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-2.0")));
    }

    @Test
    public void tesKlikButtonModulus() {
        //cari id button5 terus di klik
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-0.125")));
    }
}
