package com.habitrpg.android.habitica.utils;

import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;
import qc.q;

/* compiled from: AssignedDetailsDeserializer.kt */
/* loaded from: classes4.dex */
public final class AssignedDetailsDeserializer implements k<x0<GroupAssignedDetails>> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public x0<GroupAssignedDetails> deserialize(l lVar, Type type, j jVar) {
        x0<GroupAssignedDetails> x0Var = new x0<>();
        if (lVar == null) {
            return x0Var;
        }
        if (lVar.m()) {
            i h10 = lVar.h();
            q.h(h10, "getAsJsonArray(...)");
            Iterator<l> it = h10.iterator();
            while (it.hasNext()) {
                x0Var.add(jVar != null ? (GroupAssignedDetails) jVar.a(it.next(), GroupAssignedDetails.class) : null);
            }
        } else {
            n i10 = lVar.i();
            Set<String> E = i10.E();
            q.h(E, "keySet(...)");
            for (String str : E) {
                GroupAssignedDetails groupAssignedDetails = jVar != null ? (GroupAssignedDetails) jVar.a(i10.x(str), GroupAssignedDetails.class) : null;
                if (groupAssignedDetails != null) {
                    groupAssignedDetails.setAssignedUserID(str);
                }
                x0Var.add(groupAssignedDetails);
            }
        }
        return x0Var;
    }
}
