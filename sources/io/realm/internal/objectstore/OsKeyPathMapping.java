package io.realm.internal.objectstore;

import io.realm.internal.g;
import io.realm.internal.h;

/* loaded from: classes4.dex */
public class OsKeyPathMapping implements h {

    /* renamed from: m  reason: collision with root package name */
    private static final long f17833m = nativeGetFinalizerMethodPtr();

    /* renamed from: f  reason: collision with root package name */
    public long f17834f;

    public OsKeyPathMapping(long j10) {
        this.f17834f = -1L;
        this.f17834f = nativeCreateMapping(j10);
        g.f17814c.a(this);
    }

    private static native long nativeCreateMapping(long j10);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17833m;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17834f;
    }
}
