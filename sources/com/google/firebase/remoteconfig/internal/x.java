package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final i9.b<i8.a> f12073a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f12074b = DesugarCollections.synchronizedMap(new HashMap());

    public x(i9.b<i8.a> bVar) {
        this.f12073a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject optJSONObject;
        i8.a aVar = this.f12073a.get();
        if (aVar == null) {
            return;
        }
        JSONObject h10 = gVar.h();
        if (h10.length() < 1) {
            return;
        }
        JSONObject f10 = gVar.f();
        if (f10.length() < 1 || (optJSONObject = h10.optJSONObject(str)) == null) {
            return;
        }
        String optString = optJSONObject.optString("choiceId");
        if (optString.isEmpty()) {
            return;
        }
        synchronized (this.f12074b) {
            if (optString.equals(this.f12074b.get(str))) {
                return;
            }
            this.f12074b.put(str, optString);
            Bundle bundle = new Bundle();
            bundle.putString("arm_key", str);
            bundle.putString("arm_value", f10.optString(str));
            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
            bundle.putString("group", optJSONObject.optString("group"));
            aVar.c("fp", "personalization_assignment", bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString("_fpid", optString);
            aVar.c("fp", "_fpc", bundle2);
        }
    }
}
