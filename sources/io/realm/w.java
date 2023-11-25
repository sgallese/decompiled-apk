package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class w extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Integer num) {
        super(num, p0.a.INTEGER);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Number) super.g(Number.class));
    }

    @Override // io.realm.k0
    public boolean equals(Object obj) {
        if (obj == null || !w.class.equals(obj.getClass()) || ((Number) g(Number.class)).longValue() != ((Number) ((s0) obj).g(Number.class)).longValue()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), p0.a.INTEGER, nativeRealmAny);
    }
}
