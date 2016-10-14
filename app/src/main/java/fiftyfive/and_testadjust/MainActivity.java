package fiftyfive.and_testadjust;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String appToken = "br9jrdi41d6o";
        String environment = AdjustConfig.ENVIRONMENT_SANDBOX;
        AdjustConfig config = new AdjustConfig(this, appToken, environment);
        Adjust.onCreate(config);
        config.setLogLevel(LogLevel.VERBOSE);   // enable all logging

        AdjustEvent event = new AdjustEvent("test55");
        Adjust.trackEvent(event);
    }
}
