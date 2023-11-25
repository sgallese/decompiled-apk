package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class e0 extends y<ObjectId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(a aVar, OsList osList, Class<ObjectId> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.i((ObjectId) obj);
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof ObjectId)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.C(i10, (ObjectId) obj);
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.T(i10, (ObjectId) obj);
    }

    @Override // io.realm.y
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public ObjectId g(int i10) {
        return (ObjectId) this.f18418b.t(i10);
    }
}
