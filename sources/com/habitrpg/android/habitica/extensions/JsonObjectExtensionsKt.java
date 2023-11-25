package com.habitrpg.android.habitica.extensions;

import com.google.gson.l;
import com.google.gson.n;
import qc.q;

/* compiled from: JsonObjectExtensions.kt */
/* loaded from: classes4.dex */
public final class JsonObjectExtensionsKt {
    public static final String getAsString(n nVar, String str) {
        String str2;
        l x10;
        q.i(str, "key");
        boolean z10 = false;
        if (nVar != null && (x10 = nVar.x(str)) != null && x10.p()) {
            z10 = true;
        }
        if (!z10) {
            return "";
        }
        l x11 = nVar.x(str);
        if (x11 != null) {
            str2 = x11.l();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
