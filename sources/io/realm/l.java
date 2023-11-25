package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class l extends y<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(a aVar, OsList osList, Class<Double> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.e(((Number) obj).doubleValue());
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
        this.f18418b.y(i10, ((Number) obj).doubleValue());
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.P(i10, ((Number) obj).doubleValue());
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public Double g(int i10) {
        return (Double) this.f18418b.t(i10);
    }
}
