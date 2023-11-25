package id;

import ad.b3;
import ad.c1;
import ad.m;
import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import ec.b0;
import ec.s;
import fd.d0;
import fd.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import pc.p;
import pc.q;

/* compiled from: Select.kt */
/* loaded from: classes4.dex */
public class i<R> extends ad.k implements c<R>, j, b3 {

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17150s = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "state");

    /* renamed from: f  reason: collision with root package name */
    private final hc.f f17151f;

    /* renamed from: m  reason: collision with root package name */
    private List<i<R>.a> f17152m;

    /* renamed from: p  reason: collision with root package name */
    private Object f17153p;

    /* renamed from: q  reason: collision with root package name */
    private int f17154q;

    /* renamed from: r  reason: collision with root package name */
    private Object f17155r;
    private volatile Object state;

    /* compiled from: Select.kt */
    /* loaded from: classes4.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f17156a;

        /* renamed from: b  reason: collision with root package name */
        private final q<Object, j<?>, Object, w> f17157b;

        /* renamed from: c  reason: collision with root package name */
        private final q<Object, Object, Object, Object> f17158c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f17159d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f17160e;

        /* renamed from: f  reason: collision with root package name */
        public final q<j<?>, Object, Object, pc.l<Throwable, w>> f17161f;

        /* renamed from: g  reason: collision with root package name */
        public Object f17162g;

        /* renamed from: h  reason: collision with root package name */
        public int f17163h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super j<?>, Object, Object, ? extends pc.l<? super Throwable, w>> qVar3) {
            this.f17156a = obj;
            this.f17157b = qVar;
            this.f17158c = qVar2;
            this.f17159d = obj2;
            this.f17160e = obj3;
            this.f17161f = qVar3;
        }

        public final pc.l<Throwable, w> a(j<?> jVar, Object obj) {
            q<j<?>, Object, Object, pc.l<Throwable, w>> qVar = this.f17161f;
            if (qVar != null) {
                return qVar.invoke(jVar, this.f17159d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f17162g;
            i<R> iVar = i.this;
            c1 c1Var = null;
            if (obj instanceof d0) {
                ((d0) obj).o(this.f17163h, null, iVar.getContext());
                return;
            }
            if (obj instanceof c1) {
                c1Var = (c1) obj;
            }
            if (c1Var != null) {
                c1Var.dispose();
            }
        }

        public final Object c(Object obj, Continuation<? super R> continuation) {
            Object obj2 = this.f17160e;
            if (this.f17159d == k.i()) {
                qc.q.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((pc.l) obj2).invoke(continuation);
            }
            qc.q.g(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, continuation);
        }

        public final Object d(Object obj) {
            return this.f17158c.invoke(this.f17156a, this.f17159d, obj);
        }

        public final boolean e(i<R> iVar) {
            g0 g0Var;
            this.f17157b.invoke(this.f17156a, iVar, this.f17159d);
            Object obj = ((i) iVar).f17155r;
            g0Var = k.f17173e;
            if (obj == g0Var) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Select.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {431, 434}, m = "doSelectSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f17165f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f17166m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ i<R> f17167p;

        /* renamed from: q  reason: collision with root package name */
        int f17168q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i<R> iVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f17167p = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17166m = obj;
            this.f17168q |= RecyclerView.UNDEFINED_DURATION;
            return this.f17167p.q(this);
        }
    }

    public i(hc.f fVar) {
        g0 g0Var;
        g0 g0Var2;
        this.f17151f = fVar;
        g0Var = k.f17170b;
        this.state = g0Var;
        this.f17152m = new ArrayList(2);
        this.f17154q = -1;
        g0Var2 = k.f17173e;
        this.f17155r = g0Var2;
    }

    private final void l(Object obj) {
        boolean z10;
        List<i<R>.a> list = this.f17152m;
        qc.q.f(list);
        List<i<R>.a> list2 = list;
        boolean z11 = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((a) it.next()).f17156a == obj) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    private final void m(i<R>.a aVar) {
        g0 g0Var;
        g0 g0Var2;
        List<i<R>.a> list = this.f17152m;
        if (list == null) {
            return;
        }
        for (i<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17150s;
        g0Var = k.f17171c;
        atomicReferenceFieldUpdater.set(this, g0Var);
        g0Var2 = k.f17173e;
        this.f17155r = g0Var2;
        this.f17152m = null;
    }

    private final Object n(Continuation<? super R> continuation) {
        Object obj = f17150s.get(this);
        qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        i<R>.a aVar = (a) obj;
        Object obj2 = this.f17155r;
        m(aVar);
        return aVar.c(aVar.d(obj2), continuation);
    }

    static /* synthetic */ <R> Object p(i<R> iVar, Continuation<? super R> continuation) {
        if (iVar.s()) {
            return iVar.n(continuation);
        }
        return iVar.q(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r6
      0x0057: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:21:0x0054, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof id.i.b
            if (r0 == 0) goto L13
            r0 = r6
            id.i$b r0 = (id.i.b) r0
            int r1 = r0.f17168q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17168q = r1
            goto L18
        L13:
            id.i$b r0 = new id.i$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17166m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f17168q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f17165f
            id.i r2 = (id.i) r2
            dc.n.b(r6)
            goto L4b
        L3c:
            dc.n.b(r6)
            r0.f17165f = r5
            r0.f17168q = r4
            java.lang.Object r6 = r5.y(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f17165f = r6
            r0.f17168q = r3
            java.lang.Object r6 = r2.n(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id.i.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final i<R>.a r(Object obj) {
        boolean z10;
        List<i<R>.a> list = this.f17152m;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f17156a == obj) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                obj2 = next;
                break;
            }
        }
        i<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final boolean s() {
        return f17150s.get(this) instanceof a;
    }

    public static /* synthetic */ void u(i iVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            iVar.t(aVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Object obj) {
        i<R>.a r10 = r(obj);
        qc.q.f(r10);
        r10.f17162g = null;
        r10.f17163h = -1;
        t(r10, true);
    }

    private final int x(Object obj, Object obj2) {
        boolean j10;
        g0 g0Var;
        boolean z10;
        g0 g0Var2;
        g0 g0Var3;
        List d10;
        List s02;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17150s;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof m)) {
                g0Var = k.f17171c;
                if (qc.q.d(obj3, g0Var)) {
                    z10 = true;
                } else {
                    z10 = obj3 instanceof a;
                }
                if (!z10) {
                    g0Var2 = k.f17172d;
                    if (!qc.q.d(obj3, g0Var2)) {
                        g0Var3 = k.f17170b;
                        if (qc.q.d(obj3, g0Var3)) {
                            d10 = s.d(obj);
                            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, d10)) {
                                return 1;
                            }
                        } else if (obj3 instanceof List) {
                            s02 = b0.s0((Collection) obj3, obj);
                            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, s02)) {
                                return 1;
                            }
                        } else {
                            throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                        }
                    } else {
                        return 2;
                    }
                } else {
                    return 3;
                }
            } else {
                i<R>.a r10 = r(obj);
                if (r10 == null) {
                    continue;
                } else {
                    pc.l<Throwable, w> a10 = r10.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, r10)) {
                        this.f17155r = obj2;
                        j10 = k.j((m) obj3, a10);
                        if (j10) {
                            return 0;
                        }
                        this.f17155r = null;
                        return 2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r0 = r0.x();
        r1 = ic.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        kotlin.coroutines.jvm.internal.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r6 = ic.d.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r0 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return dc.w.f13270a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            r5 = this;
            ad.n r0 = new ad.n
            kotlin.coroutines.Continuation r1 = ic.b.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.A()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = j()
        L11:
            java.lang.Object r2 = r1.get(r5)
            fd.g0 r3 = id.k.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = j()
            boolean r2 = androidx.concurrent.futures.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            r0.n(r5)
            goto L65
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = j()
            fd.g0 r4 = id.k.g()
            boolean r3 = androidx.concurrent.futures.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            k(r5, r3)
            goto L44
        L52:
            boolean r1 = r2 instanceof id.i.a
            if (r1 == 0) goto L7c
            dc.w r1 = dc.w.f13270a
            id.i$a r2 = (id.i.a) r2
            java.lang.Object r3 = i(r5)
            pc.l r2 = r2.a(r5, r3)
            r0.d(r1, r2)
        L65:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = ic.b.d()
            if (r0 != r1) goto L72
            kotlin.coroutines.jvm.internal.h.c(r6)
        L72:
            java.lang.Object r6 = ic.b.d()
            if (r0 != r6) goto L79
            return r0
        L79:
            dc.w r6 = dc.w.f13270a
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id.i.y(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // id.c
    public <Q> void a(f<? extends Q> fVar, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        u(this, new a(fVar.b(), fVar.a(), fVar.d(), null, pVar, fVar.c()), false, 1, null);
    }

    @Override // ad.b3
    public void b(d0<?> d0Var, int i10) {
        this.f17153p = d0Var;
        this.f17154q = i10;
    }

    @Override // id.j
    public boolean c(Object obj, Object obj2) {
        if (x(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    @Override // id.j
    public void d(c1 c1Var) {
        this.f17153p = c1Var;
    }

    @Override // id.c
    public void e(d dVar, pc.l<? super Continuation<? super R>, ? extends Object> lVar) {
        u(this, new a(dVar.b(), dVar.a(), dVar.d(), k.i(), lVar, dVar.c()), false, 1, null);
    }

    @Override // id.j
    public void f(Object obj) {
        this.f17155r = obj;
    }

    @Override // ad.l
    public void g(Throwable th) {
        Object obj;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17150s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            g0Var = k.f17171c;
            if (obj != g0Var) {
                g0Var2 = k.f17172d;
            } else {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, g0Var2));
        List<i<R>.a> list = this.f17152m;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        g0Var3 = k.f17173e;
        this.f17155r = g0Var3;
        this.f17152m = null;
    }

    @Override // id.j
    public hc.f getContext() {
        return this.f17151f;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        g(th);
        return w.f13270a;
    }

    public Object o(Continuation<? super R> continuation) {
        return p(this, continuation);
    }

    public final void t(i<R>.a aVar, boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17150s;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            l(aVar.f17156a);
        }
        if (aVar.e(this)) {
            if (!z10) {
                List<i<R>.a> list = this.f17152m;
                qc.q.f(list);
                list.add(aVar);
            }
            aVar.f17162g = this.f17153p;
            aVar.f17163h = this.f17154q;
            this.f17153p = null;
            this.f17154q = -1;
            return;
        }
        atomicReferenceFieldUpdater.set(this, aVar);
    }

    public final l w(Object obj, Object obj2) {
        l a10;
        a10 = k.a(x(obj, obj2));
        return a10;
    }
}
