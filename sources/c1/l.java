package c1;

import a1.f4;
import a1.s4;
import a1.t4;
import qc.q;

/* compiled from: DrawScope.kt */
/* loaded from: classes.dex */
public final class l extends g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8684f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final int f8685g = s4.f186b.a();

    /* renamed from: h  reason: collision with root package name */
    private static final int f8686h = t4.f193b.b();

    /* renamed from: a  reason: collision with root package name */
    private final float f8687a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8688b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8689c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8690d;

    /* renamed from: e  reason: collision with root package name */
    private final f4 f8691e;

    /* compiled from: DrawScope.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return l.f8685g;
        }
    }

    public /* synthetic */ l(float f10, float f11, int i10, int i11, f4 f4Var, qc.h hVar) {
        this(f10, f11, i10, i11, f4Var);
    }

    public final int b() {
        return this.f8689c;
    }

    public final int c() {
        return this.f8690d;
    }

    public final float d() {
        return this.f8688b;
    }

    public final f4 e() {
        return this.f8691e;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f8687a == lVar.f8687a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f8688b == lVar.f8688b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && s4.g(this.f8689c, lVar.f8689c) && t4.g(this.f8690d, lVar.f8690d) && q.d(this.f8691e, lVar.f8691e)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f8687a;
    }

    public int hashCode() {
        int i10;
        int floatToIntBits = ((((((Float.floatToIntBits(this.f8687a) * 31) + Float.floatToIntBits(this.f8688b)) * 31) + s4.h(this.f8689c)) * 31) + t4.h(this.f8690d)) * 31;
        f4 f4Var = this.f8691e;
        if (f4Var != null) {
            i10 = f4Var.hashCode();
        } else {
            i10 = 0;
        }
        return floatToIntBits + i10;
    }

    public String toString() {
        return "Stroke(width=" + this.f8687a + ", miter=" + this.f8688b + ", cap=" + ((Object) s4.i(this.f8689c)) + ", join=" + ((Object) t4.i(this.f8690d)) + ", pathEffect=" + this.f8691e + ')';
    }

    public /* synthetic */ l(float f10, float f11, int i10, int i11, f4 f4Var, int i12, qc.h hVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f8685g : i10, (i12 & 8) != 0 ? f8686h : i11, (i12 & 16) != 0 ? null : f4Var, null);
    }

    private l(float f10, float f11, int i10, int i11, f4 f4Var) {
        super(null);
        this.f8687a = f10;
        this.f8688b = f11;
        this.f8689c = i10;
        this.f8690d = i11;
        this.f8691e = f4Var;
    }
}
