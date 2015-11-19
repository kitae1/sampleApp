package com.example.coupang.edu1_1;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;
	private FragmentManager manager;
	private FragmentTransaction transaction;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("test", "activity : onCreate");
		setContentView(R.layout.activity_main);

		manager = getFragmentManager();
		transaction = manager.beginTransaction();

		Fragment fragment = new MainFragment();
		transaction.add(R.id.fragment_layout, fragment);
		transaction.commit();
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("test", "activity : onResume");

		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentManager manager = getFragmentManager();
				FragmentTransaction transaction = manager.beginTransaction();

				Fragment subFragment = new SubFragment();

				//transaction.add(R.id.fragment_layout, subFragment);
				//transaction.replace(R.id.fragment_layout, subFragment);
				transaction.remove(manager.findFragmentById(R.id.fragment_layout));
				//transaction.addToBackStack(null);

				transaction.commit();
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("test", "activity : onStart");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("test", "activity : onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("test", "activity : onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("test", "activity : onDestory");
	}

}
