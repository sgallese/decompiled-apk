package f0;

import a1.q4;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.i2;
import j0.l3;
import n1.y0;
import okhttp3.internal.http2.Http2;
import p1.g;

/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f14423a = j2.h.j(20);

    /* renamed from: b  reason: collision with root package name */
    private static final float f14424b = j2.h.j(10);

    /* renamed from: c  reason: collision with root package name */
    private static final float f14425c = j2.h.j(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<pc.p<? super j0.l, ? super Integer, ? extends dc.w>, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f14426f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f14427m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14428p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b2.t0 f14429q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v.m f14430r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f14431s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14432t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14433u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14434v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14435w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ w1 f14436x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f14437y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f14438z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, boolean z10, boolean z11, b2.t0 t0Var, v.m mVar, boolean z12, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, w1 w1Var, int i10, int i11) {
            super(3);
            this.f14426f = str;
            this.f14427m = z10;
            this.f14428p = z11;
            this.f14429q = t0Var;
            this.f14430r = mVar;
            this.f14431s = z12;
            this.f14432t = pVar;
            this.f14433u = pVar2;
            this.f14434v = pVar3;
            this.f14435w = pVar4;
            this.f14436x = w1Var;
            this.f14437y = i10;
            this.f14438z = i11;
        }

        public final void a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
            int i11;
            int i12;
            qc.q.i(pVar, "innerTextField");
            if ((i10 & 14) == 0) {
                if (lVar.l(pVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i10 | i12;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(989834338, i11, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)");
            }
            y1 y1Var = y1.f15302a;
            String str = this.f14426f;
            boolean z10 = this.f14427m;
            boolean z11 = this.f14428p;
            b2.t0 t0Var = this.f14429q;
            v.m mVar = this.f14430r;
            boolean z12 = this.f14431s;
            pc.p<j0.l, Integer, dc.w> pVar2 = this.f14432t;
            pc.p<j0.l, Integer, dc.w> pVar3 = this.f14433u;
            pc.p<j0.l, Integer, dc.w> pVar4 = this.f14434v;
            pc.p<j0.l, Integer, dc.w> pVar5 = this.f14435w;
            w1 w1Var = this.f14436x;
            int i13 = i11;
            int i14 = this.f14437y;
            int i15 = this.f14438z;
            y1Var.a(str, pVar, z10, z11, t0Var, mVar, z12, pVar2, pVar3, pVar4, pVar5, w1Var, null, lVar, ((i15 >> 3) & 7168) | (i14 & 14) | ((i13 << 3) & 112) | ((i14 >> 3) & 896) | ((i15 << 9) & 57344) | ((i15 >> 6) & 458752) | ((i15 << 18) & 3670016) | ((i14 << 3) & 29360128) | ((i14 << 3) & 234881024) | ((i14 << 3) & 1879048192), ((i14 >> 27) & 14) | 3072 | ((i15 >> 24) & 112), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(pc.p<? super j0.l, ? super Integer, ? extends dc.w> pVar, j0.l lVar, Integer num) {
            a(pVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {
        final /* synthetic */ c0.w A;
        final /* synthetic */ boolean B;
        final /* synthetic */ int C;
        final /* synthetic */ int D;
        final /* synthetic */ v.m E;
        final /* synthetic */ q4 F;
        final /* synthetic */ w1 G;
        final /* synthetic */ int H;
        final /* synthetic */ int I;
        final /* synthetic */ int J;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f14439f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<String, dc.w> f14440m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14441p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f14442q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f14443r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ v1.k0 f14444s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14445t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14446u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14447v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14448w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ boolean f14449x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ b2.t0 f14450y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ c0.x f14451z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, pc.l<? super String, dc.w> lVar, androidx.compose.ui.e eVar, boolean z10, boolean z11, v1.k0 k0Var, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, boolean z12, b2.t0 t0Var, c0.x xVar, c0.w wVar, boolean z13, int i10, int i11, v.m mVar, q4 q4Var, w1 w1Var, int i12, int i13, int i14) {
            super(2);
            this.f14439f = str;
            this.f14440m = lVar;
            this.f14441p = eVar;
            this.f14442q = z10;
            this.f14443r = z11;
            this.f14444s = k0Var;
            this.f14445t = pVar;
            this.f14446u = pVar2;
            this.f14447v = pVar3;
            this.f14448w = pVar4;
            this.f14449x = z12;
            this.f14450y = t0Var;
            this.f14451z = xVar;
            this.A = wVar;
            this.B = z13;
            this.C = i10;
            this.D = i11;
            this.E = mVar;
            this.F = q4Var;
            this.G = w1Var;
            this.H = i12;
            this.I = i13;
            this.J = i14;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            b2.a(this.f14439f, this.f14440m, this.f14441p, this.f14442q, this.f14443r, this.f14444s, this.f14445t, this.f14446u, this.f14447v, this.f14448w, this.f14449x, this.f14450y, this.f14451z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, lVar, j0.z1.a(this.H | 1), j0.z1.a(this.I), this.J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14452f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14453m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14454p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<androidx.compose.ui.e, j0.l, Integer, dc.w> f14455q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14456r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f14457s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f14458t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f14459u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ w.s f14460v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f14461w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.q<? super androidx.compose.ui.e, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, boolean z10, float f10, w.s sVar, int i10) {
            super(2);
            this.f14452f = eVar;
            this.f14453m = pVar;
            this.f14454p = pVar2;
            this.f14455q = qVar;
            this.f14456r = pVar3;
            this.f14457s = pVar4;
            this.f14458t = z10;
            this.f14459u = f10;
            this.f14460v = sVar;
            this.f14461w = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            b2.b(this.f14452f, this.f14453m, this.f14454p, this.f14455q, this.f14456r, this.f14457s, this.f14458t, this.f14459u, this.f14460v, lVar, j0.z1.a(this.f14461w | 1));
        }
    }

    /* compiled from: TextField.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f14462f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t.g f14463m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, t.g gVar) {
            super(1);
            this.f14462f = f10;
            this.f14463m = gVar;
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$drawWithContent");
            cVar.d1();
            if (j2.h.l(this.f14462f, j2.h.f18979m.a())) {
                return;
            }
            float density = this.f14462f * cVar.getDensity();
            float g10 = z0.l.g(cVar.b()) - (density / 2);
            c1.e.i(cVar, this.f14463m.a(), z0.g.a(0.0f, g10), z0.g.a(z0.l.i(cVar.b()), g10), density, 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b1, code lost:
    
        if (r7.Q(r87) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r74, pc.l<? super java.lang.String, dc.w> r75, androidx.compose.ui.e r76, boolean r77, boolean r78, v1.k0 r79, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r80, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r81, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r82, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r83, boolean r84, b2.t0 r85, c0.x r86, c0.w r87, boolean r88, int r89, int r90, v.m r91, a1.q4 r92, f0.w1 r93, j0.l r94, int r95, int r96, int r97) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b2.a(java.lang.String, pc.l, androidx.compose.ui.e, boolean, boolean, v1.k0, pc.p, pc.p, pc.p, pc.p, boolean, b2.t0, c0.x, c0.w, boolean, int, int, v.m, a1.q4, f0.w1, j0.l, int, int, int):void");
    }

    public static final void b(androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2, pc.q<? super androidx.compose.ui.e, ? super j0.l, ? super Integer, dc.w> qVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar3, pc.p<? super j0.l, ? super Integer, dc.w> pVar4, boolean z10, float f10, w.s sVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        float c10;
        float c11;
        qc.q.i(eVar, "modifier");
        qc.q.i(pVar, "textField");
        qc.q.i(sVar, "paddingValues");
        j0.l q10 = lVar.q(-2112507061);
        if ((i10 & 14) == 0) {
            i11 = (q10.Q(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= q10.l(pVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= q10.l(pVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= q10.l(qVar) ? RecyclerView.m.FLAG_MOVED : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((57344 & i10) == 0) {
            i11 |= q10.l(pVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= q10.l(pVar4) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= q10.c(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= q10.g(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= q10.Q(sVar) ? 67108864 : 33554432;
        }
        if ((191739611 & i11) == 38347922 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-2112507061, i11, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:472)");
            }
            Boolean valueOf = Boolean.valueOf(z10);
            Float valueOf2 = Float.valueOf(f10);
            q10.e(1618982084);
            boolean Q = q10.Q(valueOf) | q10.Q(valueOf2) | q10.Q(sVar);
            Object f11 = q10.f();
            if (Q || f11 == j0.l.f18688a.a()) {
                f11 = new c2(z10, f10, sVar);
                q10.J(f11);
            }
            q10.N();
            c2 c2Var = (c2) f11;
            j2.r rVar = (j2.r) q10.C(androidx.compose.ui.platform.z0.j());
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            j0.v F = q10.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(eVar);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a11);
            } else {
                q10.H();
            }
            j0.l a13 = l3.a(q10);
            l3.b(a13, c2Var, aVar.e());
            l3.b(a13, F, aVar.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i13 >> 3) & 112));
            q10.e(2058660585);
            q10.e(254819681);
            if (pVar3 != null) {
                androidx.compose.ui.e a14 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f2335a, "Leading").a(a2.d());
                v0.b d10 = v0.b.f24258a.d();
                q10.e(733328855);
                n1.i0 h10 = androidx.compose.foundation.layout.d.h(d10, false, q10, 6);
                q10.e(-1323940314);
                int a15 = j0.j.a(q10, 0);
                j0.v F2 = q10.F();
                pc.a<p1.g> a16 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a17 = n1.x.a(a14);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a16);
                } else {
                    q10.H();
                }
                j0.l a18 = l3.a(q10);
                l3.b(a18, h10, aVar.e());
                l3.b(a18, F2, aVar.g());
                pc.p<p1.g, Integer, dc.w> b11 = aVar.b();
                if (a18.n() || !qc.q.d(a18.f(), Integer.valueOf(a15))) {
                    a18.J(Integer.valueOf(a15));
                    a18.I(Integer.valueOf(a15), b11);
                }
                a17.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
                pVar3.invoke(q10, Integer.valueOf((i11 >> 12) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            q10.e(254819966);
            if (pVar4 != null) {
                androidx.compose.ui.e a19 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f2335a, "Trailing").a(a2.d());
                v0.b d11 = v0.b.f24258a.d();
                q10.e(733328855);
                n1.i0 h11 = androidx.compose.foundation.layout.d.h(d11, false, q10, 6);
                q10.e(-1323940314);
                int a20 = j0.j.a(q10, 0);
                j0.v F3 = q10.F();
                pc.a<p1.g> a21 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a22 = n1.x.a(a19);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a21);
                } else {
                    q10.H();
                }
                j0.l a23 = l3.a(q10);
                l3.b(a23, h11, aVar.e());
                l3.b(a23, F3, aVar.g());
                pc.p<p1.g, Integer, dc.w> b12 = aVar.b();
                if (a23.n() || !qc.q.d(a23.f(), Integer.valueOf(a20))) {
                    a23.J(Integer.valueOf(a20));
                    a23.I(Integer.valueOf(a20), b12);
                }
                a22.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                androidx.compose.foundation.layout.e eVar3 = androidx.compose.foundation.layout.e.f2083a;
                pVar4.invoke(q10, Integer.valueOf((i11 >> 15) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            float g10 = androidx.compose.foundation.layout.j.g(sVar, rVar);
            float f12 = androidx.compose.foundation.layout.j.f(sVar, rVar);
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            if (pVar3 != null) {
                i12 = 0;
                c11 = vc.l.c(j2.h.j(g10 - a2.c()), j2.h.j(0));
                g10 = j2.h.j(c11);
            } else {
                i12 = 0;
            }
            float f13 = g10;
            if (pVar4 != null) {
                c10 = vc.l.c(j2.h.j(f12 - a2.c()), j2.h.j(i12));
                f12 = j2.h.j(c10);
            }
            androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(aVar2, f13, 0.0f, f12, 0.0f, 10, null);
            q10.e(254820977);
            if (qVar != null) {
                qVar.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").a(m10), q10, Integer.valueOf((i11 >> 6) & 112));
            }
            q10.N();
            q10.e(254821106);
            if (pVar2 != null) {
                androidx.compose.ui.e a24 = androidx.compose.ui.layout.a.b(aVar2, "Label").a(m10);
                q10.e(733328855);
                n1.i0 h12 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), false, q10, 0);
                q10.e(-1323940314);
                int a25 = j0.j.a(q10, 0);
                j0.v F4 = q10.F();
                pc.a<p1.g> a26 = aVar.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a27 = n1.x.a(a24);
                if (!(q10.u() instanceof j0.f)) {
                    j0.j.c();
                }
                q10.s();
                if (q10.n()) {
                    q10.B(a26);
                } else {
                    q10.H();
                }
                j0.l a28 = l3.a(q10);
                l3.b(a28, h12, aVar.e());
                l3.b(a28, F4, aVar.g());
                pc.p<p1.g, Integer, dc.w> b13 = aVar.b();
                if (a28.n() || !qc.q.d(a28.f(), Integer.valueOf(a25))) {
                    a28.J(Integer.valueOf(a25));
                    a28.I(Integer.valueOf(a25), b13);
                }
                a27.invoke(i2.a(i2.b(q10)), q10, 0);
                q10.e(2058660585);
                androidx.compose.foundation.layout.e eVar4 = androidx.compose.foundation.layout.e.f2083a;
                pVar2.invoke(q10, Integer.valueOf((i11 >> 6) & 14));
                q10.N();
                q10.O();
                q10.N();
                q10.N();
            }
            q10.N();
            androidx.compose.ui.e a29 = androidx.compose.ui.layout.a.b(aVar2, "TextField").a(m10);
            q10.e(733328855);
            n1.i0 h13 = androidx.compose.foundation.layout.d.h(v0.b.f24258a.n(), true, q10, 48);
            q10.e(-1323940314);
            int a30 = j0.j.a(q10, 0);
            j0.v F5 = q10.F();
            pc.a<p1.g> a31 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a32 = n1.x.a(a29);
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a31);
            } else {
                q10.H();
            }
            j0.l a33 = l3.a(q10);
            l3.b(a33, h13, aVar.e());
            l3.b(a33, F5, aVar.g());
            pc.p<p1.g, Integer, dc.w> b14 = aVar.b();
            if (a33.n() || !qc.q.d(a33.f(), Integer.valueOf(a30))) {
                a33.J(Integer.valueOf(a30));
                a33.I(Integer.valueOf(a30), b14);
            }
            a32.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            androidx.compose.foundation.layout.e eVar5 = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(q10, Integer.valueOf((i11 >> 3) & 14));
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new c(eVar, pVar, pVar2, qVar, pVar3, pVar4, z10, f10, sVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, w.s sVar) {
        float f11;
        int d10;
        float f12 = f14425c * f10;
        float d11 = sVar.d() * f10;
        float a10 = sVar.a() * f10;
        int max = Math.max(i10, i14);
        if (z10) {
            f11 = i11 + f12 + max + a10;
        } else {
            f11 = d11 + max + a10;
        }
        d10 = sc.c.d(f11);
        return Math.max(d10, Math.max(Math.max(i12, i13), j2.b.o(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, long j10) {
        return Math.max(i10 + Math.max(i12, Math.max(i13, i14)) + i11, j2.b.p(j10));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, t.g gVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(gVar, "indicatorBorder");
        return androidx.compose.ui.draw.b.d(eVar, new d(gVar.b(), gVar));
    }

    public static final float j() {
        return f14423a;
    }

    public static final float k() {
        return f14424b;
    }

    public static final float l() {
        return f14425c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(y0.a aVar, int i10, int i11, n1.y0 y0Var, n1.y0 y0Var2, n1.y0 y0Var3, n1.y0 y0Var4, n1.y0 y0Var5, boolean z10, int i12, int i13, float f10, float f11) {
        int d10;
        int d11;
        if (y0Var4 != null) {
            y0.a.r(aVar, y0Var4, 0, v0.b.f24258a.h().a(y0Var4.l0(), i11), 0.0f, 4, null);
        }
        if (y0Var5 != null) {
            y0.a.r(aVar, y0Var5, i10 - y0Var5.A0(), v0.b.f24258a.h().a(y0Var5.l0(), i11), 0.0f, 4, null);
        }
        if (y0Var2 != null) {
            if (!z10) {
                d10 = sc.c.d(a2.f() * f11);
            } else {
                d10 = v0.b.f24258a.h().a(y0Var2.l0(), i11);
            }
            d11 = sc.c.d((d10 - i12) * f10);
            y0.a.r(aVar, y0Var2, a2.i(y0Var4), d10 - d11, 0.0f, 4, null);
        }
        y0.a.r(aVar, y0Var, a2.i(y0Var4), i13, 0.0f, 4, null);
        if (y0Var3 != null) {
            y0.a.r(aVar, y0Var3, a2.i(y0Var4), i13, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(y0.a aVar, int i10, int i11, n1.y0 y0Var, n1.y0 y0Var2, n1.y0 y0Var3, n1.y0 y0Var4, boolean z10, float f10, w.s sVar) {
        int d10;
        int i12;
        d10 = sc.c.d(sVar.d() * f10);
        if (y0Var3 != null) {
            y0.a.r(aVar, y0Var3, 0, v0.b.f24258a.h().a(y0Var3.l0(), i11), 0.0f, 4, null);
        }
        if (y0Var4 != null) {
            y0.a.r(aVar, y0Var4, i10 - y0Var4.A0(), v0.b.f24258a.h().a(y0Var4.l0(), i11), 0.0f, 4, null);
        }
        if (z10) {
            i12 = v0.b.f24258a.h().a(y0Var.l0(), i11);
        } else {
            i12 = d10;
        }
        y0.a.r(aVar, y0Var, a2.i(y0Var3), i12, 0.0f, 4, null);
        if (y0Var2 != null) {
            if (z10) {
                d10 = v0.b.f24258a.h().a(y0Var2.l0(), i11);
            }
            y0.a.r(aVar, y0Var2, a2.i(y0Var3), d10, 0.0f, 4, null);
        }
    }
}
