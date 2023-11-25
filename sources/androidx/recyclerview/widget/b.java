package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView.h f6680a;

    public b(RecyclerView.h hVar) {
        this.f6680a = hVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void a(int i10, int i11) {
        this.f6680a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i10, int i11) {
        this.f6680a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i10, int i11) {
        this.f6680a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void d(int i10, int i11, Object obj) {
        this.f6680a.notifyItemRangeChanged(i10, i11, obj);
    }
}
