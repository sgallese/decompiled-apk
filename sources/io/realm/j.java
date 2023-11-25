package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.Decimal128;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class j extends y<Decimal128> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(a aVar, OsList osList, Class<Decimal128> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.d((Decimal128) obj);
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Decimal128)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.Decimal128", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.x(i10, (Decimal128) obj);
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.O(i10, (Decimal128) obj);
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public Decimal128 g(int i10) {
        return (Decimal128) this.f18418b.t(i10);
    }
}
