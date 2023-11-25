package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public abstract class k0 extends s0 {

    /* renamed from: c  reason: collision with root package name */
    private final Object f17866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Object obj, p0.a aVar) {
        super(aVar);
        this.f17866c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f17866c;
        Object obj3 = ((k0) obj).f17866c;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
            return true;
        }
        return obj2.equals(obj3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.s0
    public <T> T g(Class<T> cls) {
        return cls.cast(this.f17866c);
    }

    public final int hashCode() {
        Object obj = this.f17866c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f17866c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Object obj, p0.a aVar, NativeRealmAny nativeRealmAny) {
        super(aVar, nativeRealmAny);
        this.f17866c = obj;
    }
}
