package com.xwj.service.array;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(numToString(-1));
    }
    public static String numToString (int intValue) {
        boolean flag = false;
        if (intValue < 0){
            intValue = -intValue;
            flag = true;
        }
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 37; i++) {
            if (i <= 9){
                map.put(i, "" + i);
            }else if (i >= 10 && i <=35){
                map.put(i, String.valueOf((char)(i + 55)));
            }else if (i == 36){
                map.put(i, "" + 10);
            }
        }
        if (map.containsKey(intValue)){
            if (flag){
                return "-" + map.get(intValue);
            }else {
                return map.get(intValue);
            }
        }else {
            String left = map.get(intValue/36);
            String right = map.get(intValue%36);
            if (flag){
                return "-" + left + right;
            }else {
                return  left + right;
            }
        }
    }
}
