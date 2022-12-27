package com.example.deeplinks;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ShowContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_content);

        showOrganizationName();
    }

    private void showOrganizationName() {
        Uri uri = getIntent().getData();

        if (uri != null) {
            // if the uri is not null then we are getting the
            // path segments and storing it in list.
            List<String> parameters = uri.getPathSegments();

            // after that we are extracting string from that parameters.
            String param = parameters.get(parameters.size() - 1);

            // on below line we are setting
            // that string to our text view
            // which we got as params.
            TextView textView = findViewById(R.id.idTVMessage);
                    textView.setText(param);
        }
    }
}