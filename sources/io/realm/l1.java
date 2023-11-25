package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class l1 extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(String str) {
        super(str, p0.a.STRING);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((String) super.g(String.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), p0.a.STRING, nativeRealmAny);
    }
}
