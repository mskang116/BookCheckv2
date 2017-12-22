package com.example.mskan.bookcheckv2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class SplashActivity extends AppCompatActivity {
	String ID;
	String Token;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		ImageView imageView = (ImageView) findViewById(R.id.SplashImage);
		final SharedPreferences pref = getSharedPreferences("user", MODE_PRIVATE);
		Glide.with(this).load(R.raw.splash).into(imageView);
		Handler handler = new Handler();
		if (pref.getString("ID", "") != "") {
			handler.postDelayed(new Runnable() {
				@Override
				public void run() {
					finish();
				}
			}, 7800);
		}
		else{
			handler.postDelayed(new Runnable() {
				@Override
				public void run() {
					finish();
					startActivity(new Intent(SplashActivity.this, LoginActivity.class));
				}
			}, 7800);
		}
	}

	@Override
	public void finish() {
		super.finish();
		this.overridePendingTransition(R.anim.anim_stop, R.anim.anim_translate_right);
	}
}
