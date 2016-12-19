package com.mohsin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.connectsdk.discovery.DiscoveryManager;
import com.connectsdk.service.DIALService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DIALService.registerApp("Levak");
        DiscoveryManager.init(getApplicationContext());
    }
}
