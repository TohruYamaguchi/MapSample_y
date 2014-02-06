package jp.android.booksample.mapsample_y;

import android.R;
import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LocationListFragment extends ListFragment {
	/**
	 * 　目的の座標を示す値が格納されるExtraのキーです。
	 */
	public static final String EXTRA_LATLNG = "lotalng";

	/**
	 * 目的の場所名を示す値が格納されるExtraのキーです。
	 */
	public static final String EXTRA_NAME = "place";

	// フラグメントの初期化処理を行います。

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 位置情報の作成
		ArrayAdapter<String> list = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1);
		list.add("富士山");
		list.add("横浜駅");
		list.add("日本Google株式会社");
		list.add("Google Inc");
		// リストの登録
		setListAdapter(list);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// 画面遷移処理
		@SuppressWarnings("uncheckd")
		ArrayAdapter<Location> list = (ArrayAdapter<Location>) getListAdapter();
		Location item = list.getItem(position);
		// 引数の用意
		Bundle args = new Bundle();
		args.putParcelable(EXTRA_LATLNG, item.getLocation());
		args.putString(EXTRA_NAME, item.getName());
		if (getActivity().findViewById(R.id.container) != null) {
			// タブレットレイアウト:フラグメントを置換
			FragmentManager manager = getFragmentManager();
			android.app.FragmentTransaction transaction = manager
					.beginTransaction();
			LocationMapFragment fragment = new LocationMapFragment();
			// Fragmentを設定
			fragment.setArguments(args);
			transaction.replace(R.id.container, fragment);
			transaction.addToBackStack(null);
			transaction.commit();
		} else {
			// スマートフォンレイアウト：アクティビティを表示
			Intent intent = new Intent(getActivity(), MainActivity.class);
			intent.putExtras(args);
			startActivity(intent);
		}
	}
}
