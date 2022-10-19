package com.example.geoquiz_v4_sqlite;

public class RespostasDbSchema {
    public static final class RespostasTbl{
        public static final String NOME = "Questoes";
        public static final class Cols{  //identificação das colunas da tabela Questões
            public static final String UUID = "uuid";
            public static final String RESPOSTA_CORRETA = "Resposta_Correta";
            public static final String RESPOSTA_APRESENTADA = "Resposta_Apresentada";
            public static final String COLOU = "Colou";
        }
    }
}
