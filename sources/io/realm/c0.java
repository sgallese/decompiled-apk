package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class c0 extends s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c0() {
        super(p0.a.NULL);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny();
    }

    public boolean equals(Object obj) {
        if (obj != null && c0.class.equals(obj.getClass())) {
            return true;
        }
        return false;
    }

    @Override // io.realm.s0
    public <T> T g(Class<T> cls) {
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "null";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(NativeRealmAny nativeRealmAny) {
        super(p0.a.NULL, nativeRealmAny);
    }
}
