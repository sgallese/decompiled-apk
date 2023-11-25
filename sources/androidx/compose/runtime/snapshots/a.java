package androidx.compose.runtime.snapshots;

import dc.w;
import java.util.List;
import kotlin.KotlinNothingValueException;
import pc.l;
import qc.q;
import qc.r;
import t0.f;
import t0.g;
import t0.h;
import t0.j;
import t0.u;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class a extends t0.b {

    /* compiled from: Snapshot.kt */
    /* renamed from: androidx.compose.runtime.snapshots.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0031a extends r implements l<Object, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<l<Object, w>> f2311f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0031a(List<l<Object, w>> list) {
            super(1);
            this.f2311f = list;
        }

        public final void a(Object obj) {
            q.i(obj, "state");
            List<l<Object, w>> list = this.f2311f;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Object obj) {
            a(obj);
            return w.f13270a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements l<j, t0.b> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<Object, w> f2312f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l<Object, w> f2313m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<Object, w> lVar, l<Object, w> lVar2) {
            super(1);
            this.f2312f = lVar;
            this.f2313m = lVar2;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final t0.b invoke(j jVar) {
            int i10;
            q.i(jVar, "invalid");
            synchronized (t0.l.G()) {
                i10 = t0.l.f23337e;
                t0.l.f23337e = i10 + 1;
            }
            return new t0.b(i10, jVar, this.f2312f, this.f2313m);
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    static final class c extends r implements l<j, f> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<Object, w> f2314f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l<Object, w> lVar) {
            super(1);
            this.f2314f = lVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final f invoke(j jVar) {
            int i10;
            q.i(jVar, "invalid");
            synchronized (t0.l.G()) {
                i10 = t0.l.f23337e;
                t0.l.f23337e = i10 + 1;
            }
            return new f(i10, jVar, this.f2314f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r5, t0.j r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            qc.q.i(r6, r0)
            java.lang.Object r0 = t0.l.G()
            monitor-enter(r0)
            java.util.List r1 = t0.l.h()     // Catch: java.lang.Throwable -> L3b
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L24
            java.util.List r1 = t0.l.h()     // Catch: java.lang.Throwable -> L3b
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L3b
            java.util.List r1 = ec.r.F0(r1)     // Catch: java.lang.Throwable -> L3b
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto L35
            java.lang.Object r3 = ec.r.w0(r1)     // Catch: java.lang.Throwable -> L3b
            pc.l r3 = (pc.l) r3     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L36
            androidx.compose.runtime.snapshots.a$a r3 = new androidx.compose.runtime.snapshots.a$a     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            goto L36
        L35:
            r3 = r2
        L36:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L3b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.<init>(int, t0.j):void");
    }

    @Override // t0.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // t0.b
    public t0.b P(l<Object, w> lVar, l<Object, w> lVar2) {
        g Z;
        Z = t0.l.Z(new b(lVar, lVar2));
        return (t0.b) Z;
    }

    @Override // t0.b, t0.g
    /* renamed from: S  reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b, t0.g
    /* renamed from: T  reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        q.i(gVar, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // t0.b, t0.g
    public void d() {
        synchronized (t0.l.G()) {
            q();
            w wVar = w.f13270a;
        }
    }

    @Override // t0.b, t0.g
    public void o() {
        t0.l.z();
    }

    @Override // t0.b, t0.g
    public g x(l<Object, w> lVar) {
        g Z;
        Z = t0.l.Z(new c(lVar));
        return Z;
    }
}
