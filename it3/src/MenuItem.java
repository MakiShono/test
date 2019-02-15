/** MenuItemクラス。
 *  メニューのデータ保持用。
 *  @庄野
 */

public class MenuItem {
    String name;		//メニュー名
    Integer price;		//価格

    //コンストラクタ
    public MenuItem(String name,Integer price) {
        this.name = name;
        this.price = price;
    }
    //アクセサ
    public String getName() { return name; }
    public Integer getPrice() { return price; }
}