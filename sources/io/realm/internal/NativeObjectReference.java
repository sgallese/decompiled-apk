package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NativeObjectReference extends PhantomReference<h> {

    /* renamed from: f  reason: collision with root package name */
    private static b f17705f = new b();

    /* renamed from: a  reason: collision with root package name */
    private final long f17706a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17707b;

    /* renamed from: c  reason: collision with root package name */
    private final g f17708c;

    /* renamed from: d  reason: collision with root package name */
    private NativeObjectReference f17709d;

    /* renamed from: e  reason: collision with root package name */
    private NativeObjectReference f17710e;

    /* loaded from: classes4.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        NativeObjectReference f17711a;

        private b() {
        }

        synchronized void a(NativeObjectReference nativeObjectReference) {
            nativeObjectReference.f17709d = null;
            nativeObjectReference.f17710e = this.f17711a;
            NativeObjectReference nativeObjectReference2 = this.f17711a;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f17709d = nativeObjectReference;
            }
            this.f17711a = nativeObjectReference;
        }

        synchronized void b(NativeObjectReference nativeObjectReference) {
            NativeObjectReference nativeObjectReference2 = nativeObjectReference.f17710e;
            NativeObjectReference nativeObjectReference3 = nativeObjectReference.f17709d;
            nativeObjectReference.f17710e = null;
            nativeObjectReference.f17709d = null;
            if (nativeObjectReference3 != null) {
                nativeObjectReference3.f17710e = nativeObjectReference2;
            } else {
                this.f17711a = nativeObjectReference2;
            }
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f17709d = nativeObjectReference3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeObjectReference(g gVar, h hVar, ReferenceQueue<? super h> referenceQueue) {
        super(hVar, referenceQueue);
        this.f17706a = hVar.getNativePtr();
        this.f17707b = hVar.getNativeFinalizerPtr();
        this.f17708c = gVar;
        f17705f.a(this);
    }

    static native void nativeCleanUp(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f17708c) {
            nativeCleanUp(this.f17707b, this.f17706a);
        }
        f17705f.b(this);
    }
}
