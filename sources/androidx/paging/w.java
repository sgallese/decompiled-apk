package androidx.paging;

import androidx.paging.d1;
import androidx.paging.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CachedPageEventFlow.kt */
/* loaded from: classes.dex */
public final class w<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f6126a;

    /* renamed from: b  reason: collision with root package name */
    private int f6127b;

    /* renamed from: c  reason: collision with root package name */
    private final ec.k<l2<T>> f6128c = new ec.k<>();

    /* renamed from: d  reason: collision with root package name */
    private final y0 f6129d = new y0();

    /* renamed from: e  reason: collision with root package name */
    private s0 f6130e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6131f;

    /* compiled from: CachedPageEventFlow.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6132a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6132a = iArr;
        }
    }

    private final void c(d1.b<T> bVar) {
        vc.d p10;
        this.f6129d.b(bVar.i());
        this.f6130e = bVar.e();
        int i10 = a.f6132a[bVar.d().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f6128c.clear();
                    this.f6127b = bVar.g();
                    this.f6126a = bVar.h();
                    this.f6128c.addAll(bVar.f());
                    return;
                }
                return;
            }
            this.f6127b = bVar.g();
            this.f6128c.addAll(bVar.f());
            return;
        }
        this.f6126a = bVar.h();
        p10 = vc.l.p(bVar.f().size() - 1, 0);
        Iterator<Integer> it = p10.iterator();
        while (it.hasNext()) {
            this.f6128c.f(bVar.f().get(((ec.h0) it).a()));
        }
    }

    private final void d(d1.c<T> cVar) {
        this.f6129d.b(cVar.b());
        this.f6130e = cVar.a();
    }

    private final void e(d1.a<T> aVar) {
        this.f6129d.c(aVar.a(), q0.c.f6001b.b());
        int i10 = a.f6132a[aVar.a().ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f6127b = aVar.e();
                int d10 = aVar.d();
                while (i11 < d10) {
                    this.f6128c.u();
                    i11++;
                }
                return;
            }
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.f6126a = aVar.e();
        int d11 = aVar.d();
        while (i11 < d11) {
            this.f6128c.s();
            i11++;
        }
    }

    private final void f(d1.d<T> dVar) {
        if (dVar.c() != null) {
            this.f6129d.b(dVar.c());
        }
        if (dVar.b() != null) {
            this.f6130e = dVar.b();
        }
        this.f6128c.clear();
        this.f6127b = 0;
        this.f6126a = 0;
        this.f6128c.add(new l2<>(0, dVar.a()));
    }

    public final void a(d1<T> d1Var) {
        qc.q.i(d1Var, "event");
        this.f6131f = true;
        if (d1Var instanceof d1.b) {
            c((d1.b) d1Var);
        } else if (d1Var instanceof d1.a) {
            e((d1.a) d1Var);
        } else if (d1Var instanceof d1.c) {
            d((d1.c) d1Var);
        } else if (d1Var instanceof d1.d) {
            f((d1.d) d1Var);
        }
    }

    public final List<d1<T>> b() {
        List<l2<T>> C0;
        List<d1<T>> i10;
        if (!this.f6131f) {
            i10 = ec.t.i();
            return i10;
        }
        ArrayList arrayList = new ArrayList();
        s0 d10 = this.f6129d.d();
        if ((!this.f6128c.isEmpty()) != false) {
            d1.b.a aVar = d1.b.f5458g;
            C0 = ec.b0.C0(this.f6128c);
            arrayList.add(aVar.c(C0, this.f6126a, this.f6127b, d10, this.f6130e));
        } else {
            arrayList.add(new d1.c(d10, this.f6130e));
        }
        return arrayList;
    }
}
