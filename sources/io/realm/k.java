package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import org.bson.types.Decimal128;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class k extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), p0.a.DECIMAL128, nativeRealmAny);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Decimal128) super.g(Decimal128.class));
    }
}
