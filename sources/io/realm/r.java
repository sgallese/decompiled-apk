package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class r extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), p0.a.FLOAT, nativeRealmAny);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Float) super.g(Float.class));
    }
}
