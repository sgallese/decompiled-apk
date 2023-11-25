package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConcatAdapterController.java */
/* loaded from: classes.dex */
public class g implements s.b {

    /* renamed from: a  reason: collision with root package name */
    private final f f6725a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f6726b;

    /* renamed from: c  reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f6727c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.f0, s> f6728d = new IdentityHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private List<s> f6729e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private a f6730f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final f.a.EnumC0156a f6731g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f6732h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConcatAdapterController.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        s f6733a;

        /* renamed from: b  reason: collision with root package name */
        int f6734b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6735c;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar, f.a aVar) {
        this.f6725a = fVar;
        if (aVar.f6723a) {
            this.f6726b = new d0.a();
        } else {
            this.f6726b = new d0.b();
        }
        f.a.EnumC0156a enumC0156a = aVar.f6724b;
        this.f6731g = enumC0156a;
        if (enumC0156a == f.a.EnumC0156a.NO_STABLE_IDS) {
            this.f6732h = new a0.b();
        } else if (enumC0156a == f.a.EnumC0156a.ISOLATED_STABLE_IDS) {
            this.f6732h = new a0.a();
        } else if (enumC0156a == f.a.EnumC0156a.SHARED_STABLE_IDS) {
            this.f6732h = new a0.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    private void D(a aVar) {
        aVar.f6735c = false;
        aVar.f6733a = null;
        aVar.f6734b = -1;
        this.f6730f = aVar;
    }

    private void i() {
        RecyclerView.h.a j10 = j();
        if (j10 != this.f6725a.getStateRestorationPolicy()) {
            this.f6725a.g(j10);
        }
    }

    private RecyclerView.h.a j() {
        for (s sVar : this.f6729e) {
            RecyclerView.h.a stateRestorationPolicy = sVar.f6933c.getStateRestorationPolicy();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (stateRestorationPolicy == aVar) {
                return aVar;
            }
            if (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && sVar.a() == 0) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int k(s sVar) {
        s next;
        Iterator<s> it = this.f6729e.iterator();
        int i10 = 0;
        while (it.hasNext() && (next = it.next()) != sVar) {
            i10 += next.a();
        }
        return i10;
    }

    private a l(int i10) {
        a aVar = this.f6730f;
        if (aVar.f6735c) {
            aVar = new a();
        } else {
            aVar.f6735c = true;
        }
        Iterator<s> it = this.f6729e.iterator();
        int i11 = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            s next = it.next();
            if (next.a() > i11) {
                aVar.f6733a = next;
                aVar.f6734b = i11;
                break;
            }
            i11 -= next.a();
        }
        if (aVar.f6733a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i10);
    }

    private s m(RecyclerView.h<RecyclerView.f0> hVar) {
        int t10 = t(hVar);
        if (t10 == -1) {
            return null;
        }
        return this.f6729e.get(t10);
    }

    private s r(RecyclerView.f0 f0Var) {
        s sVar = this.f6728d.get(f0Var);
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    private int t(RecyclerView.h<RecyclerView.f0> hVar) {
        int size = this.f6729e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f6729e.get(i10).f6933c == hVar) {
                return i10;
            }
        }
        return -1;
    }

    private boolean u(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f6727c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.f0 f0Var) {
        r(f0Var).f6933c.onViewAttachedToWindow(f0Var);
    }

    public void B(RecyclerView.f0 f0Var) {
        r(f0Var).f6933c.onViewDetachedFromWindow(f0Var);
    }

    public void C(RecyclerView.f0 f0Var) {
        s sVar = this.f6728d.get(f0Var);
        if (sVar != null) {
            sVar.f6933c.onViewRecycled(f0Var);
            this.f6728d.remove(f0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.s.b
    public void a(s sVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.s.b
    public void b(s sVar, int i10, int i11, Object obj) {
        this.f6725a.notifyItemRangeChanged(i10 + k(sVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.s.b
    public void c(s sVar, int i10, int i11) {
        this.f6725a.notifyItemRangeInserted(i10 + k(sVar), i11);
    }

    @Override // androidx.recyclerview.widget.s.b
    public void d(s sVar, int i10, int i11) {
        int k10 = k(sVar);
        this.f6725a.notifyItemMoved(i10 + k10, i11 + k10);
    }

    @Override // androidx.recyclerview.widget.s.b
    public void e(s sVar) {
        this.f6725a.notifyDataSetChanged();
        i();
    }

    @Override // androidx.recyclerview.widget.s.b
    public void f(s sVar, int i10, int i11) {
        this.f6725a.notifyItemRangeRemoved(i10 + k(sVar), i11);
    }

    boolean g(int i10, RecyclerView.h<RecyclerView.f0> hVar) {
        if (i10 >= 0 && i10 <= this.f6729e.size()) {
            if (s()) {
                androidx.core.util.i.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (hVar.hasStableIds()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (m(hVar) != null) {
                return false;
            }
            s sVar = new s(hVar, this, this.f6726b, this.f6732h.a());
            this.f6729e.add(i10, sVar);
            Iterator<WeakReference<RecyclerView>> it = this.f6727c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = it.next().get();
                if (recyclerView != null) {
                    hVar.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (sVar.a() > 0) {
                this.f6725a.notifyItemRangeInserted(k(sVar), sVar.a());
            }
            i();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f6729e.size() + ". Given:" + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.h<RecyclerView.f0> hVar) {
        return g(this.f6729e.size(), hVar);
    }

    public long n(int i10) {
        a l10 = l(i10);
        long b10 = l10.f6733a.b(l10.f6734b);
        D(l10);
        return b10;
    }

    public int o(int i10) {
        a l10 = l(i10);
        int c10 = l10.f6733a.c(l10.f6734b);
        D(l10);
        return c10;
    }

    public int p(RecyclerView.h<? extends RecyclerView.f0> hVar, RecyclerView.f0 f0Var, int i10) {
        s sVar = this.f6728d.get(f0Var);
        if (sVar == null) {
            return -1;
        }
        int k10 = i10 - k(sVar);
        int itemCount = sVar.f6933c.getItemCount();
        if (k10 >= 0 && k10 < itemCount) {
            return sVar.f6933c.findRelativeAdapterPositionIn(hVar, f0Var, k10);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + k10 + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + f0Var + "adapter:" + hVar);
    }

    public int q() {
        Iterator<s> it = this.f6729e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().a();
        }
        return i10;
    }

    public boolean s() {
        if (this.f6731g != f.a.EnumC0156a.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    public void v(RecyclerView recyclerView) {
        if (u(recyclerView)) {
            return;
        }
        this.f6727c.add(new WeakReference<>(recyclerView));
        Iterator<s> it = this.f6729e.iterator();
        while (it.hasNext()) {
            it.next().f6933c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void w(RecyclerView.f0 f0Var, int i10) {
        a l10 = l(i10);
        this.f6728d.put(f0Var, l10.f6733a);
        l10.f6733a.d(f0Var, l10.f6734b);
        D(l10);
    }

    public RecyclerView.f0 x(ViewGroup viewGroup, int i10) {
        return this.f6726b.a(i10).e(viewGroup, i10);
    }

    public void y(RecyclerView recyclerView) {
        int size = this.f6727c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f6727c.get(size);
            if (weakReference.get() == null) {
                this.f6727c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f6727c.remove(size);
                break;
            }
            size--;
        }
        Iterator<s> it = this.f6729e.iterator();
        while (it.hasNext()) {
            it.next().f6933c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean z(RecyclerView.f0 f0Var) {
        s sVar = this.f6728d.get(f0Var);
        if (sVar != null) {
            boolean onFailedToRecycleView = sVar.f6933c.onFailedToRecycleView(f0Var);
            this.f6728d.remove(f0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
