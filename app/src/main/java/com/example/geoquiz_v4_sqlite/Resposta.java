package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {
    private UUID mId;
    private boolean mRespostaApresentada;
    private boolean mRespostaCorreta;
    private boolean mColou;

    public Resposta(UUID mId, boolean mRespostaCorreta, boolean mRespostaApresentada, boolean mColou) {
        this.mId = mId;
        this.mRespostaApresentada = mRespostaApresentada;
        this.mRespostaCorreta = mRespostaCorreta;
        this.mColou = mColou;
    }

    public UUID getmId() {
        return mId;
    }

    public boolean ismRespostaApresentada() {
        return mRespostaApresentada;
    }

    public boolean ismRespostaCorreta() {
        return mRespostaCorreta;
    }

    public boolean ismColou() {
        return mColou;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public void setmRespostaApresentada(boolean mRespostaApresentada) {
        this.mRespostaApresentada = mRespostaApresentada;
    }

    public void setmRespostaCorreta(boolean mRespostaCorreta) {
        this.mRespostaCorreta = mRespostaCorreta;
    }

    public void setmColou(boolean mColou) {
        this.mColou = mColou;
    }
}