package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class q extends y<Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q(a aVar, OsList osList, Class<Float> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.f(((Number) obj).floatValue());
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.z(i10, ((Number) obj).floatValue());
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.Q(i10, ((Number) obj).floatValue());
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public Float g(int i10) {
        return (Float) this.f18418b.t(i10);
    }
}
