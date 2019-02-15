/** SriLankaMenuIteratorクラス。
 *  SriLankaMenuクラスの走査を行う。
 *  @庄野
 *  @see Iterator
 */

//import java.awt.MenuItem;
import java.util.ArrayList;


public class SriLankaMenuIterator implements Iterator {
    ArrayList<MenuItem> items = new ArrayList<>();			//インスタンス生成
    int position = 0;	//ループカウンタ

    //コンストラクタ
    public SriLankaMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    //hasNextメソッド実装 次の要素の存在を確認する
    public boolean hasNext() {
        if (this.position >= this.items.size()) return false;
        if (this.items.get(this.position) == null) return false;
        return true;
    }
    //nextメソッド実装 次の要素を得る
    public Object next() {
        MenuItem mi = items.get(this.position);
        this.position++;
        return mi;
    }
}