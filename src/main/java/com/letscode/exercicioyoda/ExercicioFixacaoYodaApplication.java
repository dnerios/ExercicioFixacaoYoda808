package com.letscode.exercicioyoda;

import com.letscode.exercicioyoda.enums.RacasEnum;
import com.letscode.exercicioyoda.ic.InteligenciaCentral;
import com.letscode.exercicioyoda.rebelde.Rebelde;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ExercicioFixacaoYodaApplication {
    public static void main(String[] args) {
        Rebelde rebelde = new Rebelde(
                "Rebelde 1",
                25,
                RacasEnum.GREE.getDescricao());

        Rebelde rebelde2 = Rebelde.builder()
                .nome("Rebelde 2")
                .idade(28)
                .raca(RacasEnum.HUMANO.getDescricao())
                .build();

        Rebelde rebelde3 = Rebelde.builder()
                .nome("Rebelde 3")
                .idade(28)
                .raca(RacasEnum.GREE.getDescricao())
                .build();

        InteligenciaCentral.solicitarIngresso(rebelde);
        InteligenciaCentral.solicitarIngresso(rebelde2);
        InteligenciaCentral.solicitarIngresso(rebelde3);

        InteligenciaCentral.imprimirListaRebeldes();

        System.out.println(Arrays.toString(InteligenciaCentral.copiarLista()));


        //Exemplo simples (sem utilização de objetos) para ordenação com o .sort
        //Ordenação default = crescente
        int[] arr = { 8, 10, 1, 54, 13 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
