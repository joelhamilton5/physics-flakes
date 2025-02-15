package com.hamilton.joel.physicsflakes;

import android.content.Context;
import android.graphics.Typeface;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by joel on 03/10/15.
 */
public class CheckboxPreferences extends CheckBoxPreference {

    private TextView title;
    private TextView summary;
    private boolean bool;


    public CheckboxPreferences(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CheckboxPreferences(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckboxPreferences(Context context) {
        super(context);
    }

    @Override
    protected void onBindView(View v) {
        super.onBindView(v);
        title = (TextView) v.findViewById(android.R.id.title);
        summary = (TextView) v.findViewById(android.R.id.summary);

        if (title != null) {
            title.setGravity(Gravity.CENTER);
            title.setTypeface(null, Typeface.BOLD);

            v.setBackgroundResource(R.drawable.click_background_selector);
            if (summary != null) {
            }
        }

        //TODO
//
//        setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
//            @Override
//            public boolean onPreferenceChange(Preference preference, Object newValue) {
//                Log.i("THIS", "onPreferenceChange setting preference " + preference + " to " + newValue);
//                setChecked((Boolean) newValue);
//                return false;
//            }
//        });
    }

}
