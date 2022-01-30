package com.letscode.exercicioyoda.enums;

public enum RacasEnum {
    HUMANO("Humano"),
    GREE("Gree"),
    RAKATA("Vapor");

    private String descricao;

    RacasEnum(String descricao) {this.descricao = descricao;}

    public String getDescricao() { return descricao; }
}
