/**
 * Menuインタフェース。
 * Iteratorを作り出すAggregateの役割。
 * 集合体を表す。
 * @author 庄野
 * @see Object
 * @see IndianMenu SriLankaMenu
 */

public interface Menu {
    public Iterator createIterator();	//iterator抽象メソッド
}