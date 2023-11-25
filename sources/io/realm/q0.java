package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class q0 extends y<p0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(a aVar, OsList osList, Class<p0> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.j(g.c(this.f18417a, (p0) obj).b());
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof p0)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.RealmAny", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        d(i10);
        this.f18418b.D(i10, g.c(this.f18417a, (p0) obj).b());
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.U(i10, g.c(this.f18417a, (p0) obj).b());
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public p0 g(int i10) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.f18418b.t(i10);
        if (nativeRealmAny == null) {
            nativeRealmAny = new NativeRealmAny();
        }
        return new p0(s0.b(this.f18417a, nativeRealmAny));
    }
}
