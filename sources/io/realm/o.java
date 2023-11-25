package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class o extends c1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o(a aVar, NativeRealmAny nativeRealmAny) {
        super(i(aVar, nativeRealmAny));
    }

    private static <T extends a1> T i(a aVar, NativeRealmAny nativeRealmAny) {
        return (T) aVar.E(p.class, Table.i(nativeRealmAny.getRealmModelTableName(aVar.T())), nativeRealmAny.getRealmModelRowKey());
    }

    @Override // io.realm.c1, io.realm.s0
    Class<?> f() {
        return p.class;
    }
}
