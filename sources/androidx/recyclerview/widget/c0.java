package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    final androidx.collection.g<RecyclerView.f0, a> f6696a = new androidx.collection.g<>();

    /* renamed from: b  reason: collision with root package name */
    final androidx.collection.e<RecyclerView.f0> f6697b = new androidx.collection.e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.f<a> f6698d = new androidx.core.util.g(20);

        /* renamed from: a  reason: collision with root package name */
        int f6699a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f6700b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f6701c;

        private a() {
        }

        static void a() {
            do {
            } while (f6698d.b() != null);
        }

        static a b() {
            a b10 = f6698d.b();
            if (b10 == null) {
                return new a();
            }
            return b10;
        }

        static void c(a aVar) {
            aVar.f6699a = 0;
            aVar.f6700b = null;
            aVar.f6701c = null;
            f6698d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.f0 f0Var);

        void b(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    private RecyclerView.m.c l(RecyclerView.f0 f0Var, int i10) {
        a n10;
        RecyclerView.m.c cVar;
        int f10 = this.f6696a.f(f0Var);
        if (f10 >= 0 && (n10 = this.f6696a.n(f10)) != null) {
            int i11 = n10.f6699a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                n10.f6699a = i12;
                if (i10 == 4) {
                    cVar = n10.f6700b;
                } else if (i10 == 8) {
                    cVar = n10.f6701c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f6696a.l(f10);
                    a.c(n10);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f6696a.put(f0Var, aVar);
        }
        aVar.f6699a |= 2;
        aVar.f6700b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.f0 f0Var) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f6696a.put(f0Var, aVar);
        }
        aVar.f6699a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.f0 f0Var) {
        this.f6697b.k(j10, f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f6696a.put(f0Var, aVar);
        }
        aVar.f6701c = cVar;
        aVar.f6699a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f6696a.put(f0Var, aVar);
        }
        aVar.f6700b = cVar;
        aVar.f6699a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f6696a.clear();
        this.f6697b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.f0 g(long j10) {
        return this.f6697b.f(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar != null && (aVar.f6699a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar != null && (aVar.f6699a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f6696a.size() - 1; size >= 0; size--) {
            RecyclerView.f0 j10 = this.f6696a.j(size);
            a l10 = this.f6696a.l(size);
            int i10 = l10.f6699a;
            if ((i10 & 3) == 3) {
                bVar.a(j10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = l10.f6700b;
                if (cVar == null) {
                    bVar.a(j10);
                } else {
                    bVar.c(j10, cVar, l10.f6701c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(j10, l10.f6700b, l10.f6701c);
            } else if ((i10 & 12) == 12) {
                bVar.d(j10, l10.f6700b, l10.f6701c);
            } else if ((i10 & 4) != 0) {
                bVar.c(j10, l10.f6700b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(j10, l10.f6700b, l10.f6701c);
            }
            a.c(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.f0 f0Var) {
        a aVar = this.f6696a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f6699a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.f0 f0Var) {
        int o10 = this.f6697b.o() - 1;
        while (true) {
            if (o10 < 0) {
                break;
            } else if (f0Var == this.f6697b.p(o10)) {
                this.f6697b.n(o10);
                break;
            } else {
                o10--;
            }
        }
        a remove = this.f6696a.remove(f0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
