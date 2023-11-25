package d2;

import a2.c0;
import a2.l;
import a2.x;
import a2.y;
import a2.z0;
import android.graphics.Typeface;
import j0.g3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import v1.b0;
import v1.d;
import v1.k0;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class d implements v1.p {

    /* renamed from: a  reason: collision with root package name */
    private final String f13065a;

    /* renamed from: b  reason: collision with root package name */
    private final k0 f13066b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d.b<b0>> f13067c;

    /* renamed from: d  reason: collision with root package name */
    private final List<d.b<v1.u>> f13068d;

    /* renamed from: e  reason: collision with root package name */
    private final l.b f13069e;

    /* renamed from: f  reason: collision with root package name */
    private final j2.e f13070f;

    /* renamed from: g  reason: collision with root package name */
    private final i f13071g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f13072h;

    /* renamed from: i  reason: collision with root package name */
    private final w1.k f13073i;

    /* renamed from: j  reason: collision with root package name */
    private t f13074j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13075k;

    /* renamed from: l  reason: collision with root package name */
    private final int f13076l;

    /* compiled from: AndroidParagraphIntrinsics.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.r<a2.l, c0, x, y, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(a2.l lVar, c0 c0Var, int i10, int i11) {
            qc.q.i(c0Var, "fontWeight");
            g3<Object> a10 = d.this.g().a(lVar, c0Var, i10, i11);
            if (!(a10 instanceof z0.b)) {
                t tVar = new t(a10, d.this.f13074j);
                d.this.f13074j = tVar;
                return tVar.a();
            }
            Object value = a10.getValue();
            qc.q.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ Typeface invoke(a2.l lVar, c0 c0Var, x xVar, y yVar) {
            return a(lVar, c0Var, xVar.i(), yVar.m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List<v1.d$b<v1.b0>>, java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public d(String str, k0 k0Var, List<d.b<b0>> list, List<d.b<v1.u>> list2, l.b bVar, j2.e eVar) {
        boolean c10;
        boolean booleanValue;
        d.b<b0> bVar2;
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(eVar, "density");
        this.f13065a = str;
        this.f13066b = k0Var;
        this.f13067c = list;
        this.f13068d = list2;
        this.f13069e = bVar;
        this.f13070f = eVar;
        i iVar = new i(1, eVar.getDensity());
        this.f13071g = iVar;
        c10 = e.c(k0Var);
        if (!c10) {
            booleanValue = false;
        } else {
            booleanValue = n.f13086a.a().getValue().booleanValue();
        }
        this.f13075k = booleanValue;
        this.f13076l = e.d(k0Var.B(), k0Var.u());
        a aVar = new a();
        e2.h.e(iVar, k0Var.E());
        b0 a10 = e2.h.a(iVar, k0Var.M(), aVar, eVar, !((Collection) list).isEmpty());
        if (a10 != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 == 0) {
                    bVar2 = new d.b<>(a10, 0, this.f13065a.length());
                } else {
                    bVar2 = this.f13067c.get(i10 - 1);
                }
                list.add(bVar2);
            }
        }
        CharSequence a11 = c.a(this.f13065a, this.f13071g.getTextSize(), this.f13066b, list, this.f13068d, this.f13070f, aVar, this.f13075k);
        this.f13072h = a11;
        this.f13073i = new w1.k(a11, this.f13071g, this.f13076l);
    }

    @Override // v1.p
    public float a() {
        return this.f13073i.c();
    }

    @Override // v1.p
    public boolean b() {
        boolean z10;
        boolean c10;
        t tVar = this.f13074j;
        if (tVar != null) {
            z10 = tVar.b();
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!this.f13075k) {
                c10 = e.c(this.f13066b);
                if (!c10 || !n.f13086a.a().getValue().booleanValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // v1.p
    public float c() {
        return this.f13073i.b();
    }

    public final CharSequence f() {
        return this.f13072h;
    }

    public final l.b g() {
        return this.f13069e;
    }

    public final w1.k h() {
        return this.f13073i;
    }

    public final k0 i() {
        return this.f13066b;
    }

    public final int j() {
        return this.f13076l;
    }

    public final i k() {
        return this.f13071g;
    }
}
