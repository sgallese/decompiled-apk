package androidx.paging;

import androidx.paging.o2;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: HintHandler.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final b f6198a = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HintHandler.kt */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private o2 f6199a;

        /* renamed from: b  reason: collision with root package name */
        private final dd.w<o2> f6200b = dd.d0.b(1, 0, cd.a.DROP_OLDEST, 2, null);

        public a() {
        }

        public final dd.g<o2> a() {
            return this.f6200b;
        }

        public final o2 b() {
            return this.f6199a;
        }

        public final void c(o2 o2Var) {
            this.f6199a = o2Var;
            if (o2Var != null) {
                this.f6200b.e(o2Var);
            }
        }
    }

    /* compiled from: HintHandler.kt */
    /* loaded from: classes.dex */
    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f6202a;

        /* renamed from: b  reason: collision with root package name */
        private final a f6203b;

        /* renamed from: c  reason: collision with root package name */
        private o2.a f6204c;

        /* renamed from: d  reason: collision with root package name */
        private final ReentrantLock f6205d = new ReentrantLock();

        public b() {
            this.f6202a = new a();
            this.f6203b = new a();
        }

        public final dd.g<o2> a() {
            return this.f6203b.a();
        }

        public final o2.a b() {
            return this.f6204c;
        }

        public final dd.g<o2> c() {
            return this.f6202a.a();
        }

        public final void d(o2.a aVar, pc.p<? super a, ? super a, dc.w> pVar) {
            qc.q.i(pVar, "block");
            ReentrantLock reentrantLock = this.f6205d;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    this.f6204c = aVar;
                } finally {
                    reentrantLock.unlock();
                }
            }
            pVar.invoke(this.f6202a, this.f6203b);
            dc.w wVar = dc.w.f13270a;
        }
    }

    /* compiled from: HintHandler.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6207a;

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
            f6207a = iArr;
        }
    }

    /* compiled from: HintHandler.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<a, a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t0 f6208f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ o2 f6209m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t0 t0Var, o2 o2Var) {
            super(2);
            this.f6208f = t0Var;
            this.f6209m = o2Var;
        }

        public final void a(a aVar, a aVar2) {
            qc.q.i(aVar, "prependHint");
            qc.q.i(aVar2, "appendHint");
            if (this.f6208f == t0.PREPEND) {
                aVar.c(this.f6209m);
            } else {
                aVar2.c(this.f6209m);
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(a aVar, a aVar2) {
            a(aVar, aVar2);
            return dc.w.f13270a;
        }
    }

    /* compiled from: HintHandler.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<a, a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o2 f6210f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o2 o2Var) {
            super(2);
            this.f6210f = o2Var;
        }

        public final void a(a aVar, a aVar2) {
            qc.q.i(aVar, "prependHint");
            qc.q.i(aVar2, "appendHint");
            if (a0.a(this.f6210f, aVar.b(), t0.PREPEND)) {
                aVar.c(this.f6210f);
            }
            if (a0.a(this.f6210f, aVar2.b(), t0.APPEND)) {
                aVar2.c(this.f6210f);
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(a aVar, a aVar2) {
            a(aVar, aVar2);
            return dc.w.f13270a;
        }
    }

    public final void a(t0 t0Var, o2 o2Var) {
        boolean z10;
        qc.q.i(t0Var, "loadType");
        qc.q.i(o2Var, "viewportHint");
        if (t0Var != t0.PREPEND && t0Var != t0.APPEND) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f6198a.d(null, new d(t0Var, o2Var));
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + t0Var).toString());
    }

    public final o2.a b() {
        return this.f6198a.b();
    }

    public final dd.g<o2> c(t0 t0Var) {
        qc.q.i(t0Var, "loadType");
        int i10 = c.f6207a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f6198a.a();
            }
            throw new IllegalArgumentException("invalid load type for hints");
        }
        return this.f6198a.c();
    }

    public final void d(o2 o2Var) {
        o2.a aVar;
        qc.q.i(o2Var, "viewportHint");
        b bVar = this.f6198a;
        if (o2Var instanceof o2.a) {
            aVar = (o2.a) o2Var;
        } else {
            aVar = null;
        }
        bVar.d(aVar, new e(o2Var));
    }
}
