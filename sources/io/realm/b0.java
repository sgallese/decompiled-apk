package io.realm;

import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableRealmSchema.java */
/* loaded from: classes4.dex */
public class b0 extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(a aVar) {
        super(aVar, null);
    }

    @Override // io.realm.h1
    public Set<f1> d() {
        String[] tablesNames = this.f17616f.T().getTablesNames();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tablesNames.length);
        for (String str : tablesNames) {
            f1 o10 = o(Table.i(str));
            if (o10 != null) {
                linkedHashSet.add(o10);
            }
        }
        return linkedHashSet;
    }

    public f1 o(String str) {
        b(str, "Null or empty class names are not allowed");
        String r10 = Table.r(str);
        if (!this.f17616f.T().hasTable(r10)) {
            return null;
        }
        return new a0(this.f17616f, this, this.f17616f.T().getTable(r10));
    }
}
