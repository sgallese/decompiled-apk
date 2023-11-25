package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class m1 extends y<UUID> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(a aVar, OsList osList, Class<UUID> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.m((UUID) obj);
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof UUID)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.UUID", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.G(i10, (UUID) obj);
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.X(i10, (UUID) obj);
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public UUID g(int i10) {
        return (UUID) this.f18418b.t(i10);
    }
}
