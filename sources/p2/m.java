package p2;

import o2.d;
import o2.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f21043a;

    /* renamed from: b  reason: collision with root package name */
    o2.e f21044b;

    /* renamed from: c  reason: collision with root package name */
    k f21045c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f21046d;

    /* renamed from: e  reason: collision with root package name */
    g f21047e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f21048f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f21049g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f21050h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f21051i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f21052j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21053a;

        static {
            int[] iArr = new int[d.b.values().length];
            f21053a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21053a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21053a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21053a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21053a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(o2.e eVar) {
        this.f21044b = eVar;
    }

    private void l(int i10, int i11) {
        m mVar;
        float f10;
        int i12;
        int i13 = this.f21043a;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        o2.e eVar = this.f21044b;
                        m mVar2 = eVar.f20387e;
                        e.b bVar = mVar2.f21046d;
                        e.b bVar2 = e.b.MATCH_CONSTRAINT;
                        if (bVar == bVar2 && mVar2.f21043a == 3) {
                            l lVar = eVar.f20389f;
                            if (lVar.f21046d == bVar2 && lVar.f21043a == 3) {
                                return;
                            }
                        }
                        if (i10 == 0) {
                            mVar2 = eVar.f20389f;
                        }
                        if (mVar2.f21047e.f21026j) {
                            float t10 = eVar.t();
                            if (i10 == 1) {
                                i12 = (int) ((mVar2.f21047e.f21023g / t10) + 0.5f);
                            } else {
                                i12 = (int) ((t10 * mVar2.f21047e.f21023g) + 0.5f);
                            }
                            this.f21047e.d(i12);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o2.e G = this.f21044b.G();
                if (G != null) {
                    if (i10 == 0) {
                        mVar = G.f20387e;
                    } else {
                        mVar = G.f20389f;
                    }
                    if (mVar.f21047e.f21026j) {
                        o2.e eVar2 = this.f21044b;
                        if (i10 == 0) {
                            f10 = eVar2.f20411q;
                        } else {
                            f10 = eVar2.f20417t;
                        }
                        this.f21047e.d(g((int) ((r9.f21023g * f10) + 0.5f), i10));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f21047e.d(Math.min(g(this.f21047e.f21029m, i10), i11));
            return;
        }
        this.f21047e.d(g(i11, i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f21028l.add(fVar2);
        fVar.f21022f = i10;
        fVar2.f21027k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f21028l.add(fVar2);
        fVar.f21028l.add(this.f21047e);
        fVar.f21024h = i10;
        fVar.f21025i = gVar;
        fVar2.f21027k.add(fVar);
        gVar.f21027k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            o2.e eVar = this.f21044b;
            int i12 = eVar.f20409p;
            max = Math.max(eVar.f20407o, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            o2.e eVar2 = this.f21044b;
            int i13 = eVar2.f20415s;
            max = Math.max(eVar2.f20413r, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(o2.d dVar) {
        o2.d dVar2 = dVar.f20373d;
        if (dVar2 == null) {
            return null;
        }
        o2.e eVar = dVar2.f20371b;
        int i10 = a.f21053a[dVar2.f20372c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return eVar.f20389f.f21051i;
                    }
                    return eVar.f20389f.f21040k;
                }
                return eVar.f20389f.f21050h;
            }
            return eVar.f20387e.f21051i;
        }
        return eVar.f20387e.f21050h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(o2.d dVar, int i10) {
        m mVar;
        o2.d dVar2 = dVar.f20373d;
        if (dVar2 == null) {
            return null;
        }
        o2.e eVar = dVar2.f20371b;
        if (i10 == 0) {
            mVar = eVar.f20387e;
        } else {
            mVar = eVar.f20389f;
        }
        int i11 = a.f21053a[dVar2.f20372c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f21051i;
        }
        return mVar.f21050h;
    }

    public long j() {
        if (this.f21047e.f21026j) {
            return r0.f21023g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f21049g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, o2.d dVar2, o2.d dVar3, int i10) {
        float K;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f21026j && h11.f21026j) {
            int c10 = h10.f21023g + dVar2.c();
            int c11 = h11.f21023g - dVar3.c();
            int i11 = c11 - c10;
            if (!this.f21047e.f21026j && this.f21046d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f21047e;
            if (!gVar.f21026j) {
                return;
            }
            if (gVar.f21023g == i11) {
                this.f21050h.d(c10);
                this.f21051i.d(c11);
                return;
            }
            o2.e eVar = this.f21044b;
            if (i10 == 0) {
                K = eVar.w();
            } else {
                K = eVar.K();
            }
            if (h10 == h11) {
                c10 = h10.f21023g;
                c11 = h11.f21023g;
                K = 0.5f;
            }
            this.f21050h.d((int) (c10 + 0.5f + (((c11 - c10) - this.f21047e.f21023g) * K)));
            this.f21051i.d(this.f21050h.f21023g + this.f21047e.f21023g);
        }
    }

    @Override // p2.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
