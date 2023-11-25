package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class i extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Date date) {
        super(date, p0.a.DATE);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Date) super.g(Date.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), p0.a.DATE, nativeRealmAny);
    }
}
