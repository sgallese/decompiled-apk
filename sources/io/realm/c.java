package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class c extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), p0.a.BINARY, nativeRealmAny);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((byte[]) super.g(byte[].class));
    }

    @Override // io.realm.k0
    public boolean equals(Object obj) {
        if (obj != null && c.class.equals(obj.getClass())) {
            return Arrays.equals((byte[]) g(byte[].class), (byte[]) ((s0) obj).g(byte[].class));
        }
        return false;
    }
}
