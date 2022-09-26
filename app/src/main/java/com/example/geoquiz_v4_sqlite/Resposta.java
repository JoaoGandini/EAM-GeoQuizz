package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {
    private UUID mId;
    private int mRespostaOferecida;
    private boolean mRespostaCorreta;
    private int mColou;

    public Resposta(int RespostaOferecida, boolean RespostaCorreta, int Colou) {
        this.mRespostaOferecida = RespostaOferecida;
        this.mRespostaCorreta = RespostaCorreta;
        this.mColou = Colou;
        mId = UUID.randomUUID();
    }

    UUID getId(){return mId;};

    public int getRespostaOferecida() {
        return mRespostaOferecida;
    }

    public void setRespostaOferecida(int RespostaOferecida) {
        mRespostaOferecida = RespostaOferecida;
    }

    public boolean isRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        mRespostaCorreta = respostaCorreta;
    }

    public int getColou() {
        return mColou;
    }

    public void setColou(int Colou) { mColou = Colou; }

}