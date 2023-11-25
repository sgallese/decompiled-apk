package io.realm.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class OsSchemaInfo implements h {

    /* renamed from: p  reason: collision with root package name */
    private static final long f17765p = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private long f17766f;

    /* renamed from: m  reason: collision with root package name */
    private final OsSharedRealm f17767m;

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.f17766f = nativeCreateFromList(a(collection));
        g.f17814c.a(this);
        this.f17767m = null;
    }

    private static long[] a(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<OsObjectSchemaInfo> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().getNativePtr();
            i10++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j10, String str);

    public OsObjectSchemaInfo b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f17766f, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17765p;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17766f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSchemaInfo(long j10, OsSharedRealm osSharedRealm) {
        this.f17766f = j10;
        this.f17767m = osSharedRealm;
    }
}
