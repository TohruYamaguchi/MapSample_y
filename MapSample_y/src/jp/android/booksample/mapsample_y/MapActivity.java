package jp.android.booksample.mapsample_y;

import ip.android.booksample.mapsample.R;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MapActivity extends Activity {

//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_map);
//		// フラグメントトランザクションを開始する
//		FragmentManager manager = getFragmentManager();
//		FragmentTransaction transaction = manager.beginTransaction();
//
//		LocationMapFragment3 fragment = new LocationMapFragment3();
//		if (getIntent() != null && getIntent().getExtras() != null) {
//			// インテントがあれば、その値をフラグメントに設定する
//			fragment.setArguments(getIntent().getExtras());
//		}
//		// 表示
//		transaction.add(R.id.container, fragment);
//		transaction.commit();
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}
