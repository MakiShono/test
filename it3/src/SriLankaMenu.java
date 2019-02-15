/** SriLankaMenuクラス。
 *  集合体としてのスリランカメニューを表す。
 *  インタフェースMenuを実装。
 *  ArrayListでメニューを管理。
 *  @庄野
 *  @see Menu
 */
import java.util.ArrayList;

public class SriLankaMenu implements Menu {
    ArrayList<MenuItem> menuItems = new ArrayList<>();	//インスタンス生成・ArrayListでメニューを管理

    //コンストラクタ
    public SriLankaMenu() {
        setItem("スリランカカレーＡ",950);
        setItem("スリランカカレーＢ",1000);
    }
    //アクセサ
    public void setItem(String name, Integer price) {
        MenuItem mi = new MenuItem(name,price);				//インスタンス生成
        menuItems.add(mi);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    //createIteratorメソッド
    //SriLankaクラスに対応するイテレータとしてSriLankaIteratorクラスのインスタンスを生成して返す
    public Iterator createIterator() {
        return new SriLankaMenuIterator(menuItems);
    }
}