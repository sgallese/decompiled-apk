package o1;

import androidx.compose.ui.e;
import dc.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p1.i1;
import p1.j0;
import p1.z0;
import qc.q;
import qc.r;

/* compiled from: ModifierLocalManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final i1 f20337a;

    /* renamed from: b  reason: collision with root package name */
    private final k0.f<p1.c> f20338b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.f<c<?>> f20339c;

    /* renamed from: d  reason: collision with root package name */
    private final k0.f<j0> f20340d;

    /* renamed from: e  reason: collision with root package name */
    private final k0.f<c<?>> f20341e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20342f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModifierLocalManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.a<w> {
        a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f.this.e();
        }
    }

    public f(i1 i1Var) {
        q.i(i1Var, "owner");
        this.f20337a = i1Var;
        this.f20338b = new k0.f<>(new p1.c[16], 0);
        this.f20339c = new k0.f<>(new c[16], 0);
        this.f20340d = new k0.f<>(new j0[16], 0);
        this.f20341e = new k0.f<>(new c[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(e.c cVar, c<?> cVar2, Set<p1.c> set) {
        boolean z10;
        boolean z11;
        boolean z12;
        int a10 = z0.a(32);
        if (cVar.getNode().p1()) {
            k0.f fVar = new k0.f(new e.c[16], 0);
            e.c g12 = cVar.getNode().g1();
            if (g12 == null) {
                p1.k.c(fVar, cVar.getNode());
            } else {
                fVar.d(g12);
            }
            while (fVar.s()) {
                e.c cVar3 = (e.c) fVar.x(fVar.o() - 1);
                if ((cVar3.f1() & a10) != 0) {
                    for (e.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.g1()) {
                        if ((cVar4.k1() & a10) != 0) {
                            e.c cVar5 = cVar4;
                            k0.f fVar2 = null;
                            while (true) {
                                if (cVar5 != null) {
                                    if (cVar5 instanceof i) {
                                        i iVar = (i) cVar5;
                                        if (iVar instanceof p1.c) {
                                            p1.c cVar6 = (p1.c) iVar;
                                            if ((cVar6.J1() instanceof d) && cVar6.K1().contains(cVar2)) {
                                                set.add(iVar);
                                            }
                                        }
                                        if ((!iVar.l0().a(cVar2)) == false) {
                                            z10 = false;
                                            break;
                                        }
                                    } else {
                                        if ((cVar5.k1() & a10) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11 && (cVar5 instanceof p1.l)) {
                                            int i10 = 0;
                                            for (e.c J1 = ((p1.l) cVar5).J1(); J1 != null; J1 = J1.g1()) {
                                                if ((J1.k1() & a10) != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (z12) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        cVar5 = J1;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new k0.f(new e.c[16], 0);
                                                        }
                                                        if (cVar5 != null) {
                                                            fVar2.d(cVar5);
                                                            cVar5 = null;
                                                        }
                                                        fVar2.d(J1);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                    }
                                    cVar5 = p1.k.g(fVar2);
                                } else {
                                    z10 = true;
                                    break;
                                }
                            }
                            if (z10) {
                            }
                        }
                    }
                }
                p1.k.c(fVar, cVar3);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    public final void a(p1.c cVar, c<?> cVar2) {
        q.i(cVar, "node");
        q.i(cVar2, "key");
        this.f20338b.d(cVar);
        this.f20339c.d(cVar2);
        b();
    }

    public final void b() {
        if (!this.f20342f) {
            this.f20342f = true;
            this.f20337a.t(new a());
        }
    }

    public final void d(p1.c cVar, c<?> cVar2) {
        q.i(cVar, "node");
        q.i(cVar2, "key");
        this.f20340d.d(p1.k.k(cVar));
        this.f20341e.d(cVar2);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.f20342f = false;
        HashSet hashSet = new HashSet();
        k0.f<j0> fVar = this.f20340d;
        int o10 = fVar.o();
        if (o10 > 0) {
            j0[] n10 = fVar.n();
            int i11 = 0;
            do {
                j0 j0Var = n10[i11];
                c<?> cVar = this.f20341e.n()[i11];
                if (j0Var.i0().k().p1()) {
                    c(j0Var.i0().k(), cVar, hashSet);
                }
                i11++;
            } while (i11 < o10);
        }
        this.f20340d.i();
        this.f20341e.i();
        k0.f<p1.c> fVar2 = this.f20338b;
        int o11 = fVar2.o();
        if (o11 > 0) {
            p1.c[] n11 = fVar2.n();
            do {
                p1.c cVar2 = n11[i10];
                c<?> cVar3 = this.f20339c.n()[i10];
                if (cVar2.p1()) {
                    c(cVar2, cVar3, hashSet);
                }
                i10++;
            } while (i10 < o11);
        }
        this.f20338b.i();
        this.f20339c.i();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((p1.c) it.next()).Q1();
        }
    }

    public final void f(p1.c cVar, c<?> cVar2) {
        q.i(cVar, "node");
        q.i(cVar2, "key");
        this.f20338b.d(cVar);
        this.f20339c.d(cVar2);
        b();
    }
}
