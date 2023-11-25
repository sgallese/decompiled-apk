package k0;

import android.util.SparseArray;
import qc.h;

/* compiled from: ActualIntMap.android.kt */
/* loaded from: classes.dex */
public final class e<E> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<E> f19135a;

    private e(SparseArray<E> sparseArray) {
        this.f19135a = sparseArray;
    }

    public final void a() {
        this.f19135a.clear();
    }

    public final E b(int i10) {
        return this.f19135a.get(i10);
    }

    public final void c(int i10, E e10) {
        this.f19135a.put(i10, e10);
    }

    public e(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ e(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
