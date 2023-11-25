package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.habitrpg.android.habitica.models.social.Challenge;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: ChallengeListDeserializer.kt */
/* loaded from: classes4.dex */
public final class ChallengeListDeserializer implements k<List<? extends Challenge>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends Challenge> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        Challenge challenge;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0 x0Var = new x0();
        Iterator<l> it = lVar.h().iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (next.o()) {
                challenge = (Challenge) jVar.a(next, Challenge.class);
            } else {
                Challenge challenge2 = new Challenge();
                challenge2.setId(next.l());
                challenge = challenge2;
            }
            if (challenge != null) {
                x0Var.add(challenge);
            }
        }
        return x0Var;
    }
}
