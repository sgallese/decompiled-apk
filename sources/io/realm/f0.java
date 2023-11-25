package io.realm;

import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;
import org.bson.types.ObjectId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public final class f0 extends k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), p0.a.OBJECT_ID, nativeRealmAny);
    }

    @Override // io.realm.s0
    protected NativeRealmAny a() {
        return new NativeRealmAny((ObjectId) super.g(ObjectId.class));
    }
}
