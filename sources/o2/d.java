package o2;

import java.util.HashSet;
import java.util.Iterator;
import n2.i;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public final e f20371b;

    /* renamed from: c  reason: collision with root package name */
    public final b f20372c;

    /* renamed from: d  reason: collision with root package name */
    public d f20373d;

    /* renamed from: g  reason: collision with root package name */
    n2.i f20376g;

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f20370a = null;

    /* renamed from: e  reason: collision with root package name */
    public int f20374e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f20375f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20377a;

        static {
            int[] iArr = new int[b.values().length];
            f20377a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20377a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20377a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20377a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20377a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20377a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20377a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20377a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20377a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f20371b = eVar;
        this.f20372c = bVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, -1, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            l();
            return true;
        } else if (!z10 && !k(dVar)) {
            return false;
        } else {
            this.f20373d = dVar;
            if (dVar.f20370a == null) {
                dVar.f20370a = new HashSet<>();
            }
            this.f20373d.f20370a.add(this);
            if (i10 > 0) {
                this.f20374e = i10;
            } else {
                this.f20374e = 0;
            }
            this.f20375f = i11;
            return true;
        }
    }

    public int c() {
        d dVar;
        if (this.f20371b.O() == 8) {
            return 0;
        }
        if (this.f20375f > -1 && (dVar = this.f20373d) != null && dVar.f20371b.O() == 8) {
            return this.f20375f;
        }
        return this.f20374e;
    }

    public final d d() {
        switch (a.f20377a[this.f20372c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f20371b.D;
            case 3:
                return this.f20371b.B;
            case 4:
                return this.f20371b.E;
            case 5:
                return this.f20371b.C;
            default:
                throw new AssertionError(this.f20372c.name());
        }
    }

    public e e() {
        return this.f20371b;
    }

    public n2.i f() {
        return this.f20376g;
    }

    public d g() {
        return this.f20373d;
    }

    public b h() {
        return this.f20372c;
    }

    public boolean i() {
        HashSet<d> hashSet = this.f20370a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        if (this.f20373d != null) {
            return true;
        }
        return false;
    }

    public boolean k(d dVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (dVar == null) {
            return false;
        }
        b h10 = dVar.h();
        b bVar = this.f20372c;
        if (h10 == bVar) {
            if (bVar == b.BASELINE && (!dVar.e().S() || !e().S())) {
                return false;
            }
            return true;
        }
        switch (a.f20377a[bVar.ordinal()]) {
            case 1:
                if (h10 == b.BASELINE || h10 == b.CENTER_X || h10 == b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (h10 != b.LEFT && h10 != b.RIGHT) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (dVar.e() instanceof h) {
                    if (z10 || h10 == b.CENTER_X) {
                        z12 = true;
                    }
                    return z12;
                }
                return z10;
            case 4:
            case 5:
                if (h10 != b.TOP && h10 != b.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (dVar.e() instanceof h) {
                    if (z11 || h10 == b.CENTER_Y) {
                        z12 = true;
                    }
                    return z12;
                }
                return z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f20372c.name());
        }
    }

    public void l() {
        HashSet<d> hashSet;
        d dVar = this.f20373d;
        if (dVar != null && (hashSet = dVar.f20370a) != null) {
            hashSet.remove(this);
        }
        this.f20373d = null;
        this.f20374e = 0;
        this.f20375f = -1;
    }

    public void m(n2.c cVar) {
        n2.i iVar = this.f20376g;
        if (iVar == null) {
            this.f20376g = new n2.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i10) {
        if (j()) {
            this.f20375f = i10;
        }
    }

    public String toString() {
        return this.f20371b.r() + ":" + this.f20372c.toString();
    }
}
