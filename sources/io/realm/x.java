package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes4.dex */
public final class x<T> extends y<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(a aVar, OsList osList, Class<T> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.y
    public void c(Object obj) {
        this.f18418b.g(((Number) obj).longValue());
    }

    @Override // io.realm.y
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()));
    }

    @Override // io.realm.y
    public boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Long] */
    @Override // io.realm.y
    public T g(int i10) {
        ?? r42 = (T) ((Long) this.f18418b.t(i10));
        if (r42 == 0) {
            return null;
        }
        Class<T> cls = this.f18419c;
        if (cls == Long.class) {
            return r42;
        }
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(r42.intValue()));
        }
        if (cls == Short.class) {
            return cls.cast(Short.valueOf(r42.shortValue()));
        }
        if (cls == Byte.class) {
            return cls.cast(Byte.valueOf(r42.byteValue()));
        }
        throw new IllegalStateException("Unexpected element type: " + this.f18419c.getName());
    }

    @Override // io.realm.y
    public void k(int i10, Object obj) {
        this.f18418b.A(i10, ((Number) obj).longValue());
    }

    @Override // io.realm.y
    protected void r(int i10, Object obj) {
        this.f18418b.R(i10, ((Number) obj).longValue());
    }
}
