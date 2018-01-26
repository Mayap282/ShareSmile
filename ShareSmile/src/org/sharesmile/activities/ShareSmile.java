package org.sharesmile.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShareSmile extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView text = new TextView(this);
        text.setText("ShareSmile, Login Page");
        setContentView(text);
        EditText username = new EditText(this);
        username.setText("username");
        setContentView(username);
        //setContentView(R.layout.main);
    }
}