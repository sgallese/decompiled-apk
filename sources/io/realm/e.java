package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class e extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Boolean bool) {
        super(bool, p0.a.BOOLEAN);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Boolean) super.g(Boolean.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), p0.a.BOOLEAN, nativeRealmAny);
    }
}
