package a1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public final class u4 extends m4 {

    /* renamed from: e  reason: collision with root package name */
    private final long f205e;

    /* renamed from: f  reason: collision with root package name */
    private final List<p1> f206f;

    /* renamed from: g  reason: collision with root package name */
    private final List<Float> f207g;

    public /* synthetic */ u4(long j10, List list, List list2, qc.h hVar) {
        this(j10, list, list2);
    }

    @Override // a1.m4
    public Shader b(long j10) {
        boolean z10;
        float o10;
        float p10;
        long a10;
        if (z0.g.d(this.f205e)) {
            a10 = z0.m.b(j10);
        } else {
            boolean z11 = true;
            if (z0.f.o(this.f205e) == Float.POSITIVE_INFINITY) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                o10 = z0.l.i(j10);
            } else {
                o10 = z0.f.o(this.f205e);
            }
            if (z0.f.p(this.f205e) != Float.POSITIVE_INFINITY) {
                z11 = false;
            }
            if (z11) {
                p10 = z0.l.g(j10);
            } else {
                p10 = z0.f.p(this.f205e);
            }
            a10 = z0.g.a(o10, p10);
        }
        return n4.c(a10, this.f206f, this.f207g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (z0.f.l(this.f205e, u4Var.f205e) && qc.q.d(this.f206f, u4Var.f206f) && qc.q.d(this.f207g, u4Var.f207g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int q10 = ((z0.f.q(this.f205e) * 31) + this.f206f.hashCode()) * 31;
        List<Float> list = this.f207g;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return q10 + i10;
    }

    public String toString() {
        String str;
        if (z0.g.c(this.f205e)) {
            str = "center=" + ((Object) z0.f.v(this.f205e)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f206f + ", stops=" + this.f207g + ')';
    }

    private u4(long j10, List<p1> list, List<Float> list2) {
        qc.q.i(list, "colors");
        this.f205e = j10;
        this.f206f = list;
        this.f207g = list2;
    }
}
