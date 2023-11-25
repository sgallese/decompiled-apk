package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class n1 extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), p0.a.UUID, nativeRealmAny);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((UUID) super.g(UUID.class));
    }
}
