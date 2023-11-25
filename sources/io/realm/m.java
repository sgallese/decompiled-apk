package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class m extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Double d10) {
        super(d10, p0.a.DOUBLE);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Double) super.g(Double.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), p0.a.DOUBLE, nativeRealmAny);
    }
}
