package com.tylerjroach.memoryleaktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LeakyActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leaky);
  }
}
