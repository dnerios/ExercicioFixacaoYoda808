package com.letscode.exercicioyoda.ic;

import com.letscode.exercicioyoda.rebelde.Rebelde;
import com.letscode.exercicioyoda.utils.Utils;
import lombok.Cleanup;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class InteligenciaCentral {

    private static Rebelde[] arrayRebeldes = new Rebelde[10];


    public static void solicitarIngresso(Rebelde rebelde) {
        //Preenche todas as posições do array com um mesmo valor/objeto
        //Arrays.fill(arrayRebeldes, rebelde);

        if(!buscarRebelde(arrayRebeldes, rebelde))
            Utils.add(arrayRebeldes, rebelde);
        else
            System.out.println("Esse rebelde já está na lista.");


        /*for(int i = 0; i < arrayRebeldes.length; i++){
            if(arrayRebeldes[i] == null) {
                arrayRebeldes[i] = rebelde;
            }
        }*/
    }

    public static void imprimirListaRebeldes() {
        try {
            @Cleanup PrintWriter writer = new PrintWriter("lista-rebeldes.txt", "UTF-8");

            writer.println(Arrays.toString(arrayRebeldes));
            /*for(int i = 0; i < arrayRebeldes.length; i++){
                writer.println(arrayRebeldes[i]);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void printConsoleRebeldes() {
        Arrays.toString(arrayRebeldes);
    }

    public static boolean buscarRebelde(Rebelde[] arr, Rebelde rebelde){
        return Arrays.asList(arr).contains(rebelde);
    }

    public static void comparaRebeldes(int[] arr1, int[] arr2) {
        Arrays.compare(arr1, arr2);
    }

    public static Rebelde[] copiarLista() {
        Rebelde[] rebelde = Arrays.copyOf(arrayRebeldes, 12);

        return rebelde;
    }
}
