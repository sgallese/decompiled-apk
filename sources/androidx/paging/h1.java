package androidx.paging;

import androidx.paging.d1;
import androidx.paging.o2;
import androidx.paging.q0;
import androidx.paging.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: PageFetcherSnapshotState.kt */
/* loaded from: classes.dex */
public final class h1<Key, Value> {

    /* renamed from: a */
    private final r1 f5727a;

    /* renamed from: b */
    private final List<u1.b.C0145b<Key, Value>> f5728b;

    /* renamed from: c */
    private final List<u1.b.C0145b<Key, Value>> f5729c;

    /* renamed from: d */
    private int f5730d;

    /* renamed from: e */
    private int f5731e;

    /* renamed from: f */
    private int f5732f;

    /* renamed from: g */
    private int f5733g;

    /* renamed from: h */
    private int f5734h;

    /* renamed from: i */
    private final cd.d<Integer> f5735i;

    /* renamed from: j */
    private final cd.d<Integer> f5736j;

    /* renamed from: k */
    private final Map<t0, o2> f5737k;

    /* renamed from: l */
    private y0 f5738l;

    /* compiled from: PageFetcherSnapshotState.kt */
    /* loaded from: classes.dex */
    public static final class a<Key, Value> {

        /* renamed from: a */
        private final r1 f5739a;

        /* renamed from: b */
        private final jd.a f5740b;

        /* renamed from: c */
        private final h1<Key, Value> f5741c;

        public a(r1 r1Var) {
            qc.q.i(r1Var, "config");
            this.f5739a = r1Var;
            this.f5740b = jd.c.b(false, 1, null);
            this.f5741c = new h1<>(r1Var, null);
        }

        public static final /* synthetic */ jd.a a(a aVar) {
            return aVar.f5740b;
        }

        public static final /* synthetic */ h1 b(a aVar) {
            return aVar.f5741c;
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5742a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5742a = iArr;
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super Integer>, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f5743f;

        /* renamed from: m */
        final /* synthetic */ h1<Key, Value> f5744m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h1<Key, Value> h1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f5744m = h1Var;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(dd.h<? super Integer> hVar, Continuation<? super dc.w> continuation) {
            return ((c) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f5744m, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5743f == 0) {
                dc.n.b(obj);
                ((h1) this.f5744m).f5736j.p(kotlin.coroutines.jvm.internal.b.d(((h1) this.f5744m).f5734h));
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super Integer>, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f5745f;

        /* renamed from: m */
        final /* synthetic */ h1<Key, Value> f5746m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h1<Key, Value> h1Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f5746m = h1Var;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(dd.h<? super Integer> hVar, Continuation<? super dc.w> continuation) {
            return ((d) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new d(this.f5746m, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5745f == 0) {
                dc.n.b(obj);
                ((h1) this.f5746m).f5735i.p(kotlin.coroutines.jvm.internal.b.d(((h1) this.f5746m).f5733g));
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ h1(r1 r1Var, qc.h hVar) {
        this(r1Var);
    }

    public final dd.g<Integer> e() {
        return dd.i.K(dd.i.i(this.f5736j), new c(this, null));
    }

    public final dd.g<Integer> f() {
        return dd.i.K(dd.i.i(this.f5735i), new d(this, null));
    }

    public final w1<Key, Value> g(o2.a aVar) {
        List C0;
        Integer num;
        int k10;
        int size;
        C0 = ec.b0.C0(this.f5729c);
        if (aVar != null) {
            int o10 = o();
            int i10 = -this.f5730d;
            k10 = ec.t.k(this.f5729c);
            int i11 = k10 - this.f5730d;
            int g10 = aVar.g();
            for (int i12 = i10; i12 < g10; i12++) {
                if (i12 > i11) {
                    size = this.f5727a.f6018a;
                } else {
                    size = this.f5729c.get(this.f5730d + i12).e().size();
                }
                o10 += size;
            }
            int f10 = o10 + aVar.f();
            if (aVar.g() < i10) {
                f10 -= this.f5727a.f6018a;
            }
            num = Integer.valueOf(f10);
        } else {
            num = null;
        }
        return new w1<>(C0, num, this.f5727a, o());
    }

    public final void h(d1.a<Value> aVar) {
        boolean z10;
        qc.q.i(aVar, "event");
        if (aVar.d() <= this.f5729c.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5737k.remove(aVar.a());
            this.f5738l.c(aVar.a(), q0.c.f6001b.b());
            int i10 = b.f5742a[aVar.a().ordinal()];
            if (i10 != 2) {
                if (i10 == 3) {
                    int d10 = aVar.d();
                    for (int i11 = 0; i11 < d10; i11++) {
                        this.f5728b.remove(this.f5729c.size() - 1);
                    }
                    s(aVar.e());
                    int i12 = this.f5734h + 1;
                    this.f5734h = i12;
                    this.f5736j.p(Integer.valueOf(i12));
                    return;
                }
                throw new IllegalArgumentException("cannot drop " + aVar.a());
            }
            int d11 = aVar.d();
            for (int i13 = 0; i13 < d11; i13++) {
                this.f5728b.remove(0);
            }
            this.f5730d -= aVar.d();
            t(aVar.e());
            int i14 = this.f5733g + 1;
            this.f5733g = i14;
            this.f5735i.p(Integer.valueOf(i14));
            return;
        }
        throw new IllegalStateException(("invalid drop count. have " + this.f5729c.size() + " but wanted to drop " + aVar.d()).toString());
    }

    public final d1.a<Value> i(t0 t0Var, o2 o2Var) {
        boolean z10;
        int k10;
        int i10;
        int k11;
        int i11;
        int n10;
        int k12;
        int size;
        int c10;
        qc.q.i(t0Var, "loadType");
        qc.q.i(o2Var, "hint");
        d1.a<Value> aVar = null;
        if (this.f5727a.f6022e == Integer.MAX_VALUE || this.f5729c.size() <= 2 || q() <= this.f5727a.f6022e) {
            return null;
        }
        int i12 = 0;
        if (t0Var != t0.REFRESH) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < this.f5729c.size() && q() - i14 > this.f5727a.f6022e) {
                int[] iArr = b.f5742a;
                if (iArr[t0Var.ordinal()] == 2) {
                    size = this.f5729c.get(i13).e().size();
                } else {
                    List<u1.b.C0145b<Key, Value>> list = this.f5729c;
                    k12 = ec.t.k(list);
                    size = list.get(k12 - i13).e().size();
                }
                if (iArr[t0Var.ordinal()] == 2) {
                    c10 = o2Var.d();
                } else {
                    c10 = o2Var.c();
                }
                if ((c10 - i14) - size < this.f5727a.f6019b) {
                    break;
                }
                i14 += size;
                i13++;
            }
            if (i13 != 0) {
                int[] iArr2 = b.f5742a;
                if (iArr2[t0Var.ordinal()] != 2) {
                    k10 = ec.t.k(this.f5729c);
                    i10 = (k10 - this.f5730d) - (i13 - 1);
                } else {
                    i10 = -this.f5730d;
                }
                if (iArr2[t0Var.ordinal()] != 2) {
                    k11 = ec.t.k(this.f5729c);
                    i11 = k11 - this.f5730d;
                } else {
                    i11 = (i13 - 1) - this.f5730d;
                }
                if (this.f5727a.f6020c) {
                    if (t0Var == t0.PREPEND) {
                        n10 = o();
                    } else {
                        n10 = n();
                    }
                    i12 = n10 + i14;
                }
                aVar = new d1.a<>(t0Var, i10, i11, i12);
            }
            return aVar;
        }
        throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + t0Var).toString());
    }

    public final int j(t0 t0Var) {
        qc.q.i(t0Var, "loadType");
        int i10 = b.f5742a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.f5734h;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f5733g;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    public final Map<t0, o2> k() {
        return this.f5737k;
    }

    public final int l() {
        return this.f5730d;
    }

    public final List<u1.b.C0145b<Key, Value>> m() {
        return this.f5729c;
    }

    public final int n() {
        if (this.f5727a.f6020c) {
            return this.f5732f;
        }
        return 0;
    }

    public final int o() {
        if (this.f5727a.f6020c) {
            return this.f5731e;
        }
        return 0;
    }

    public final y0 p() {
        return this.f5738l;
    }

    public final int q() {
        Iterator<T> it = this.f5729c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((u1.b.C0145b) it.next()).e().size();
        }
        return i10;
    }

    public final boolean r(int i10, t0 t0Var, u1.b.C0145b<Key, Value> c0145b) {
        boolean z10;
        int h10;
        int f10;
        qc.q.i(t0Var, "loadType");
        qc.q.i(c0145b, "page");
        int i11 = b.f5742a[t0Var.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if ((!this.f5729c.isEmpty()) != false) {
                        if (i10 != this.f5734h) {
                            return false;
                        }
                        this.f5728b.add(c0145b);
                        if (c0145b.f() == Integer.MIN_VALUE) {
                            f10 = vc.l.d(n() - c0145b.e().size(), 0);
                        } else {
                            f10 = c0145b.f();
                        }
                        s(f10);
                        this.f5737k.remove(t0.APPEND);
                    } else {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                }
            } else if ((!this.f5729c.isEmpty()) != false) {
                if (i10 != this.f5733g) {
                    return false;
                }
                this.f5728b.add(0, c0145b);
                this.f5730d++;
                if (c0145b.h() == Integer.MIN_VALUE) {
                    h10 = vc.l.d(o() - c0145b.e().size(), 0);
                } else {
                    h10 = c0145b.h();
                }
                t(h10);
                this.f5737k.remove(t0.PREPEND);
            } else {
                throw new IllegalStateException("should've received an init before prepend".toString());
            }
        } else if (this.f5729c.isEmpty()) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f5728b.add(c0145b);
                this.f5730d = 0;
                s(c0145b.f());
                t(c0145b.h());
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final void s(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f5732f = i10;
    }

    public final void t(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f5731e = i10;
    }

    public final d1<Value> u(u1.b.C0145b<Key, Value> c0145b, t0 t0Var) {
        List d10;
        qc.q.i(c0145b, "<this>");
        qc.q.i(t0Var, "loadType");
        int[] iArr = b.f5742a;
        int i10 = iArr[t0Var.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    i11 = (this.f5729c.size() - this.f5730d) - 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0 - this.f5730d;
            }
        }
        d10 = ec.s.d(new l2(i11, c0145b.e()));
        int i12 = iArr[t0Var.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return d1.b.f5458g.a(d10, n(), this.f5738l.d(), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return d1.b.f5458g.b(d10, o(), this.f5738l.d(), null);
        }
        return d1.b.f5458g.c(d10, o(), n(), this.f5738l.d(), null);
    }

    private h1(r1 r1Var) {
        this.f5727a = r1Var;
        ArrayList arrayList = new ArrayList();
        this.f5728b = arrayList;
        this.f5729c = arrayList;
        this.f5735i = cd.g.b(-1, null, null, 6, null);
        this.f5736j = cd.g.b(-1, null, null, 6, null);
        this.f5737k = new LinkedHashMap();
        y0 y0Var = new y0();
        y0Var.c(t0.REFRESH, q0.b.f6000b);
        this.f5738l = y0Var;
    }
}
