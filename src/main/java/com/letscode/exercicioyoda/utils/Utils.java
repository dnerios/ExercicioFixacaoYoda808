package com.letscode.exercicioyoda.utils;

import com.letscode.exercicioyoda.rebelde.Rebelde;

public class Utils {
    public static void add(Rebelde[] arr, Rebelde rebelde) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                arr[i] = rebelde;
                return;
            }
        }
    }
}
