package v1;

import a2.k;
import a2.l;
import java.util.List;
import v1.d;

/* compiled from: TextLayoutResult.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f24433a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f24434b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d.b<u>> f24435c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24436d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f24437e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24438f;

    /* renamed from: g  reason: collision with root package name */
    private final j2.e f24439g;

    /* renamed from: h  reason: collision with root package name */
    private final j2.r f24440h;

    /* renamed from: i  reason: collision with root package name */
    private final l.b f24441i;

    /* renamed from: j  reason: collision with root package name */
    private final long f24442j;

    /* renamed from: k  reason: collision with root package name */
    private k.a f24443k;

    public /* synthetic */ f0(d dVar, k0 k0Var, List list, int i10, boolean z10, int i11, j2.e eVar, j2.r rVar, l.b bVar, long j10, qc.h hVar) {
        this(dVar, k0Var, list, i10, z10, i11, eVar, rVar, bVar, j10);
    }

    public final long a() {
        return this.f24442j;
    }

    public final j2.e b() {
        return this.f24439g;
    }

    public final l.b c() {
        return this.f24441i;
    }

    public final j2.r d() {
        return this.f24440h;
    }

    public final int e() {
        return this.f24436d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (qc.q.d(this.f24433a, f0Var.f24433a) && qc.q.d(this.f24434b, f0Var.f24434b) && qc.q.d(this.f24435c, f0Var.f24435c) && this.f24436d == f0Var.f24436d && this.f24437e == f0Var.f24437e && g2.u.e(this.f24438f, f0Var.f24438f) && qc.q.d(this.f24439g, f0Var.f24439g) && this.f24440h == f0Var.f24440h && qc.q.d(this.f24441i, f0Var.f24441i) && j2.b.g(this.f24442j, f0Var.f24442j)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f24438f;
    }

    public final List<d.b<u>> g() {
        return this.f24435c;
    }

    public final boolean h() {
        return this.f24437e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f24433a.hashCode() * 31) + this.f24434b.hashCode()) * 31) + this.f24435c.hashCode()) * 31) + this.f24436d) * 31) + t.k.a(this.f24437e)) * 31) + g2.u.f(this.f24438f)) * 31) + this.f24439g.hashCode()) * 31) + this.f24440h.hashCode()) * 31) + this.f24441i.hashCode()) * 31) + j2.b.q(this.f24442j);
    }

    public final k0 i() {
        return this.f24434b;
    }

    public final d j() {
        return this.f24433a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f24433a) + ", style=" + this.f24434b + ", placeholders=" + this.f24435c + ", maxLines=" + this.f24436d + ", softWrap=" + this.f24437e + ", overflow=" + ((Object) g2.u.g(this.f24438f)) + ", density=" + this.f24439g + ", layoutDirection=" + this.f24440h + ", fontFamilyResolver=" + this.f24441i + ", constraints=" + ((Object) j2.b.s(this.f24442j)) + ')';
    }

    private f0(d dVar, k0 k0Var, List<d.b<u>> list, int i10, boolean z10, int i11, j2.e eVar, j2.r rVar, k.a aVar, l.b bVar, long j10) {
        this.f24433a = dVar;
        this.f24434b = k0Var;
        this.f24435c = list;
        this.f24436d = i10;
        this.f24437e = z10;
        this.f24438f = i11;
        this.f24439g = eVar;
        this.f24440h = rVar;
        this.f24441i = bVar;
        this.f24442j = j10;
        this.f24443k = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private f0(d dVar, k0 k0Var, List<d.b<u>> list, int i10, boolean z10, int i11, j2.e eVar, j2.r rVar, l.b bVar, long j10) {
        this(dVar, k0Var, list, i10, z10, i11, eVar, rVar, (k.a) null, bVar, j10);
        qc.q.i(dVar, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(bVar, "fontFamilyResolver");
    }
}
