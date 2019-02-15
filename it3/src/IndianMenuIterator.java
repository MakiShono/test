/** IndianMenuIteratorクラス。
 *  IndianMenuクラスの走査を行う。
 *  @庄野
 *  @see Iterator
 */

//import java.awt.MenuItem;

public class IndianMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;	//ループカウンタ

    //コンストラクタ
    public IndianMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    //hasNextメソッド実装 次の要素の存在を確認する
    public boolean hasNext() {
        if (this.position >= this.items.length) return false;
        if (this.items[this.position] == null) return false;
        return true;
    }
    //nextメソッド実装 次の要素を得る
    public Object next() {
        MenuItem mi = this.items[this.position];
        this.position++;
        return mi;
    }
}