package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import java.lang.reflect.Type;
import qc.q;

/* compiled from: FindUsernameResultDeserializer.kt */
/* loaded from: classes4.dex */
public final class FindUsernameResultDeserializer implements k<FindUsernameResult> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public FindUsernameResult deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        n i10 = lVar.i();
        FindUsernameResult findUsernameResult = new FindUsernameResult();
        if (i10.D("contributor")) {
            findUsernameResult.setContributor((ContributorInfo) jVar.a(i10.x("contributor"), ContributorInfo.class));
        }
        if (i10.D("auth")) {
            findUsernameResult.setAuthentication((Authentication) jVar.a(i10.x("auth"), Authentication.class));
        }
        return findUsernameResult;
    }
}
