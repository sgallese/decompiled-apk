package com.habitrpg.android.habitica.utils;

import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;

/* compiled from: TaskSerializer.kt */
/* loaded from: classes4.dex */
public final class TaskSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAsBooleanOrFalse(o oVar) {
        if (oVar.t()) {
            return oVar.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l safeGet(n nVar, String str) {
        if (nVar.D("streak") && !nVar.x(str).n()) {
            return nVar.x(str);
        }
        return null;
    }
}
