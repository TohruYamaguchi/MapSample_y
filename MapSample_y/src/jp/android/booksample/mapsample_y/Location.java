package jp.android.booksample.mapsample_y;


/**
 * ロケーションの位置情報を保存するクラスです。
 */
public class Location {

	private String name;

	private LatLng location;

	public Location(String name, LatLng location) {
		super();
		this.name = name;
		this.location = location;
	}

	/**
	 * ロケーションの名称を取得します。
	 * 
	 * @return ロケーションの名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * ロケーションの座標値を取得します。
	 * 
	 * @return ロケーションの座標値
	 */
	public LatLng getLocation() {
		return location;
	}

	/**
	 * このオブジェクトの文字列表現を規定します。 これをオーバーライドすることで、リスト上に表示する名称を変更可能です。
	 */
	@Override
	public String toString() {
		return name;
	}
}
