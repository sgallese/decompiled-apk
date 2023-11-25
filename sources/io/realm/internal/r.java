package io.realm.internal;

import io.realm.g0;

/* compiled from: StatefulCollectionChangeSet.java */
/* loaded from: classes4.dex */
public class r implements g0 {

    /* renamed from: f  reason: collision with root package name */
    private final g0 f17862f;

    /* renamed from: m  reason: collision with root package name */
    private final Throwable f17863m;

    /* renamed from: p  reason: collision with root package name */
    private final g0.b f17864p;

    public r(OsCollectionChangeSet osCollectionChangeSet) {
        g0.b bVar;
        this.f17862f = osCollectionChangeSet;
        boolean f10 = osCollectionChangeSet.f();
        Throwable c10 = osCollectionChangeSet.c();
        this.f17863m = c10;
        if (c10 != null) {
            this.f17864p = g0.b.ERROR;
            return;
        }
        if (f10) {
            bVar = g0.b.INITIAL;
        } else {
            bVar = g0.b.UPDATE;
        }
        this.f17864p = bVar;
    }
}
