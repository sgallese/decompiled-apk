package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class d extends y<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, OsList osList, Class<Boolean> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.b(((Boolean) obj).booleanValue());
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Boolean)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.v(i10, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.M(i10, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public Boolean g(int i10) {
        return (Boolean) this.f18418b.t(i10);
    }
}
