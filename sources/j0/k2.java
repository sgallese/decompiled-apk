package j0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class k2 implements u0.a, Iterable<u0.b>, rc.a {

    /* renamed from: m  reason: collision with root package name */
    private int f18680m;

    /* renamed from: q  reason: collision with root package name */
    private int f18682q;

    /* renamed from: r  reason: collision with root package name */
    private int f18683r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f18684s;

    /* renamed from: t  reason: collision with root package name */
    private int f18685t;

    /* renamed from: f  reason: collision with root package name */
    private int[] f18679f = new int[0];

    /* renamed from: p  reason: collision with root package name */
    private Object[] f18681p = new Object[0];

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<d> f18686u = new ArrayList<>();

    public final d a(int i10) {
        if ((!this.f18684s) != false) {
            boolean z10 = false;
            if (i10 >= 0 && i10 < this.f18680m) {
                z10 = true;
            }
            if (z10) {
                ArrayList<d> arrayList = this.f18686u;
                int s10 = m2.s(arrayList, i10, this.f18680m);
                if (s10 < 0) {
                    d dVar = new d(i10);
                    arrayList.add(-(s10 + 1), dVar);
                    return dVar;
                }
                d dVar2 = arrayList.get(s10);
                qc.q.h(dVar2, "get(location)");
                return dVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        n.w("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    public final int e(d dVar) {
        qc.q.i(dVar, "anchor");
        if ((!this.f18684s) != false) {
            if (dVar.b()) {
                return dVar.a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        n.w("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final void f(j2 j2Var) {
        boolean z10;
        qc.q.i(j2Var, "reader");
        if (j2Var.w() == this && this.f18683r > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18683r--;
        } else {
            n.w("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void h(n2 n2Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList) {
        boolean z10;
        qc.q.i(n2Var, "writer");
        qc.q.i(iArr, "groups");
        qc.q.i(objArr, "slots");
        qc.q.i(arrayList, "anchors");
        if (n2Var.Y() == this && this.f18684s) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18684s = false;
            v(iArr, i10, objArr, i11, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final boolean i() {
        if (this.f18680m <= 0 || !m2.c(this.f18679f, 0)) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        if (this.f18680m == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<u0.b> iterator() {
        return new k0(this, 0, this.f18680m);
    }

    public final ArrayList<d> j() {
        return this.f18686u;
    }

    public final int[] k() {
        return this.f18679f;
    }

    public final int l() {
        return this.f18680m;
    }

    public final Object[] m() {
        return this.f18681p;
    }

    public final int n() {
        return this.f18682q;
    }

    public final int o() {
        return this.f18685t;
    }

    public final boolean p() {
        return this.f18684s;
    }

    public final boolean r(int i10, d dVar) {
        boolean z10;
        boolean z11;
        qc.q.i(dVar, "anchor");
        if ((!this.f18684s) != false) {
            if (i10 >= 0 && i10 < this.f18680m) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (u(dVar)) {
                    int g10 = m2.g(this.f18679f, i10) + i10;
                    int a10 = dVar.a();
                    if (i10 <= a10 && a10 < g10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return true;
                    }
                }
                return false;
            }
            n.w("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        n.w("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    public final j2 s() {
        if (!this.f18684s) {
            this.f18683r++;
            return new j2(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final n2 t() {
        boolean z10;
        if ((!this.f18684s) != false) {
            if (this.f18683r <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f18684s = true;
                this.f18685t++;
                return new n2(this);
            }
            n.w("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        n.w("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean u(d dVar) {
        boolean z10;
        qc.q.i(dVar, "anchor");
        if (!dVar.b()) {
            return false;
        }
        int s10 = m2.s(this.f18686u, dVar.a(), this.f18680m);
        if (s10 >= 0 && qc.q.d(this.f18686u.get(s10), dVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final void v(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList) {
        qc.q.i(iArr, "groups");
        qc.q.i(objArr, "slots");
        qc.q.i(arrayList, "anchors");
        this.f18679f = iArr;
        this.f18680m = i10;
        this.f18681p = objArr;
        this.f18682q = i11;
        this.f18686u = arrayList;
    }

    public final Object w(int i10, int i11) {
        int length;
        int t10 = m2.t(this.f18679f, i10);
        boolean z10 = true;
        int i12 = i10 + 1;
        if (i12 < this.f18680m) {
            length = m2.e(this.f18679f, i12);
        } else {
            length = this.f18681p.length;
        }
        int i13 = length - t10;
        if (i11 < 0 || i11 >= i13) {
            z10 = false;
        }
        if (z10) {
            return this.f18681p[t10 + i11];
        }
        return l.f18688a.a();
    }
}
