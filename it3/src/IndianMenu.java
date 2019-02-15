/** IndianMenuクラス。
 *  集合体としてのインドメニューを表す。
 *  インタフェースMenuを実装。
 *  配列でメニューを管理。
 *  @庄野
 *  @see Menu
 */
public class IndianMenu implements Menu {

	private static final int MAX_ITEMS = 2;	//メニューの数
    private MenuItem[] menuItems;	//配列でメニューを管理
    private int counter = 0;	//配列の要素数に使用 カウンタ

    //コンストラクタ
    public IndianMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        setItem("インドカレーＡ",  650);
        setItem("インドカレーＢ", 750);
    }
    //アクセサ
    public void setItem(String name,Integer price) {
        MenuItem mi = new MenuItem(name,price);			//インスタンス生成
        menuItems[counter] = mi;
        counter++;
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    //createIteratorメソッド
    //IndianMenuクラスに対応するイテレータとしてIndianMenuIteratorクラスのインスタンスを生成して返す
    public Iterator createIterator() {
        return new IndianMenuIterator(menuItems);
    }
}