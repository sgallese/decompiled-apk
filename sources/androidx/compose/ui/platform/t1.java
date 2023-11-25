package androidx.compose.ui.platform;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private long f2826a;

    /* renamed from: b  reason: collision with root package name */
    private long f2827b;

    /* renamed from: c  reason: collision with root package name */
    private a2.c0 f2828c;

    /* renamed from: d  reason: collision with root package name */
    private a2.x f2829d;

    /* renamed from: e  reason: collision with root package name */
    private a2.y f2830e;

    /* renamed from: f  reason: collision with root package name */
    private a2.l f2831f;

    /* renamed from: g  reason: collision with root package name */
    private String f2832g;

    /* renamed from: h  reason: collision with root package name */
    private long f2833h;

    /* renamed from: i  reason: collision with root package name */
    private g2.a f2834i;

    /* renamed from: j  reason: collision with root package name */
    private g2.p f2835j;

    /* renamed from: k  reason: collision with root package name */
    private c2.i f2836k;

    /* renamed from: l  reason: collision with root package name */
    private long f2837l;

    /* renamed from: m  reason: collision with root package name */
    private g2.k f2838m;

    /* renamed from: n  reason: collision with root package name */
    private a1.o4 f2839n;

    public /* synthetic */ t1(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, a1.o4 o4Var, qc.h hVar) {
        this(j10, j11, c0Var, xVar, yVar, lVar, str, j12, aVar, pVar, iVar, j13, kVar, o4Var);
    }

    public final void a(long j10) {
        this.f2837l = j10;
    }

    public final void b(g2.a aVar) {
        this.f2834i = aVar;
    }

    public final void c(long j10) {
        this.f2826a = j10;
    }

    public final void d(String str) {
        this.f2832g = str;
    }

    public final void e(long j10) {
        this.f2827b = j10;
    }

    public final void f(a2.x xVar) {
        this.f2829d = xVar;
    }

    public final void g(a2.y yVar) {
        this.f2830e = yVar;
    }

    public final void h(a2.c0 c0Var) {
        this.f2828c = c0Var;
    }

    public final void i(long j10) {
        this.f2833h = j10;
    }

    public final void j(a1.o4 o4Var) {
        this.f2839n = o4Var;
    }

    public final void k(g2.k kVar) {
        this.f2838m = kVar;
    }

    public final void l(g2.p pVar) {
        this.f2835j = pVar;
    }

    public final v1.b0 m() {
        return new v1.b0(this.f2826a, this.f2827b, this.f2828c, this.f2829d, this.f2830e, this.f2831f, this.f2832g, this.f2833h, this.f2834i, this.f2835j, this.f2836k, this.f2837l, this.f2838m, this.f2839n, null, null, 49152, null);
    }

    private t1(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, a1.o4 o4Var) {
        this.f2826a = j10;
        this.f2827b = j11;
        this.f2828c = c0Var;
        this.f2829d = xVar;
        this.f2830e = yVar;
        this.f2831f = lVar;
        this.f2832g = str;
        this.f2833h = j12;
        this.f2834i = aVar;
        this.f2835j = pVar;
        this.f2836k = iVar;
        this.f2837l = j13;
        this.f2838m = kVar;
        this.f2839n = o4Var;
    }

    public /* synthetic */ t1(long j10, long j11, a2.c0 c0Var, a2.x xVar, a2.y yVar, a2.l lVar, String str, long j12, g2.a aVar, g2.p pVar, c2.i iVar, long j13, g2.k kVar, a1.o4 o4Var, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? a1.p1.f146b.e() : j10, (i10 & 2) != 0 ? j2.s.f19004b.a() : j11, (i10 & 4) != 0 ? null : c0Var, (i10 & 8) != 0 ? null : xVar, (i10 & 16) != 0 ? null : yVar, (i10 & 32) != 0 ? null : lVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? j2.s.f19004b.a() : j12, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : iVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? a1.p1.f146b.e() : j13, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i10 & 8192) != 0 ? null : o4Var, null);
    }
}
