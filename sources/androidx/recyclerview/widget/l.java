package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: r  reason: collision with root package name */
    static final ThreadLocal<l> f6847r = new ThreadLocal<>();

    /* renamed from: s  reason: collision with root package name */
    static Comparator<c> f6848s = new a();

    /* renamed from: m  reason: collision with root package name */
    long f6850m;

    /* renamed from: p  reason: collision with root package name */
    long f6851p;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<RecyclerView> f6849f = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<c> f6852q = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            boolean z10;
            boolean z11;
            RecyclerView recyclerView = cVar.f6860d;
            if (recyclerView == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (cVar2.f6860d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z12 = cVar.f6857a;
            if (z12 != cVar2.f6857a) {
                if (!z12) {
                    return 1;
                }
                return -1;
            }
            int i10 = cVar2.f6858b - cVar.f6858b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f6859c - cVar2.f6859c;
            if (i11 == 0) {
                return 0;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        int f6853a;

        /* renamed from: b  reason: collision with root package name */
        int f6854b;

        /* renamed from: c  reason: collision with root package name */
        int[] f6855c;

        /* renamed from: d  reason: collision with root package name */
        int f6856d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = this.f6856d * 2;
                    int[] iArr = this.f6855c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f6855c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i12 >= iArr.length) {
                        int[] iArr3 = new int[i12 * 2];
                        this.f6855c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f6855c;
                    iArr4[i12] = i10;
                    iArr4[i12 + 1] = i11;
                    this.f6856d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f6855c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6856d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f6856d = 0;
            int[] iArr = this.f6855c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && pVar != null && pVar.C0()) {
                if (z10) {
                    if (!recyclerView.mAdapterHelper.p()) {
                        pVar.B(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    pVar.A(this.f6853a, this.f6854b, recyclerView.mState, this);
                }
                int i10 = this.f6856d;
                if (i10 > pVar.f6599z) {
                    pVar.f6599z = i10;
                    pVar.A = z10;
                    recyclerView.mRecycler.P();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f6855c != null) {
                int i11 = this.f6856d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f6855c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f6853a = i10;
            this.f6854b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6857a;

        /* renamed from: b  reason: collision with root package name */
        public int f6858b;

        /* renamed from: c  reason: collision with root package name */
        public int f6859c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f6860d;

        /* renamed from: e  reason: collision with root package name */
        public int f6861e;

        c() {
        }

        public void a() {
            this.f6857a = false;
            this.f6858b = 0;
            this.f6859c = 0;
            this.f6860d = null;
            this.f6861e = 0;
        }
    }

    private void b() {
        c cVar;
        boolean z10;
        int size = this.f6849f.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f6849f.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f6856d;
            }
        }
        this.f6852q.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f6849f.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f6853a) + Math.abs(bVar.f6854b);
                for (int i14 = 0; i14 < bVar.f6856d * 2; i14 += 2) {
                    if (i12 >= this.f6852q.size()) {
                        cVar = new c();
                        this.f6852q.add(cVar);
                    } else {
                        cVar = this.f6852q.get(i12);
                    }
                    int[] iArr = bVar.f6855c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f6857a = z10;
                    cVar.f6858b = abs;
                    cVar.f6859c = i15;
                    cVar.f6860d = recyclerView2;
                    cVar.f6861e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f6852q, f6848s);
    }

    private void c(c cVar, long j10) {
        long j11;
        if (cVar.f6857a) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j10;
        }
        RecyclerView.f0 i10 = i(cVar.f6860d, cVar.f6861e, j11);
        if (i10 != null && i10.mNestedRecyclerView != null && i10.isBound() && !i10.isInvalid()) {
            h(i10.mNestedRecyclerView.get(), j10);
        }
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f6852q.size(); i10++) {
            c cVar = this.f6852q.get(i10);
            if (cVar.f6860d != null) {
                c(cVar, j10);
                cVar.a();
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f6856d != 0) {
            try {
                androidx.core.os.t.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f6856d * 2; i10 += 2) {
                    i(recyclerView, bVar.f6855c[i10], j10);
                }
            } finally {
                androidx.core.os.t.b();
            }
        }
    }

    private RecyclerView.f0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 N = wVar.N(i10, false, j10);
            if (N != null) {
                if (N.isBound() && !N.isInvalid()) {
                    wVar.G(N.itemView);
                } else {
                    wVar.a(N, false);
                }
            }
            return N;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f6849f.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f6849f.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f6849f.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f6850m == 0) {
                this.f6850m = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f6849f.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.t.a("RV Prefetch");
            if (!this.f6849f.isEmpty()) {
                int size = this.f6849f.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f6849f.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f6851p);
                }
            }
        } finally {
            this.f6850m = 0L;
            androidx.core.os.t.b();
        }
    }
}
