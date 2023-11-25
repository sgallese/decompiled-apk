package p2;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: h  reason: collision with root package name */
    public static int f21032h;

    /* renamed from: c  reason: collision with root package name */
    m f21035c;

    /* renamed from: d  reason: collision with root package name */
    m f21036d;

    /* renamed from: f  reason: collision with root package name */
    int f21038f;

    /* renamed from: g  reason: collision with root package name */
    int f21039g;

    /* renamed from: a  reason: collision with root package name */
    public int f21033a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21034b = false;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<m> f21037e = new ArrayList<>();

    public k(m mVar, int i10) {
        this.f21035c = null;
        this.f21036d = null;
        int i11 = f21032h;
        this.f21038f = i11;
        f21032h = i11 + 1;
        this.f21035c = mVar;
        this.f21036d = mVar;
        this.f21039g = i10;
    }

    private long c(f fVar, long j10) {
        m mVar = fVar.f21020d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f21027k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f21027k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21020d != mVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f21022f + j10));
                }
            }
        }
        if (fVar == mVar.f21051i) {
            long j12 = j10 - mVar.j();
            return Math.min(Math.min(j11, c(mVar.f21050h, j12)), j12 - mVar.f21050h.f21022f);
        }
        return j11;
    }

    private long d(f fVar, long j10) {
        m mVar = fVar.f21020d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f21027k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f21027k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f21020d != mVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f21022f + j10));
                }
            }
        }
        if (fVar == mVar.f21050h) {
            long j12 = j10 + mVar.j();
            return Math.max(Math.max(j11, d(mVar.f21051i, j12)), j12 - mVar.f21051i.f21022f);
        }
        return j11;
    }

    public void a(m mVar) {
        this.f21037e.add(mVar);
        this.f21036d = mVar;
    }

    public long b(o2.f fVar, int i10) {
        m mVar;
        m mVar2;
        long j10;
        int i11;
        m mVar3 = this.f21035c;
        long j11 = 0;
        if (mVar3 instanceof c) {
            if (((c) mVar3).f21048f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(mVar3 instanceof j)) {
                return 0L;
            }
        } else if (!(mVar3 instanceof l)) {
            return 0L;
        }
        if (i10 == 0) {
            mVar = fVar.f20387e;
        } else {
            mVar = fVar.f20389f;
        }
        f fVar2 = mVar.f21050h;
        if (i10 == 0) {
            mVar2 = fVar.f20387e;
        } else {
            mVar2 = fVar.f20389f;
        }
        f fVar3 = mVar2.f21051i;
        boolean contains = mVar3.f21050h.f21028l.contains(fVar2);
        boolean contains2 = this.f21035c.f21051i.f21028l.contains(fVar3);
        long j12 = this.f21035c.j();
        if (contains && contains2) {
            long d10 = d(this.f21035c.f21050h, 0L);
            long c10 = c(this.f21035c.f21051i, 0L);
            long j13 = d10 - j12;
            m mVar4 = this.f21035c;
            int i12 = mVar4.f21051i.f21022f;
            if (j13 >= (-i12)) {
                j13 += i12;
            }
            int i13 = mVar4.f21050h.f21022f;
            long j14 = ((-c10) - j12) - i13;
            if (j14 >= i13) {
                j14 -= i13;
            }
            float o10 = mVar4.f21044b.o(i10);
            if (o10 > 0.0f) {
                j11 = (((float) j14) / o10) + (((float) j13) / (1.0f - o10));
            }
            float f10 = (float) j11;
            long j15 = (f10 * o10) + 0.5f + j12 + (f10 * (1.0f - o10)) + 0.5f;
            j10 = r13.f21050h.f21022f + j15;
            i11 = this.f21035c.f21051i.f21022f;
        } else if (contains) {
            return Math.max(d(this.f21035c.f21050h, r13.f21022f), this.f21035c.f21050h.f21022f + j12);
        } else if (contains2) {
            return Math.max(-c(this.f21035c.f21051i, r13.f21022f), (-this.f21035c.f21051i.f21022f) + j12);
        } else {
            j10 = r13.f21050h.f21022f + this.f21035c.j();
            i11 = this.f21035c.f21051i.f21022f;
        }
        return j10 - i11;
    }
}
