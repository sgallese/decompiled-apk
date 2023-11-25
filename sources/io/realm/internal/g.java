package io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* compiled from: NativeContext.java */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final ReferenceQueue<h> f17812a;

    /* renamed from: b  reason: collision with root package name */
    private static final Thread f17813b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f17814c;

    static {
        ReferenceQueue<h> referenceQueue = new ReferenceQueue<>();
        f17812a = referenceQueue;
        Thread thread = new Thread(new e(referenceQueue));
        f17813b = thread;
        f17814c = new g();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(h hVar) {
        new NativeObjectReference(this, hVar, f17812a);
    }
}
