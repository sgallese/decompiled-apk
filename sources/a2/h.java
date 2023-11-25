package a2;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f282a = a.b(null);

    /* renamed from: b  reason: collision with root package name */
    private final z1.b<b, a> f283b = new z1.b<>(16);

    /* renamed from: c  reason: collision with root package name */
    private final z1.c<b, a> f284c = new z1.c<>(0, 1, null);

    /* renamed from: d  reason: collision with root package name */
    private final d2.s f285d = d2.r.a();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final k f287a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f288b;

        public b(k kVar, Object obj) {
            qc.q.i(kVar, "font");
            this.f287a = kVar;
            this.f288b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (qc.q.d(this.f287a, bVar.f287a) && qc.q.d(this.f288b, bVar.f288b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f287a.hashCode() * 31;
            Object obj = this.f288b;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Key(font=" + this.f287a + ", loaderKey=" + this.f288b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {394}, m = "runCached")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f289f;

        /* renamed from: m  reason: collision with root package name */
        Object f290m;

        /* renamed from: p  reason: collision with root package name */
        boolean f291p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f292q;

        /* renamed from: s  reason: collision with root package name */
        int f294s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f292q = obj;
            this.f294s |= RecyclerView.UNDEFINED_DURATION;
            return h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(h hVar, k kVar, h0 h0Var, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        hVar.e(kVar, h0Var, obj, z10);
    }

    public final a d(k kVar, h0 h0Var) {
        a d10;
        qc.q.i(kVar, "font");
        qc.q.i(h0Var, "platformFontLoader");
        b bVar = new b(kVar, h0Var.a());
        synchronized (this.f285d) {
            d10 = this.f283b.d(bVar);
            if (d10 == null) {
                d10 = this.f284c.b(bVar);
            }
        }
        return d10;
    }

    public final void e(k kVar, h0 h0Var, Object obj, boolean z10) {
        qc.q.i(kVar, "font");
        qc.q.i(h0Var, "platformFontLoader");
        b bVar = new b(kVar, h0Var.a());
        synchronized (this.f285d) {
            try {
                if (obj == null) {
                    this.f284c.h(bVar, a.a(this.f282a));
                } else if (z10) {
                    this.f284c.h(bVar, a.a(a.b(obj)));
                } else {
                    this.f283b.e(bVar, a.a(a.b(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(a2.k r6, a2.h0 r7, boolean r8, pc.l<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof a2.h.c
            if (r0 == 0) goto L13
            r0 = r10
            a2.h$c r0 = (a2.h.c) r0
            int r1 = r0.f294s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294s = r1
            goto L18
        L13:
            a2.h$c r0 = new a2.h$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f292q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f294s
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f291p
            java.lang.Object r6 = r0.f290m
            a2.h$b r6 = (a2.h.b) r6
            java.lang.Object r7 = r0.f289f
            a2.h r7 = (a2.h) r7
            dc.n.b(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            dc.n.b(r10)
            a2.h$b r10 = new a2.h$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            d2.s r6 = r5.f285d
            monitor-enter(r6)
            z1.b<a2.h$b, a2.h$a> r7 = r5.f283b     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> Lb0
            a2.h$a r7 = (a2.h.a) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            z1.c<a2.h$b, a2.h$a> r7 = r5.f284c     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> Lb0
            a2.h$a r7 = (a2.h.a) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            dc.w r7 = dc.w.f13270a     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.f289f = r5
            r0.f290m = r10
            r0.f291p = r8
            r0.f294s = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            d2.s r9 = r7.f285d
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            z1.c<a2.h$b, a2.h$a> r8 = r7.f284c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.f282a     // Catch: java.lang.Throwable -> L8b
            a2.h$a r7 = a2.h.a.a(r7)     // Catch: java.lang.Throwable -> L8b
            r8.h(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            z1.c<a2.h$b, a2.h$a> r7 = r7.f284c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = a2.h.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            a2.h$a r8 = a2.h.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.h(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            z1.b<a2.h$b, a2.h$a> r7 = r7.f283b     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = a2.h.a.b(r10)     // Catch: java.lang.Throwable -> L8b
            a2.h$a r8 = a2.h.a.a(r8)     // Catch: java.lang.Throwable -> L8b
            r7.e(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            dc.w r6 = dc.w.f13270a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h.g(a2.k, a2.h0, boolean, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f286a;

        private /* synthetic */ a(Object obj) {
            this.f286a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            if (!(obj2 instanceof a) || !qc.q.d(obj, ((a) obj2).g())) {
                return false;
            }
            return true;
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            if (obj == null) {
                return true;
            }
            return false;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f286a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.f286a;
        }

        public int hashCode() {
            return d(this.f286a);
        }

        public String toString() {
            return f(this.f286a);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
