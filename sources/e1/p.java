package e1;

import a1.e1;
import a1.g4;
import a1.s4;
import a1.t4;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.l3;
import j0.z1;
import java.util.List;

/* compiled from: VectorCompose.kt */
/* loaded from: classes.dex */
public final class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<e1.e> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13887f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final e1.e invoke() {
            return new e1.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ float A;
        final /* synthetic */ int B;
        final /* synthetic */ int C;
        final /* synthetic */ int D;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<e1.i> f13888f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f13889m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f13890p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e1 f13891q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ float f13892r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ e1 f13893s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f13894t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f13895u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f13896v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f13897w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ float f13898x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ float f13899y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ float f13900z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(List<? extends e1.i> list, int i10, String str, e1 e1Var, float f10, e1 e1Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, int i14, int i15) {
            super(2);
            this.f13888f = list;
            this.f13889m = i10;
            this.f13890p = str;
            this.f13891q = e1Var;
            this.f13892r = f10;
            this.f13893s = e1Var2;
            this.f13894t = f11;
            this.f13895u = f12;
            this.f13896v = i11;
            this.f13897w = i12;
            this.f13898x = f13;
            this.f13899y = f14;
            this.f13900z = f15;
            this.A = f16;
            this.B = i13;
            this.C = i14;
            this.D = i15;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            p.b(this.f13888f, this.f13889m, this.f13890p, this.f13891q, this.f13892r, this.f13893s, this.f13894t, this.f13895u, this.f13896v, this.f13897w, this.f13898x, this.f13899y, this.f13900z, this.A, lVar, z1.a(this.B | 1), z1.a(this.C), this.D);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<e1.e, String, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f13901f = new b();

        b() {
            super(2);
        }

        public final void a(e1.e eVar, String str) {
            qc.q.i(eVar, "$this$set");
            qc.q.i(str, "it");
            eVar.l(str);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, String str) {
            a(eVar, str);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends qc.r implements pc.a<e1.h> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f13902f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(pc.a aVar) {
            super(0);
            this.f13902f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [e1.h, java.lang.Object] */
        @Override // pc.a
        public final e1.h invoke() {
            return this.f13902f.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f13903f = new c();

        c() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.o(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f13904f = new d();

        d() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.m(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f13905f = new e();

        e() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.n(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f13906f = new f();

        f() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.p(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f13907f = new g();

        g() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.q(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f13908f = new h();

        h() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.r(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.p<e1.e, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final i f13909f = new i();

        i() {
            super(2);
        }

        public final void a(e1.e eVar, float f10) {
            qc.q.i(eVar, "$this$set");
            eVar.s(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, Float f10) {
            a(eVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.p<e1.e, List<? extends e1.i>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final j f13910f = new j();

        j() {
            super(2);
        }

        public final void a(e1.e eVar, List<? extends e1.i> list) {
            qc.q.i(eVar, "$this$set");
            qc.q.i(list, "it");
            eVar.k(list);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.e eVar, List<? extends e1.i> list) {
            a(eVar, list);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f13911f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f13912m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f13913p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f13914q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ float f13915r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f13916s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f13917t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f13918u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ List<e1.i> f13919v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f13920w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f13921x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f13922y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends e1.i> list, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f13911f = str;
            this.f13912m = f10;
            this.f13913p = f11;
            this.f13914q = f12;
            this.f13915r = f13;
            this.f13916s = f14;
            this.f13917t = f15;
            this.f13918u = f16;
            this.f13919v = list;
            this.f13920w = pVar;
            this.f13921x = i10;
            this.f13922y = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            p.a(this.f13911f, this.f13912m, this.f13913p, this.f13914q, this.f13915r, this.f13916s, this.f13917t, this.f13918u, this.f13919v, this.f13920w, lVar, z1.a(this.f13921x | 1), this.f13922y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.a<e1.h> {

        /* renamed from: f  reason: collision with root package name */
        public static final l f13923f = new l();

        l() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final e1.h invoke() {
            return new e1.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class m extends qc.r implements pc.p<e1.h, s4, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f13924f = new m();

        m() {
            super(2);
        }

        public final void a(e1.h hVar, int i10) {
            qc.q.i(hVar, "$this$set");
            hVar.m(i10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, s4 s4Var) {
            a(hVar, s4Var.j());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class n extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final n f13925f = new n();

        n() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.o(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class o extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final o f13926f = new o();

        o() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.s(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* renamed from: e1.p$p  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0331p extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0331p f13927f = new C0331p();

        C0331p() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.q(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class q extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final q f13928f = new q();

        q() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.r(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class r extends qc.r implements pc.p<e1.h, String, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final r f13929f = new r();

        r() {
            super(2);
        }

        public final void a(e1.h hVar, String str) {
            qc.q.i(hVar, "$this$set");
            qc.q.i(str, "it");
            hVar.h(str);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, String str) {
            a(hVar, str);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class s extends qc.r implements pc.p<e1.h, List<? extends e1.i>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final s f13930f = new s();

        s() {
            super(2);
        }

        public final void a(e1.h hVar, List<? extends e1.i> list) {
            qc.q.i(hVar, "$this$set");
            qc.q.i(list, "it");
            hVar.i(list);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, List<? extends e1.i> list) {
            a(hVar, list);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class t extends qc.r implements pc.p<e1.h, g4, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final t f13931f = new t();

        t() {
            super(2);
        }

        public final void a(e1.h hVar, int i10) {
            qc.q.i(hVar, "$this$set");
            hVar.j(i10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, g4 g4Var) {
            a(hVar, g4Var.i());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class u extends qc.r implements pc.p<e1.h, e1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final u f13932f = new u();

        u() {
            super(2);
        }

        public final void a(e1.h hVar, e1 e1Var) {
            qc.q.i(hVar, "$this$set");
            hVar.f(e1Var);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, e1 e1Var) {
            a(hVar, e1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class v extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final v f13933f = new v();

        v() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.g(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class w extends qc.r implements pc.p<e1.h, e1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final w f13934f = new w();

        w() {
            super(2);
        }

        public final void a(e1.h hVar, e1 e1Var) {
            qc.q.i(hVar, "$this$set");
            hVar.k(e1Var);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, e1 e1Var) {
            a(hVar, e1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class x extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final x f13935f = new x();

        x() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.l(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class y extends qc.r implements pc.p<e1.h, Float, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final y f13936f = new y();

        y() {
            super(2);
        }

        public final void a(e1.h hVar, float f10) {
            qc.q.i(hVar, "$this$set");
            hVar.p(f10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, Float f10) {
            a(hVar, f10.floatValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorCompose.kt */
    /* loaded from: classes.dex */
    public static final class z extends qc.r implements pc.p<e1.h, t4, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final z f13937f = new z();

        z() {
            super(2);
        }

        public final void a(e1.h hVar, int i10) {
            qc.q.i(hVar, "$this$set");
            hVar.n(i10);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(e1.h hVar, t4 t4Var) {
            a(hVar, t4Var.j());
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, java.util.List<? extends e1.i> r28, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r29, j0.l r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.p.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, pc.p, j0.l, int, int):void");
    }

    public static final void b(List<? extends e1.i> list, int i10, String str, e1 e1Var, float f10, e1 e1Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, j0.l lVar, int i13, int i14, int i15) {
        qc.q.i(list, "pathData");
        j0.l q10 = lVar.q(-1478270750);
        int b10 = (i15 & 2) != 0 ? e1.t.b() : i10;
        String str2 = (i15 & 4) != 0 ? "" : str;
        e1 e1Var3 = (i15 & 8) != 0 ? null : e1Var;
        float f17 = (i15 & 16) != 0 ? 1.0f : f10;
        e1 e1Var4 = (i15 & 32) == 0 ? e1Var2 : null;
        float f18 = (i15 & 64) != 0 ? 1.0f : f11;
        float f19 = (i15 & 128) != 0 ? 0.0f : f12;
        int c10 = (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? e1.t.c() : i11;
        int d10 = (i15 & 512) != 0 ? e1.t.d() : i12;
        float f20 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 4.0f : f13;
        float f21 = (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? 0.0f : f14;
        float f22 = (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1.0f : f15;
        float f23 = (i15 & 8192) != 0 ? 0.0f : f16;
        if (j0.n.K()) {
            j0.n.V(-1478270750, i13, i14, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        l lVar2 = l.f13923f;
        q10.e(1886828752);
        if (!(q10.u() instanceof e1.n)) {
            j0.j.c();
        }
        q10.x();
        if (q10.n()) {
            q10.B(new b0(lVar2));
        } else {
            q10.H();
        }
        j0.l a10 = l3.a(q10);
        l3.b(a10, str2, r.f13929f);
        l3.b(a10, list, s.f13930f);
        l3.b(a10, g4.c(b10), t.f13931f);
        l3.b(a10, e1Var3, u.f13932f);
        l3.b(a10, Float.valueOf(f17), v.f13933f);
        l3.b(a10, e1Var4, w.f13934f);
        l3.b(a10, Float.valueOf(f18), x.f13935f);
        l3.b(a10, Float.valueOf(f19), y.f13936f);
        l3.b(a10, t4.d(d10), z.f13937f);
        l3.b(a10, s4.d(c10), m.f13924f);
        l3.b(a10, Float.valueOf(f20), n.f13925f);
        l3.b(a10, Float.valueOf(f21), o.f13926f);
        l3.b(a10, Float.valueOf(f22), C0331p.f13927f);
        l3.b(a10, Float.valueOf(f23), q.f13928f);
        q10.O();
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new a0(list, b10, str2, e1Var3, f17, e1Var4, f18, f19, c10, d10, f20, f21, f22, f23, i13, i14, i15));
    }
}
