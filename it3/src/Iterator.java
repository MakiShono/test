/** インタフェースIterator。
 *  要素を走査することを目的とする。
 *  @auther 庄野
 *  @see Object
 *  @see IndianMenuIterator SriLankaMenuIterator
 */

public interface Iterator {
	public abstract boolean hasNext();	//hasNext抽象メソッド。次の要素の存在を確認する
	public abstract Object next();		//next抽象メソッド。次の要素を得る
}