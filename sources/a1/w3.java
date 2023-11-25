package a1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class w3 extends m4 {

    /* renamed from: e  reason: collision with root package name */
    private final List<p1> f213e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Float> f214f;

    /* renamed from: g  reason: collision with root package name */
    private final long f215g;

    /* renamed from: h  reason: collision with root package name */
    private final long f216h;

    /* renamed from: i  reason: collision with root package name */
    private final int f217i;

    public /* synthetic */ w3(List list, List list2, long j10, long j11, int i10, qc.h hVar) {
        this(list, list2, j10, j11, i10);
    }

    @Override // a1.m4
    public Shader b(long j10) {
        boolean z10;
        float o10;
        boolean z11;
        float p10;
        boolean z12;
        float o11;
        float p11;
        boolean z13 = true;
        if (z0.f.o(this.f215g) == Float.POSITIVE_INFINITY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            o10 = z0.l.i(j10);
        } else {
            o10 = z0.f.o(this.f215g);
        }
        if (z0.f.p(this.f215g) == Float.POSITIVE_INFINITY) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            p10 = z0.l.g(j10);
        } else {
            p10 = z0.f.p(this.f215g);
        }
        if (z0.f.o(this.f216h) == Float.POSITIVE_INFINITY) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            o11 = z0.l.i(j10);
        } else {
            o11 = z0.f.o(this.f216h);
        }
        if (z0.f.p(this.f216h) != Float.POSITIVE_INFINITY) {
            z13 = false;
        }
        if (z13) {
            p11 = z0.l.g(j10);
        } else {
            p11 = z0.f.p(this.f216h);
        }
        return n4.b(z0.g.a(o10, p10), z0.g.a(o11, p11), this.f213e, this.f214f, this.f217i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        if (qc.q.d(this.f213e, w3Var.f213e) && qc.q.d(this.f214f, w3Var.f214f) && z0.f.l(this.f215g, w3Var.f215g) && z0.f.l(this.f216h, w3Var.f216h) && v4.f(this.f217i, w3Var.f217i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f213e.hashCode() * 31;
        List<Float> list = this.f214f;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((hashCode + i10) * 31) + z0.f.q(this.f215g)) * 31) + z0.f.q(this.f216h)) * 31) + v4.g(this.f217i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (!z0.g.b(this.f215g)) {
            str = "";
        } else {
            str = "start=" + ((Object) z0.f.v(this.f215g)) + ", ";
        }
        if (z0.g.b(this.f216h)) {
            str2 = "end=" + ((Object) z0.f.v(this.f216h)) + ", ";
        }
        return "LinearGradient(colors=" + this.f213e + ", stops=" + this.f214f + ", " + str + str2 + "tileMode=" + ((Object) v4.h(this.f217i)) + ')';
    }

    private w3(List<p1> list, List<Float> list2, long j10, long j11, int i10) {
        qc.q.i(list, "colors");
        this.f213e = list;
        this.f214f = list2;
        this.f215g = j10;
        this.f216h = j11;
        this.f217i = i10;
    }
}
