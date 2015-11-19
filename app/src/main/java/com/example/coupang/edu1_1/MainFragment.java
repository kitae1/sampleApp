package com.example.coupang.edu1_1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Coupang on 2015-04-22.
 */
public class MainFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("test", "fragment : onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view =inflater.inflate(R.layout.fragment_main, container, false);
		Log.d("test", "fragment : onCreateView");
		return view;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("test", "fragment : onAttach");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("test", "fragment : onStart");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("test", "fragment : onActivityCreated");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("test", "fragment : onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d("test", "fragment : onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d("test", "fragment : onStop");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("test", "fragment : onDestory");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("test", "fragment : onDeach");
	}
}
