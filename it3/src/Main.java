/**
 * 実行クラスMain
 * @author 庄野
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) {

    	//インスタンスの生成
    	SriLankaMenu sm = new  SriLankaMenu();
    	IndianMenu im = new IndianMenu();

    	Iterator sriLankaMenuIterator = sm.createIterator();
    	Iterator indianMenuIterator = im.createIterator();
        printMenu(sriLankaMenuIterator);
        printMenu(indianMenuIterator);

        sriLankaMenuIterator = sm.createIterator();
        indianMenuIterator = im.createIterator();
        outText(sriLankaMenuIterator);
        outText(indianMenuIterator);
    }


    //printMenuメソッド コンソール上にメニュー表示
    public static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem mi = (MenuItem)iterator.next();
			System.out.print(mi.getName());
			System.out.println("," + mi.getPrice() + "円");
		}
    }

    //outText テキストファイルで表示
    public static void outText(Iterator iterator){
    	try{
//    		Pritrwriter writer = new PrintWriter(new BufferedWriter(new FileWriter("rec/output.txt")));
    		File newMenu = new File("rec/newMenu.txt");
  		BufferedWriter out = null;
	    	out = new BufferedWriter(new FileWriter(newMenu,true));
	    	   	while(iterator.hasNext()){
		    		MenuItem mi = (MenuItem)iterator.next();
		    		out.write(mi.getName());
		    		out.write("," + (mi.getPrice()));
		    		out.newLine();
		    	}
	    	   	out.close();
    	}catch(IOException e) {
            e.printStackTrace();
        }
    }
}
