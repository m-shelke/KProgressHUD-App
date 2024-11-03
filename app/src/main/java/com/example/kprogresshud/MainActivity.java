package com.example.kprogresshud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import io.github.rupinderjeet.kprogresshud.KProgressHUD;

public class MainActivity extends AppCompatActivity {

    Button indeterminateBtn,withLabelAndCancellableBtn,withDetailsBtn,determinateBtn,angularDeterminateBtn,barDeterminateBtn,customViewBtn,dimBackgroundBtn,customColorAndSpeedBtn;

    KProgressHUD kProgressHUD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        indeterminateBtn = findViewById(R.id.indeterminateBtn);
        withLabelAndCancellableBtn = findViewById(R.id.withLabelAndCancellableBtn);
        withDetailsBtn = findViewById(R.id.withDetailsBtn);
        determinateBtn = findViewById(R.id.determinateBtn);
        angularDeterminateBtn = findViewById(R.id.angularDeterminateBtn);
        barDeterminateBtn = findViewById(R.id.barDeterminateBtn);
        customViewBtn = findViewById(R.id.customViewBtn);
        dimBackgroundBtn = findViewById(R.id.dimBackgroundBtn);
        customColorAndSpeedBtn = findViewById(R.id.customColorAndSpeedBtn);

//        indeterminateBtn.setOnClickListener(this);
//        withLabelAndCancellableBtn.setOnClickListener(this);
//        withDetailsBtn.setOnClickListener(this);
//        determinateBtn.setOnClickListener(this);
//        angularDeterminateBtn.setOnClickListener(this);
//        barDeterminateBtn.setOnClickListener(this);
//        customViewBtn.setOnClickListener(this);
//        dimBackgroundBtn.setOnClickListener(this);
//        customColorAndSpeedBtn.setOnClickListener(this);

        indeterminateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.5f)
                        .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                        .setDetailsLabel("Downloading The Data")
                        .setCancellable(true)
                        .setAnimationSpeed(1)
                        .show();
            }
        });

        withLabelAndCancellableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                        .setAnimationSpeed(1)
                        .setLabel("Please Wait");

                kProgressHUD.show();
            }
        });


        withDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.ANNULAR_DETERMINATE)
                        .setMaxProgress(100)
                        .setLabel("Please Wait");

                kProgressHUD.setProgress(50);
                kProgressHUD.show();
            }
        });

        determinateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.PIE_DETERMINATE)
                        .setLabel("Please Wait");

                kProgressHUD.show();
            }
        });

        angularDeterminateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setMaxProgress(100)
                        .setStyle(KProgressHUD.Style.ANNULAR_DETERMINATE)
                        .show();

                kProgressHUD.setProgress(50);
            }
        });

        barDeterminateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.BAR_DETERMINATE)
                        .setLabel("Please Wait");

                kProgressHUD.show();
            }
        });

        customViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                        .setLabel("Please Wait")
                        .setWindowColor(getResources().getColor(R.color.black));

                kProgressHUD.show();
            }
        });

        dimBackgroundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.PIE_DETERMINATE);

                kProgressHUD.show();
            }
        });

        customColorAndSpeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kProgressHUD = KProgressHUD.create(MainActivity.this)
                        .setDimAmount(0.7f)
                        .setStyle(KProgressHUD.Style.ANNULAR_DETERMINATE);

                kProgressHUD.show();
            }
        });

    }


}