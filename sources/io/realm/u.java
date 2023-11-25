package io.realm;

import io.realm.internal.Table;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableRealmSchema.java */
/* loaded from: classes4.dex */
public class u extends h1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(a aVar, io.realm.internal.b bVar) {
        super(aVar, bVar);
    }

    @Override // io.realm.h1
    public Set<f1> d() {
        io.realm.internal.p p10 = this.f17616f.L().p();
        Set<Class<? extends a1>> k10 = p10.k();
        LinkedHashSet linkedHashSet = new LinkedHashSet(k10.size());
        Iterator<Class<? extends a1>> it = k10.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(o(p10.m(it.next())));
        }
        return linkedHashSet;
    }

    public f1 o(String str) {
        b(str, "Null or empty class names are not allowed");
        String r10 = Table.r(str);
        if (!this.f17616f.T().hasTable(r10)) {
            return null;
        }
        return new t(this.f17616f, this, this.f17616f.T().getTable(r10), f(str));
    }
}
