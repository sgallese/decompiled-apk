package com.habitrpg.android.habitica.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.user.auth.SocialAuthentication;
import com.habitrpg.android.habitica.ui.activities.GroupInviteActivity;
import java.lang.reflect.Type;
import java.util.Iterator;
import qc.q;

/* compiled from: SocialAuthenticationDeserializer.kt */
/* loaded from: classes4.dex */
public final class SocialAuthenticationDeserializer implements k<SocialAuthentication> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public SocialAuthentication deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        SocialAuthentication socialAuthentication = new SocialAuthentication();
        n i10 = lVar.i();
        if (i10.D(GroupInviteActivity.EMAILS_KEY) && i10.x(GroupInviteActivity.EMAILS_KEY).m()) {
            Iterator<l> it = i10.y(GroupInviteActivity.EMAILS_KEY).iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.p()) {
                    socialAuthentication.getEmails().add(next.l());
                } else if (next.o()) {
                    socialAuthentication.getEmails().add(JsonObjectExtensionsKt.getAsString(next.i(), AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            }
        }
        return socialAuthentication;
    }
}
