package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class k1 extends y<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(a aVar, OsList osList, Class<String> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.l((String) obj);
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.F(i10, (String) obj);
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.W(i10, (String) obj);
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public String g(int i10) {
        return (String) this.f18418b.t(i10);
    }
}
