package com.habitrpg.android.habitica.utils;

import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.social.Challenge;
import java.lang.reflect.Type;
import java.util.Date;

/* compiled from: ChallengeDeserializer.kt */
/* loaded from: classes4.dex */
public final class ChallengeDeserializer implements k<Challenge>, q<Challenge> {
    public static final int $stable = 0;

    private final String getTaskArrayAsString(j jVar, n nVar, String str) {
        if (nVar.D(str)) {
            String join = TextUtils.join(",", (String[]) jVar.a(nVar.x(str), String[].class));
            qc.q.h(join, "join(...)");
            return join;
        }
        return "";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public Challenge deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        n i10;
        n i11;
        n i12;
        qc.q.i(lVar, "json");
        qc.q.i(type, "typeOfT");
        qc.q.i(jVar, "context");
        n i13 = lVar.i();
        Challenge challenge = new Challenge();
        challenge.setId(i13.x("id").l());
        challenge.setName(i13.x(AppMeasurementSdk.ConditionalUserProperty.NAME).l());
        challenge.setShortName(JsonObjectExtensionsKt.getAsString(i13, "shortName"));
        challenge.setDescription(JsonObjectExtensionsKt.getAsString(i13, "description"));
        challenge.setMemberCount(i13.x("memberCount").g());
        l x10 = i13.x("prize");
        if (!x10.n()) {
            challenge.setPrize(x10.g());
        }
        challenge.setOfficial(i13.x("official").a());
        l x11 = i13.x("leader");
        if (x11 != null && !x11.n() && (i11 = x11.i()) != null && (i12 = i11.x(Scopes.PROFILE).i()) != null) {
            challenge.setLeaderName(i12.x(AppMeasurementSdk.ConditionalUserProperty.NAME).l());
            l x12 = i11.x("id");
            if (x12 == null) {
                x12 = i11.x("_id");
            }
            if (x12 != null) {
                challenge.setLeaderId(x12.l());
            }
        }
        if (i13.D("createdAt")) {
            challenge.setCreatedAt((Date) jVar.a(i13.x("createdAt"), Date.class));
        }
        if (i13.D("updatedAt")) {
            challenge.setUpdatedAt((Date) jVar.a(i13.x("updatedAt"), Date.class));
        }
        if (i13.D("summary")) {
            challenge.setSummary(i13.x("summary").l());
        }
        l x13 = i13.x("group");
        if (x13 != null && !x13.n() && (i10 = x13.i()) != null) {
            challenge.setGroupName(i10.x(AppMeasurementSdk.ConditionalUserProperty.NAME).l());
            challenge.setGroupId(i10.x("_id").l());
        }
        l x14 = i13.x("tasksOrder");
        if (x14 != null && !x14.n()) {
            n i14 = x14.i();
            qc.q.f(i14);
            challenge.setTodoList(getTaskArrayAsString(jVar, i14, Challenge.TASK_ORDER_TODOS));
            challenge.setDailyList(getTaskArrayAsString(jVar, i14, Challenge.TASK_ORDER_DAILYS));
            challenge.setHabitList(getTaskArrayAsString(jVar, i14, Challenge.TASK_ORDER_HABITS));
            challenge.setRewardList(getTaskArrayAsString(jVar, i14, Challenge.TASK_ORDER_REWARDS));
        }
        return challenge;
    }

    @Override // com.google.gson.q
    public l serialize(Challenge challenge, Type type, p pVar) {
        qc.q.i(challenge, "src");
        qc.q.i(type, "typeOfSrc");
        qc.q.i(pVar, "context");
        n nVar = new n();
        nVar.u("id", challenge.getId());
        nVar.u(AppMeasurementSdk.ConditionalUserProperty.NAME, challenge.getName());
        nVar.u("shortName", challenge.getShortName());
        nVar.u("description", challenge.getDescription());
        nVar.t("memberCount", Integer.valueOf(challenge.getMemberCount()));
        nVar.t("prize", Integer.valueOf(challenge.getPrize()));
        nVar.s("official", Boolean.valueOf(challenge.getOfficial()));
        nVar.u("group", challenge.getGroupId());
        nVar.r("tasksOrder", pVar.b(challenge.getTasksOrder()));
        return nVar;
    }
}
