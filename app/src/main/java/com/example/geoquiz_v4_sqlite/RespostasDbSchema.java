package com.example.geoquiz_v4_sqlite;

public class RespostasDbSchema {
    public static final class RespostasTbl{
        public static final String NOME = "Respostas";
        public static final class Cols{  //identificação das colunas da tabela Respostas
            public static final String UUID = "uuid";
            public static final String TEXTO_RESPOSTA = "txt_resposta";
            public static final String RESPOSTA_CORRETA = "txt_resposta_correta";

        }
    }
}
