package androidx.paging;

import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import java.util.List;

/* compiled from: ItemSnapshotList.kt */
/* loaded from: classes.dex */
public final class j0<T> extends ec.c<T> {

    /* renamed from: m  reason: collision with root package name */
    private final int f5801m;

    /* renamed from: p  reason: collision with root package name */
    private final int f5802p;

    /* renamed from: q  reason: collision with root package name */
    private final List<T> f5803q;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(int i10, int i11, List<? extends T> list) {
        qc.q.i(list, NavigationDrawerFragment.SIDEBAR_ITEMS);
        this.f5801m = i10;
        this.f5802p = i11;
        this.f5803q = list;
    }

    @Override // ec.a
    public int a() {
        return this.f5801m + this.f5803q.size() + this.f5802p;
    }

    @Override // ec.c, java.util.List
    public T get(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (i10 >= 0 && i10 < this.f5801m) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        int i11 = this.f5801m;
        if (i10 < this.f5803q.size() + i11 && i11 <= i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return this.f5803q.get(i10 - this.f5801m);
        }
        int size = this.f5801m + this.f5803q.size();
        if (i10 >= size() || size > i10) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i10 + " in ItemSnapshotList of size " + size());
    }
}
