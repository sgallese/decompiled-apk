package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import java.lang.reflect.Type;
import qc.q;

/* compiled from: FeedResponseDeserializer.kt */
/* loaded from: classes4.dex */
public final class FeedResponseDeserializer implements k<FeedResponse> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public FeedResponse deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        FeedResponse feedResponse = new FeedResponse();
        feedResponse.setValue(Integer.valueOf(lVar.g()));
        return feedResponse;
    }
}
