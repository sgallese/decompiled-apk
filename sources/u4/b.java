package u4;

import ad.g0;
import ad.i;
import ad.k0;
import ad.s2;
import dc.n;
import dc.w;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import okio.k;
import okio.l0;
import okio.r0;
import okio.y0;
import pc.p;
import qc.h;
import qc.q;
import qc.r;
import yc.j;
import yc.v;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes.dex */
public final class b implements Closeable, Flushable {
    public static final a F = new a(null);
    private static final j G = new j("[a-z0-9_-]{1,120}");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final e E;

    /* renamed from: f  reason: collision with root package name */
    private final r0 f24110f;

    /* renamed from: m  reason: collision with root package name */
    private final long f24111m;

    /* renamed from: p  reason: collision with root package name */
    private final int f24112p;

    /* renamed from: q  reason: collision with root package name */
    private final int f24113q;

    /* renamed from: r  reason: collision with root package name */
    private final r0 f24114r;

    /* renamed from: s  reason: collision with root package name */
    private final r0 f24115s;

    /* renamed from: t  reason: collision with root package name */
    private final r0 f24116t;

    /* renamed from: u  reason: collision with root package name */
    private final LinkedHashMap<String, c> f24117u;

    /* renamed from: v  reason: collision with root package name */
    private final k0 f24118v;

    /* renamed from: w  reason: collision with root package name */
    private long f24119w;

    /* renamed from: x  reason: collision with root package name */
    private int f24120x;

    /* renamed from: y  reason: collision with root package name */
    private okio.d f24121y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f24122z;

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: u4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0566b {

        /* renamed from: a  reason: collision with root package name */
        private final c f24123a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24124b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean[] f24125c;

        public C0566b(c cVar) {
            this.f24123a = cVar;
            this.f24125c = new boolean[b.this.f24113q];
        }

        private final void d(boolean z10) {
            b bVar = b.this;
            synchronized (bVar) {
                if ((!this.f24124b) != false) {
                    if (q.d(this.f24123a.b(), this)) {
                        bVar.T(this, z10);
                    }
                    this.f24124b = true;
                    w wVar = w.f13270a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d c02;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                c02 = bVar.c0(this.f24123a.d());
            }
            return c02;
        }

        public final void e() {
            if (q.d(this.f24123a.b(), this)) {
                this.f24123a.m(true);
            }
        }

        public final r0 f(int i10) {
            r0 r0Var;
            b bVar = b.this;
            synchronized (bVar) {
                if ((!this.f24124b) != false) {
                    this.f24125c[i10] = true;
                    r0 r0Var2 = this.f24123a.c().get(i10);
                    g5.e.a(bVar.E, r0Var2);
                    r0Var = r0Var2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return r0Var;
        }

        public final c g() {
            return this.f24123a;
        }

        public final boolean[] h() {
            return this.f24125c;
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f24127a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f24128b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<r0> f24129c;

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<r0> f24130d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f24131e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f24132f;

        /* renamed from: g  reason: collision with root package name */
        private C0566b f24133g;

        /* renamed from: h  reason: collision with root package name */
        private int f24134h;

        public c(String str) {
            this.f24127a = str;
            this.f24128b = new long[b.this.f24113q];
            this.f24129c = new ArrayList<>(b.this.f24113q);
            this.f24130d = new ArrayList<>(b.this.f24113q);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i10 = b.this.f24113q;
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.f24129c.add(b.this.f24110f.n(sb2.toString()));
                sb2.append(".tmp");
                this.f24130d.add(b.this.f24110f.n(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<r0> a() {
            return this.f24129c;
        }

        public final C0566b b() {
            return this.f24133g;
        }

        public final ArrayList<r0> c() {
            return this.f24130d;
        }

        public final String d() {
            return this.f24127a;
        }

        public final long[] e() {
            return this.f24128b;
        }

        public final int f() {
            return this.f24134h;
        }

        public final boolean g() {
            return this.f24131e;
        }

        public final boolean h() {
            return this.f24132f;
        }

        public final void i(C0566b c0566b) {
            this.f24133g = c0566b;
        }

        public final void j(List<String> list) {
            if (list.size() == b.this.f24113q) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f24128b[i10] = Long.parseLong(list.get(i10));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + list);
                }
            }
            throw new IOException("unexpected journal line: " + list);
        }

        public final void k(int i10) {
            this.f24134h = i10;
        }

        public final void l(boolean z10) {
            this.f24131e = z10;
        }

        public final void m(boolean z10) {
            this.f24132f = z10;
        }

        public final d n() {
            if (!this.f24131e || this.f24133g != null || this.f24132f) {
                return null;
            }
            ArrayList<r0> arrayList = this.f24129c;
            b bVar = b.this;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!bVar.E.j(arrayList.get(i10))) {
                    try {
                        bVar.x0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f24134h++;
            return new d(this);
        }

        public final void o(okio.d dVar) {
            for (long j10 : this.f24128b) {
                dVar.D(32).P0(j10);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes.dex */
    public final class d implements Closeable {

        /* renamed from: f  reason: collision with root package name */
        private final c f24136f;

        /* renamed from: m  reason: collision with root package name */
        private boolean f24137m;

        public d(c cVar) {
            this.f24136f = cVar;
        }

        public final C0566b b() {
            C0566b Y;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                Y = bVar.Y(this.f24136f.d());
            }
            return Y;
        }

        public final r0 c(int i10) {
            if ((!this.f24137m) != false) {
                return this.f24136f.a().get(i10);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f24137m) {
                this.f24137m = true;
                b bVar = b.this;
                synchronized (bVar) {
                    this.f24136f.k(r1.f() - 1);
                    if (this.f24136f.f() == 0 && this.f24136f.h()) {
                        bVar.x0(this.f24136f);
                    }
                    w wVar = w.f13270a;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes.dex */
    public static final class e extends k {
        e(okio.j jVar) {
            super(jVar);
        }

        @Override // okio.k, okio.j
        public y0 p(r0 r0Var, boolean z10) {
            r0 l10 = r0Var.l();
            if (l10 != null) {
                d(l10);
            }
            return super.p(r0Var, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f24139f;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((f) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f24139f == 0) {
                n.b(obj);
                b bVar = b.this;
                synchronized (bVar) {
                    if (bVar.A && !bVar.B) {
                        try {
                            bVar.A0();
                        } catch (IOException unused) {
                            bVar.C = true;
                        }
                        try {
                            if (bVar.i0()) {
                                bVar.D0();
                            }
                        } catch (IOException unused2) {
                            bVar.D = true;
                            bVar.f24121y = l0.c(l0.b());
                        }
                        return w.f13270a;
                    }
                    return w.f13270a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes.dex */
    public static final class g extends r implements pc.l<IOException, w> {
        g() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(IOException iOException) {
            invoke2(iOException);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(IOException iOException) {
            b.this.f24122z = true;
        }
    }

    public b(okio.j jVar, r0 r0Var, g0 g0Var, long j10, int i10, int i11) {
        boolean z10;
        boolean z11;
        this.f24110f = r0Var;
        this.f24111m = j10;
        this.f24112p = i10;
        this.f24113q = i11;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f24114r = r0Var.n("journal");
                this.f24115s = r0Var.n("journal.tmp");
                this.f24116t = r0Var.n("journal.bkp");
                this.f24117u = new LinkedHashMap<>(0, 0.75f, true);
                this.f24118v = ad.l0.a(s2.b(null, 1, null).plus(g0Var.F0(1)));
                this.E = new e(jVar);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        while (this.f24119w > this.f24111m) {
            if (!z0()) {
                return;
            }
        }
        this.C = false;
    }

    private final void C0(String str) {
        if (G.f(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D0() {
        w wVar;
        okio.d dVar = this.f24121y;
        if (dVar != null) {
            dVar.close();
        }
        okio.d c10 = l0.c(this.E.p(this.f24115s, false));
        Throwable th = null;
        try {
            c10.W("libcore.io.DiskLruCache").D(10);
            c10.W("1").D(10);
            c10.P0(this.f24112p).D(10);
            c10.P0(this.f24113q).D(10);
            c10.D(10);
            for (c cVar : this.f24117u.values()) {
                if (cVar.b() != null) {
                    c10.W("DIRTY");
                    c10.D(32);
                    c10.W(cVar.d());
                    c10.D(10);
                } else {
                    c10.W("CLEAN");
                    c10.D(32);
                    c10.W(cVar.d());
                    cVar.o(c10);
                    c10.D(10);
                }
            }
            wVar = w.f13270a;
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th4) {
                    dc.b.a(th3, th4);
                }
            }
            wVar = null;
            th = th3;
        }
        if (th == null) {
            q.f(wVar);
            if (this.E.j(this.f24114r)) {
                this.E.c(this.f24114r, this.f24116t);
                this.E.c(this.f24115s, this.f24114r);
                this.E.h(this.f24116t);
            } else {
                this.E.c(this.f24115s, this.f24114r);
            }
            this.f24121y = l0();
            this.f24120x = 0;
            this.f24122z = false;
            this.D = false;
        } else {
            throw th;
        }
    }

    private final void R() {
        if ((!this.B) != false) {
            return;
        }
        throw new IllegalStateException("cache is closed".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void T(C0566b c0566b, boolean z10) {
        long j10;
        c g10 = c0566b.g();
        if (q.d(g10.b(), c0566b)) {
            int i10 = 0;
            if (z10 && !g10.h()) {
                int i11 = this.f24113q;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (c0566b.h()[i12] && !this.E.j(g10.c().get(i12))) {
                        c0566b.a();
                        return;
                    }
                }
                int i13 = this.f24113q;
                while (i10 < i13) {
                    r0 r0Var = g10.c().get(i10);
                    r0 r0Var2 = g10.a().get(i10);
                    if (this.E.j(r0Var)) {
                        this.E.c(r0Var, r0Var2);
                    } else {
                        g5.e.a(this.E, g10.a().get(i10));
                    }
                    long j11 = g10.e()[i10];
                    Long d10 = this.E.l(r0Var2).d();
                    if (d10 != null) {
                        j10 = d10.longValue();
                    } else {
                        j10 = 0;
                    }
                    g10.e()[i10] = j10;
                    this.f24119w = (this.f24119w - j11) + j10;
                    i10++;
                }
            } else {
                int i14 = this.f24113q;
                while (i10 < i14) {
                    this.E.h(g10.c().get(i10));
                    i10++;
                }
            }
            g10.i(null);
            if (g10.h()) {
                x0(g10);
                return;
            }
            this.f24120x++;
            okio.d dVar = this.f24121y;
            q.f(dVar);
            if (!z10 && !g10.g()) {
                this.f24117u.remove(g10.d());
                dVar.W("REMOVE");
                dVar.D(32);
                dVar.W(g10.d());
                dVar.D(10);
                dVar.flush();
                if (this.f24119w <= this.f24111m || i0()) {
                    k0();
                }
                return;
            }
            g10.l(true);
            dVar.W("CLEAN");
            dVar.D(32);
            dVar.W(g10.d());
            g10.o(dVar);
            dVar.D(10);
            dVar.flush();
            if (this.f24119w <= this.f24111m) {
            }
            k0();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void V() {
        close();
        g5.e.b(this.E, this.f24110f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i0() {
        if (this.f24120x >= 2000) {
            return true;
        }
        return false;
    }

    private final void k0() {
        i.d(this.f24118v, null, null, new f(null), 3, null);
    }

    private final okio.d l0() {
        return l0.c(new u4.c(this.E.a(this.f24114r), new g()));
    }

    private final void p0() {
        Iterator<c> it = this.f24117u.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i10 = 0;
            if (next.b() == null) {
                int i11 = this.f24113q;
                while (i10 < i11) {
                    j10 += next.e()[i10];
                    i10++;
                }
            } else {
                next.i(null);
                int i12 = this.f24113q;
                while (i10 < i12) {
                    this.E.h(next.a().get(i10));
                    this.E.h(next.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f24119w = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q0() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            u4.b$e r1 = r12.E
            okio.r0 r2 = r12.f24114r
            okio.Source r1 = r1.q(r2)
            okio.e r1 = okio.l0.d(r1)
            r2 = 0
            java.lang.String r3 = r1.t0()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = r1.t0()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = r1.t0()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = r1.t0()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = r1.t0()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = qc.q.d(r8, r3)     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L84
            java.lang.String r8 = "1"
            boolean r8 = qc.q.d(r8, r4)     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L84
            int r8 = r12.f24112p     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lb8
            boolean r8 = qc.q.d(r8, r5)     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L84
            int r8 = r12.f24113q     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lb8
            boolean r8 = qc.q.d(r8, r6)     // Catch: java.lang.Throwable -> Lb8
            if (r8 == 0) goto L84
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Lb8
            r9 = 0
            if (r8 <= 0) goto L54
            r8 = 1
            goto L55
        L54:
            r8 = 0
        L55:
            if (r8 != 0) goto L84
        L57:
            java.lang.String r0 = r1.t0()     // Catch: java.io.EOFException -> L61 java.lang.Throwable -> Lb8
            r12.s0(r0)     // Catch: java.io.EOFException -> L61 java.lang.Throwable -> Lb8
            int r9 = r9 + 1
            goto L57
        L61:
            java.util.LinkedHashMap<java.lang.String, u4.b$c> r0 = r12.f24117u     // Catch: java.lang.Throwable -> Lb8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb8
            int r9 = r9 - r0
            r12.f24120x = r9     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r1.C()     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L74
            r12.D0()     // Catch: java.lang.Throwable -> Lb8
            goto L7a
        L74:
            okio.d r0 = r12.l0()     // Catch: java.lang.Throwable -> Lb8
            r12.f24121y = r0     // Catch: java.lang.Throwable -> Lb8
        L7a:
            dc.w r0 = dc.w.f13270a     // Catch: java.lang.Throwable -> Lb8
            if (r1 == 0) goto Lc6
            r1.close()     // Catch: java.lang.Throwable -> L82
            goto Lc6
        L82:
            r2 = move-exception
            goto Lc6
        L84:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r9.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r3)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r4)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r5)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb8
            r0 = 93
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> Lb8
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb8
            throw r8     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r0 = move-exception
            if (r1 == 0) goto Lc3
            r1.close()     // Catch: java.lang.Throwable -> Lbf
            goto Lc3
        Lbf:
            r1 = move-exception
            dc.a.a(r0, r1)
        Lc3:
            r11 = r2
            r2 = r0
            r0 = r11
        Lc6:
            if (r2 != 0) goto Lcc
            qc.q.f(r0)
            return
        Lcc:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.q0():void");
    }

    private final void s0(String str) {
        int W;
        int W2;
        String substring;
        boolean F2;
        boolean F3;
        boolean F4;
        List<String> w02;
        boolean F5;
        W = yc.w.W(str, ' ', 0, false, 6, null);
        if (W != -1) {
            int i10 = W + 1;
            W2 = yc.w.W(str, ' ', i10, false, 4, null);
            if (W2 == -1) {
                substring = str.substring(i10);
                q.h(substring, "this as java.lang.String).substring(startIndex)");
                if (W == 6) {
                    F5 = v.F(str, "REMOVE", false, 2, null);
                    if (F5) {
                        this.f24117u.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i10, W2);
                q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedHashMap<String, c> linkedHashMap = this.f24117u;
            c cVar = linkedHashMap.get(substring);
            if (cVar == null) {
                cVar = new c(substring);
                linkedHashMap.put(substring, cVar);
            }
            c cVar2 = cVar;
            if (W2 != -1 && W == 5) {
                F4 = v.F(str, "CLEAN", false, 2, null);
                if (F4) {
                    String substring2 = str.substring(W2 + 1);
                    q.h(substring2, "this as java.lang.String).substring(startIndex)");
                    w02 = yc.w.w0(substring2, new char[]{' '}, false, 0, 6, null);
                    cVar2.l(true);
                    cVar2.i(null);
                    cVar2.j(w02);
                    return;
                }
            }
            if (W2 == -1 && W == 5) {
                F3 = v.F(str, "DIRTY", false, 2, null);
                if (F3) {
                    cVar2.i(new C0566b(cVar2));
                    return;
                }
            }
            if (W2 == -1 && W == 4) {
                F2 = v.F(str, "READ", false, 2, null);
                if (F2) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0(c cVar) {
        okio.d dVar;
        if (cVar.f() > 0 && (dVar = this.f24121y) != null) {
            dVar.W("DIRTY");
            dVar.D(32);
            dVar.W(cVar.d());
            dVar.D(10);
            dVar.flush();
        }
        if (cVar.f() <= 0 && cVar.b() == null) {
            int i10 = this.f24113q;
            for (int i11 = 0; i11 < i10; i11++) {
                this.E.h(cVar.a().get(i11));
                this.f24119w -= cVar.e()[i11];
                cVar.e()[i11] = 0;
            }
            this.f24120x++;
            okio.d dVar2 = this.f24121y;
            if (dVar2 != null) {
                dVar2.W("REMOVE");
                dVar2.D(32);
                dVar2.W(cVar.d());
                dVar2.D(10);
            }
            this.f24117u.remove(cVar.d());
            if (i0()) {
                k0();
            }
            return true;
        }
        cVar.m(true);
        return true;
    }

    private final boolean z0() {
        for (c cVar : this.f24117u.values()) {
            if (!cVar.h()) {
                x0(cVar);
                return true;
            }
        }
        return false;
    }

    public final synchronized C0566b Y(String str) {
        C0566b c0566b;
        R();
        C0(str);
        f0();
        c cVar = this.f24117u.get(str);
        if (cVar != null) {
            c0566b = cVar.b();
        } else {
            c0566b = null;
        }
        if (c0566b != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.C && !this.D) {
            okio.d dVar = this.f24121y;
            q.f(dVar);
            dVar.W("DIRTY");
            dVar.D(32);
            dVar.W(str);
            dVar.D(10);
            dVar.flush();
            if (this.f24122z) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f24117u.put(str, cVar);
            }
            C0566b c0566b2 = new C0566b(cVar);
            cVar.i(c0566b2);
            return c0566b2;
        }
        k0();
        return null;
    }

    public final synchronized d c0(String str) {
        d n10;
        R();
        C0(str);
        f0();
        c cVar = this.f24117u.get(str);
        if (cVar != null && (n10 = cVar.n()) != null) {
            this.f24120x++;
            okio.d dVar = this.f24121y;
            q.f(dVar);
            dVar.W("READ");
            dVar.D(32);
            dVar.W(str);
            dVar.D(10);
            if (i0()) {
                k0();
            }
            return n10;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A && !this.B) {
            for (c cVar : (c[]) this.f24117u.values().toArray(new c[0])) {
                C0566b b10 = cVar.b();
                if (b10 != null) {
                    b10.e();
                }
            }
            A0();
            ad.l0.d(this.f24118v, null, 1, null);
            okio.d dVar = this.f24121y;
            q.f(dVar);
            dVar.close();
            this.f24121y = null;
            this.B = true;
            return;
        }
        this.B = true;
    }

    public final synchronized void f0() {
        if (this.A) {
            return;
        }
        this.E.h(this.f24115s);
        if (this.E.j(this.f24116t)) {
            if (this.E.j(this.f24114r)) {
                this.E.h(this.f24116t);
            } else {
                this.E.c(this.f24116t, this.f24114r);
            }
        }
        if (this.E.j(this.f24114r)) {
            try {
                q0();
                p0();
                this.A = true;
                return;
            } catch (IOException unused) {
                try {
                    V();
                    this.B = false;
                } catch (Throwable th) {
                    this.B = false;
                    throw th;
                }
            }
        }
        D0();
        this.A = true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.A) {
            return;
        }
        R();
        A0();
        okio.d dVar = this.f24121y;
        q.f(dVar);
        dVar.flush();
    }
}
