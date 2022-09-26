package com.example.geoquiz_v4_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class RespostaDB {

    private Context mContext;
    private static Context mStaticContext;
    private SQLiteDatabase mDatabase;

    public RespostaDB(Context contexto) {
        mContext = contexto.getApplicationContext();
        mStaticContext = mContext;
        mDatabase = new QuestoesDBHelper(mContext).getWritableDatabase();
    }

    private static ContentValues getValoresConteudo(Resposta r) {
        ContentValues valores_resp = new ContentValues();

        // pares chave-valor: nomes das colunas - valores
        valores_resp.put(RespostasDbSchema.RespostasTbl.Cols.UUID, r.getId().toString());
        valores_resp.put(RespostasDbSchema.RespostasTbl.Cols.TEXTO_RESPOSTA,
                mStaticContext.getString(r.getRespostaOferecida())); // recupera valor do recurso string pelo id
        return valores_resp;
    }

    public void addResposta(Resposta r) {
        ContentValues valores_resp = getValoresConteudo(r);
        mDatabase.insert(RespostasDbSchema.RespostasTbl.NOME, null, valores_resp);
    }

    public void updateResposta(Resposta r){
        String uuidString = r.getId().toString();
        ContentValues valores_resp = getValoresConteudo(r);
    }

    public Cursor queryResposta(String clausulaWhere, String[] argsWhere){
        Cursor cursor = mDatabase.query(RespostasDbSchema.RespostasTbl.NOME,
                null,  // todas as colunas
                clausulaWhere,
                argsWhere,
                null, // sem group by
                null, // sem having
                null  // sem order by
        );
        return cursor;
    }

    void removeBanco(){
        int delete;
        delete = mDatabase.delete(
                RespostasDbSchema.RespostasTbl.NOME,
                null, null);
    }

}