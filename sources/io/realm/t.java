package io.realm;

import io.realm.f1;
import io.realm.internal.Table;
import io.realm.internal.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableRealmObjectSchema.java */
/* loaded from: classes4.dex */
public class t extends f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar, h1 h1Var, Table table, io.realm.internal.c cVar) {
        super(aVar, h1Var, table, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.f1
    public String d(String str) {
        c.a d10 = this.f17517d.d(str);
        if (d10 != null) {
            return d10.f17808c;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar, h1 h1Var, Table table) {
        super(aVar, h1Var, table, new f1.a(table));
    }
}
