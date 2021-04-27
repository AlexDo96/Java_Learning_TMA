package Day06.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<Integer>(); //Phai su dung Wrapper Class Integer va phai ke thua tu class ArrayList
        integerList.add(10);
        integerList.add(-8);
        integerList.add(150);
        integerList.add(20);
        integerList.add(-50);

        integerList.remove(1); //Xoa phan tu index 1
        integerList.clear(); //Xoa het phan tu

        for(int i = 0; i <integerList.size(); i++){
            System.out.println(integerList.get(i));
        }

        for(int i : integerList){
            System.out.println(i);
        }


    }
}
