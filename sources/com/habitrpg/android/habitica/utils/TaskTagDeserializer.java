package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.habitrpg.android.habitica.models.Tag;
import io.realm.o0;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: TaskTagDeserializer.kt */
/* loaded from: classes4.dex */
public final class TaskTagDeserializer implements k<List<? extends Tag>> {
    public static final int $stable = 0;

    private final boolean alreadyContainsTag(List<? extends Tag> list, String str) {
        Iterator<? extends Tag> it = list.iterator();
        while (it.hasNext()) {
            if (q.d(it.next().getId(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.k
    public List<? extends Tag> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        List arrayList;
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0 x0Var = new x0();
        try {
            o0 Z0 = o0.Z0();
            arrayList = Z0.z0(Z0.k1(Tag.class).p());
            q.h(arrayList, "copyFromRealm(...)");
            Z0.close();
        } catch (RuntimeException unused) {
            arrayList = new ArrayList();
        }
        if (lVar.m()) {
            Iterator<l> it = lVar.h().iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.o()) {
                    x0Var.add(jVar.a(next, Tag.class));
                } else {
                    try {
                        String l10 = next.l();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Tag tag = (Tag) it2.next();
                                if (q.d(tag.getId(), l10)) {
                                    q.f(l10);
                                    if (!alreadyContainsTag(x0Var, l10)) {
                                        x0Var.add(tag);
                                    }
                                }
                            }
                        }
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
        }
        return x0Var;
    }
}
