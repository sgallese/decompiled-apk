package e1;

import a1.e4;
import a1.u0;
import a1.x3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: b  reason: collision with root package name */
    private float[] f13741b;

    /* renamed from: c  reason: collision with root package name */
    private final List<m> f13742c;

    /* renamed from: d  reason: collision with root package name */
    private List<? extends i> f13743d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13744e;

    /* renamed from: f  reason: collision with root package name */
    private e4 f13745f;

    /* renamed from: g  reason: collision with root package name */
    private pc.a<dc.w> f13746g;

    /* renamed from: h  reason: collision with root package name */
    private String f13747h;

    /* renamed from: i  reason: collision with root package name */
    private float f13748i;

    /* renamed from: j  reason: collision with root package name */
    private float f13749j;

    /* renamed from: k  reason: collision with root package name */
    private float f13750k;

    /* renamed from: l  reason: collision with root package name */
    private float f13751l;

    /* renamed from: m  reason: collision with root package name */
    private float f13752m;

    /* renamed from: n  reason: collision with root package name */
    private float f13753n;

    /* renamed from: o  reason: collision with root package name */
    private float f13754o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13755p;

    public e() {
        super(null);
        this.f13742c = new ArrayList();
        this.f13743d = t.e();
        this.f13744e = true;
        this.f13747h = "";
        this.f13751l = 1.0f;
        this.f13752m = 1.0f;
        this.f13755p = true;
    }

    private final boolean g() {
        return !this.f13743d.isEmpty();
    }

    private final void t() {
        if (g()) {
            e4 e4Var = this.f13745f;
            if (e4Var == null) {
                e4Var = u0.a();
                this.f13745f = e4Var;
            }
            l.c(this.f13743d, e4Var);
        }
    }

    private final void u() {
        float[] fArr = this.f13741b;
        if (fArr == null) {
            fArr = x3.c(null, 1, null);
            this.f13741b = fArr;
        } else {
            x3.h(fArr);
        }
        x3.m(fArr, this.f13749j + this.f13753n, this.f13750k + this.f13754o, 0.0f, 4, null);
        x3.i(fArr, this.f13748i);
        x3.j(fArr, this.f13751l, this.f13752m, 1.0f);
        x3.m(fArr, -this.f13749j, -this.f13750k, 0.0f, 4, null);
    }

    @Override // e1.m
    public void a(c1.f fVar) {
        qc.q.i(fVar, "<this>");
        if (this.f13755p) {
            u();
            this.f13755p = false;
        }
        if (this.f13744e) {
            t();
            this.f13744e = false;
        }
        c1.d y02 = fVar.y0();
        long b10 = y02.b();
        y02.d().k();
        c1.i a10 = y02.a();
        float[] fArr = this.f13741b;
        if (fArr != null) {
            a10.d(x3.a(fArr).n());
        }
        e4 e4Var = this.f13745f;
        if (g() && e4Var != null) {
            c1.h.a(a10, e4Var, 0, 2, null);
        }
        List<m> list = this.f13742c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(fVar);
        }
        y02.d().p();
        y02.c(b10);
    }

    @Override // e1.m
    public pc.a<dc.w> b() {
        return this.f13746g;
    }

    @Override // e1.m
    public void d(pc.a<dc.w> aVar) {
        this.f13746g = aVar;
        List<m> list = this.f13742c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).d(aVar);
        }
    }

    public final String e() {
        return this.f13747h;
    }

    public final int f() {
        return this.f13742c.size();
    }

    public final void h(int i10, m mVar) {
        qc.q.i(mVar, "instance");
        if (i10 < f()) {
            this.f13742c.set(i10, mVar);
        } else {
            this.f13742c.add(mVar);
        }
        mVar.d(b());
        c();
    }

    public final void i(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                m mVar = this.f13742c.get(i10);
                this.f13742c.remove(i10);
                this.f13742c.add(i11, mVar);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                m mVar2 = this.f13742c.get(i10);
                this.f13742c.remove(i10);
                this.f13742c.add(i11 - 1, mVar2);
                i13++;
            }
        }
        c();
    }

    public final void j(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.f13742c.size()) {
                this.f13742c.get(i10).d(null);
                this.f13742c.remove(i10);
            }
        }
        c();
    }

    public final void k(List<? extends i> list) {
        qc.q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13743d = list;
        this.f13744e = true;
        c();
    }

    public final void l(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13747h = str;
        c();
    }

    public final void m(float f10) {
        this.f13749j = f10;
        this.f13755p = true;
        c();
    }

    public final void n(float f10) {
        this.f13750k = f10;
        this.f13755p = true;
        c();
    }

    public final void o(float f10) {
        this.f13748i = f10;
        this.f13755p = true;
        c();
    }

    public final void p(float f10) {
        this.f13751l = f10;
        this.f13755p = true;
        c();
    }

    public final void q(float f10) {
        this.f13752m = f10;
        this.f13755p = true;
        c();
    }

    public final void r(float f10) {
        this.f13753n = f10;
        this.f13755p = true;
        c();
    }

    public final void s(float f10) {
        this.f13754o = f10;
        this.f13755p = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f13747h);
        List<m> list = this.f13742c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = list.get(i10);
            sb2.append("\t");
            sb2.append(mVar.toString());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }
}
