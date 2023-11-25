package io.realm.internal;

import io.realm.g0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class OsCollectionChangeSet implements g0, h {

    /* renamed from: p  reason: collision with root package name */
    private static long f17714p = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private final long f17715f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f17716m;

    public OsCollectionChangeSet(long j10, boolean z10) {
        this.f17715f = j10;
        this.f17716m = z10;
        g.f17814c.a(this);
    }

    private g0.a[] g(int[] iArr) {
        if (iArr == null) {
            return new g0.a[0];
        }
        int length = iArr.length / 2;
        g0.a[] aVarArr = new g0.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            aVarArr[i10] = new g0.a(iArr[i11], iArr[i11 + 1]);
        }
        return aVarArr;
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetIndices(long j10, int i10);

    private static native int[] nativeGetRanges(long j10, int i10);

    public g0.a[] a() {
        return g(nativeGetRanges(this.f17715f, 2));
    }

    public g0.a[] b() {
        return g(nativeGetRanges(this.f17715f, 0));
    }

    public Throwable c() {
        return null;
    }

    public g0.a[] d() {
        return g(nativeGetRanges(this.f17715f, 1));
    }

    public boolean e() {
        if (this.f17715f == 0) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f17716m;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17714p;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17715f;
    }

    public String toString() {
        if (this.f17715f == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(b()) + "\nInsertion Ranges: " + Arrays.toString(d()) + "\nChange Ranges: " + Arrays.toString(a());
    }
}
