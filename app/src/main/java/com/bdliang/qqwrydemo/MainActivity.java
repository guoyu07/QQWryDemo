package com.bdliang.qqwrydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bdliang.qqwrydemo.net.HttpRequest;
import com.bdliang.qqwrydemo.qqwry.Config;
import com.bdliang.qqwrydemo.qqwry.IPSeeker;

public class MainActivity extends AppCompatActivity {

    /**
     *
     */
    public static final String TAG = "MainActivity";
    public EditText editText;
    public TextView textView;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }
    /**
     * 初始化UI
     */
    private void initUI() {
        editText = (EditText) findViewById(R.id.ed_ip);
        textView = (TextView) findViewById(R.id.tv_info);
        button = (Button) findViewById(R.id.btn_req);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String ipAddr = editText.getText().toString().trim();
                final String isp = IPSeeker.getISP(ipAddr);
                final String location = IPSeeker.getLocation(ipAddr);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String info = HttpRequest.sendGETOkHttpRequest(Config.REQUEST_URL + ipAddr);
                        Log.d(TAG, "run: ");
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText("ISP::" + isp + "\n" + "Location::" + location + "\n" + info);
                                }
                            });

                    }
                }).start();

            }
        });
    }
}
