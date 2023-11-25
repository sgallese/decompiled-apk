package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final d0.c f6931a;

    /* renamed from: b  reason: collision with root package name */
    private final a0.d f6932b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.f0> f6933c;

    /* renamed from: d  reason: collision with root package name */
    final b f6934d;

    /* renamed from: e  reason: collision with root package name */
    int f6935e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.j f6936f = new a();

    /* compiled from: NestedAdapterWrapper.java */
    /* loaded from: classes.dex */
    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            s sVar = s.this;
            sVar.f6935e = sVar.f6933c.getItemCount();
            s sVar2 = s.this;
            sVar2.f6934d.e(sVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            s sVar = s.this;
            sVar.f6934d.b(sVar, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            s sVar = s.this;
            sVar.f6935e += i11;
            sVar.f6934d.c(sVar, i10, i11);
            s sVar2 = s.this;
            if (sVar2.f6935e > 0 && sVar2.f6933c.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                s sVar3 = s.this;
                sVar3.f6934d.a(sVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            boolean z10 = true;
            if (i12 != 1) {
                z10 = false;
            }
            androidx.core.util.i.b(z10, "moving more than 1 item is not supported in RecyclerView");
            s sVar = s.this;
            sVar.f6934d.d(sVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            s sVar = s.this;
            sVar.f6935e -= i11;
            sVar.f6934d.f(sVar, i10, i11);
            s sVar2 = s.this;
            if (sVar2.f6935e < 1 && sVar2.f6933c.getStateRestorationPolicy() == RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                s sVar3 = s.this;
                sVar3.f6934d.a(sVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            s sVar = s.this;
            sVar.f6934d.a(sVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            s sVar = s.this;
            sVar.f6934d.b(sVar, i10, i11, obj);
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    /* loaded from: classes.dex */
    interface b {
        void a(s sVar);

        void b(s sVar, int i10, int i11, Object obj);

        void c(s sVar, int i10, int i11);

        void d(s sVar, int i10, int i11);

        void e(s sVar);

        void f(s sVar, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(RecyclerView.h<RecyclerView.f0> hVar, b bVar, d0 d0Var, a0.d dVar) {
        this.f6933c = hVar;
        this.f6934d = bVar;
        this.f6931a = d0Var.b(this);
        this.f6932b = dVar;
        this.f6935e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(this.f6936f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f6935e;
    }

    public long b(int i10) {
        return this.f6932b.a(this.f6933c.getItemId(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f6931a.b(this.f6933c.getItemViewType(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.f0 f0Var, int i10) {
        this.f6933c.bindViewHolder(f0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.f0 e(ViewGroup viewGroup, int i10) {
        return this.f6933c.onCreateViewHolder(viewGroup, this.f6931a.a(i10));
    }
}
