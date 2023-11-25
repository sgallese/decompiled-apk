package io.realm;

import io.realm.f1;
import io.realm.internal.Table;
import io.realm.internal.Util;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableRealmObjectSchema.java */
/* loaded from: classes4.dex */
public class a0 extends f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(a aVar, h1 h1Var, Table table) {
        super(aVar, h1Var, table, new f1.a(table));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.f1
    public String d(String str) {
        String h10 = this.f17516c.o(b(str)).h();
        if (!Util.g(h10)) {
            return h10;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
    }
}
