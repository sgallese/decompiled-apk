package cd;

import ad.b3;
import cd.h;
import dc.w;
import fd.y;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.UndeliveredElementException;
import qc.g0;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes4.dex */
public class m<E> extends b<E> {
    private final a A;

    /* renamed from: z  reason: collision with root package name */
    private final int f9013z;

    public m(int i10, a aVar, pc.l<? super E, w> lVar) {
        super(i10, lVar);
        boolean z10;
        this.f9013z = i10;
        this.A = aVar;
        if (aVar != a.SUSPEND) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + g0.b(b.class).a() + " instead").toString());
    }

    static /* synthetic */ <E> Object U0(m<E> mVar, E e10, Continuation<? super w> continuation) {
        UndeliveredElementException d10;
        Object X0 = mVar.X0(e10, true);
        if (X0 instanceof h.a) {
            h.e(X0);
            pc.l<E, w> lVar = mVar.f8960m;
            if (lVar != null && (d10 = y.d(lVar, e10, null, 2, null)) != null) {
                dc.b.a(d10, mVar.U());
                throw d10;
            }
            throw mVar.U();
        }
        return w.f13270a;
    }

    private final Object V0(E e10, boolean z10) {
        pc.l<E, w> lVar;
        UndeliveredElementException d10;
        Object p10 = super.p(e10);
        if (!h.i(p10) && !h.h(p10)) {
            if (z10 && (lVar = this.f8960m) != null && (d10 = y.d(lVar, e10, null, 2, null)) != null) {
                throw d10;
            }
            return h.f9007b.c(w.f13270a);
        }
        return p10;
    }

    private final Object W0(E e10) {
        j jVar;
        b3 b3Var;
        fd.g0 g0Var = c.f8986d;
        j jVar2 = (j) b.f8954u.get(this);
        while (true) {
            long andIncrement = b.f8950q.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean e02 = e0(andIncrement);
            int i10 = c.f8984b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (jVar2.f15625p != j11) {
                j P = P(j11, jVar2);
                if (P == null) {
                    if (e02) {
                        return h.f9007b.a(U());
                    }
                } else {
                    jVar = P;
                }
            } else {
                jVar = jVar2;
            }
            int P0 = P0(jVar, i11, e10, j10, g0Var, e02);
            if (P0 != 0) {
                if (P0 != 1) {
                    if (P0 != 2) {
                        if (P0 != 3) {
                            if (P0 != 4) {
                                if (P0 == 5) {
                                    jVar.b();
                                }
                                jVar2 = jVar;
                            } else {
                                if (j10 < T()) {
                                    jVar.b();
                                }
                                return h.f9007b.a(U());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (e02) {
                        jVar.p();
                        return h.f9007b.a(U());
                    } else {
                        if (g0Var instanceof b3) {
                            b3Var = (b3) g0Var;
                        } else {
                            b3Var = null;
                        }
                        if (b3Var != null) {
                            v0(b3Var, jVar, i11);
                        }
                        L((jVar.f15625p * i10) + i11);
                        return h.f9007b.c(w.f13270a);
                    }
                } else {
                    return h.f9007b.c(w.f13270a);
                }
            } else {
                jVar.b();
                return h.f9007b.c(w.f13270a);
            }
        }
    }

    private final Object X0(E e10, boolean z10) {
        if (this.A == a.DROP_LATEST) {
            return V0(e10, z10);
        }
        return W0(e10);
    }

    @Override // cd.b
    protected boolean f0() {
        if (this.A == a.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    @Override // cd.b, cd.s
    public Object p(E e10) {
        return X0(e10, false);
    }

    @Override // cd.b, cd.s
    public Object r(E e10, Continuation<? super w> continuation) {
        return U0(this, e10, continuation);
    }
}
