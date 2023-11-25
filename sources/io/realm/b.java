package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class b extends y<byte[]> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, OsList osList, Class<byte[]> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.a((byte[]) obj);
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof byte[])) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "byte[]", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.u(i10, (byte[]) obj);
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.L(i10, (byte[]) obj);
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public byte[] g(int i10) {
        return (byte[]) this.f18418b.t(i10);
    }
}
