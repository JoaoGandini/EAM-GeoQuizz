package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {
    private UUID mId;
    private boolean mRespostaCorreta;
    private boolean mRespostaApres;
    private  boolean mColou;

    public Resposta(UUID mId, boolean mRespostaCorreta, boolean mRespostaApres, boolean mColou) {
        this.mId = mId;
        this.mRespostaCorreta = mRespostaCorreta;
        this.mRespostaApres = mRespostaApres;
        this.mColou = mColou;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public boolean ismRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setmRespostaCorreta(boolean mRespostaCorreta) {
        this.mRespostaCorreta = mRespostaCorreta;
    }

    public boolean ismRespostaApres() {
        return mRespostaApres;
    }

    public void setmRespostaApres(boolean mRespostaApres) {
        this.mRespostaApres = mRespostaApres;
    }

    public boolean ismColou() {
        return mColou;
    }

    public void setmColou(boolean mColou) {
        this.mColou = mColou;
    }
}
