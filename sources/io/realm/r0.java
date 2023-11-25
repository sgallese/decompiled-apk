package io.realm;

import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Map;

/* compiled from: RealmAnyNativeFunctionsImpl.java */
/* loaded from: classes4.dex */
public class r0 implements io.realm.internal.m {
    @Override // io.realm.internal.m
    public void a(long j10, Map.Entry<String, p0> entry) {
        OsObjectBuilder.nativeAddRealmAnyDictionaryEntry(j10, entry.getKey(), entry.getValue().b());
    }

    @Override // io.realm.internal.m
    public void b(long j10, p0 p0Var) {
        OsObjectBuilder.nativeAddRealmAnyListItem(j10, p0Var.b());
    }

    public void c(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, p0... p0VarArr) {
        long[] jArr = new long[p0VarArr.length];
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            try {
                jArr[i10] = p0VarArr[i10].b();
            } catch (IllegalStateException e10) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e10);
            }
        }
        tableQuery.x(osKeyPathMapping, str, jArr);
    }
}
