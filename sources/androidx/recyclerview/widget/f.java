package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapter.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.h<RecyclerView.f0> {

    /* renamed from: a  reason: collision with root package name */
    private final g f6721a;

    /* compiled from: ConcatAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6722c = new a(true, EnumC0156a.NO_STABLE_IDS);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6723a;

        /* renamed from: b  reason: collision with root package name */
        public final EnumC0156a f6724b;

        /* compiled from: ConcatAdapter.java */
        /* renamed from: androidx.recyclerview.widget.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0156a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z10, EnumC0156a enumC0156a) {
            this.f6723a = z10;
            this.f6724b = enumC0156a;
        }
    }

    @SafeVarargs
    public f(RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        this(a.f6722c, hVarArr);
    }

    public boolean f(RecyclerView.h<? extends RecyclerView.f0> hVar) {
        return this.f6721a.h(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int findRelativeAdapterPositionIn(RecyclerView.h<? extends RecyclerView.f0> hVar, RecyclerView.f0 f0Var, int i10) {
        return this.f6721a.p(hVar, f0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f6721a.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f6721a.n(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f6721a.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f6721a.v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        this.f6721a.w(f0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f6721a.x(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f6721a.y(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        return this.f6721a.z(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        this.f6721a.A(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.f0 f0Var) {
        this.f6721a.B(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.f0 f0Var) {
        this.f6721a.C(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public f(a aVar, RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        this(aVar, Arrays.asList(hVarArr));
    }

    public f(a aVar, List<? extends RecyclerView.h<? extends RecyclerView.f0>> list) {
        this.f6721a = new g(this, aVar);
        Iterator<? extends RecyclerView.h<? extends RecyclerView.f0>> it = list.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
        super.setHasStableIds(this.f6721a.s());
    }
}
