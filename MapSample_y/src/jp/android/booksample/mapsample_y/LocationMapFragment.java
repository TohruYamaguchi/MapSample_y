package jp.android.booksample.mapsample_y;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LocationMapFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		//テキストボックスを生成する
		TextView view = new TextView(getActivity());
		//パラメータから文字列を読み込む
		Bundle param = getArguments();
		if (param != null) {
			//テキストビューに文字列を設定する
			String name = param.getString(LocationListFragment.EXTRA_NAME);
			view.setText(name);
		}
		return view;
		//戻り値として設定したビューが、画面に表示される		
	}
}
