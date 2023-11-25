package b5;

import ad.a1;
import ad.g0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f5.c;
import okhttp3.internal.http2.Http2;

/* compiled from: DefaultRequestOptions.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f7925a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f7926b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f7927c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f7928d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a f7929e;

    /* renamed from: f  reason: collision with root package name */
    private final c5.e f7930f;

    /* renamed from: g  reason: collision with root package name */
    private final Bitmap.Config f7931g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7932h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f7933i;

    /* renamed from: j  reason: collision with root package name */
    private final Drawable f7934j;

    /* renamed from: k  reason: collision with root package name */
    private final Drawable f7935k;

    /* renamed from: l  reason: collision with root package name */
    private final Drawable f7936l;

    /* renamed from: m  reason: collision with root package name */
    private final a f7937m;

    /* renamed from: n  reason: collision with root package name */
    private final a f7938n;

    /* renamed from: o  reason: collision with root package name */
    private final a f7939o;

    public b() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public final b a(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, c.a aVar, c5.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4) {
        return new b(g0Var, g0Var2, g0Var3, g0Var4, aVar, eVar, config, z10, z11, drawable, drawable2, drawable3, aVar2, aVar3, aVar4);
    }

    public final boolean c() {
        return this.f7932h;
    }

    public final boolean d() {
        return this.f7933i;
    }

    public final Bitmap.Config e() {
        return this.f7931g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (qc.q.d(this.f7925a, bVar.f7925a) && qc.q.d(this.f7926b, bVar.f7926b) && qc.q.d(this.f7927c, bVar.f7927c) && qc.q.d(this.f7928d, bVar.f7928d) && qc.q.d(this.f7929e, bVar.f7929e) && this.f7930f == bVar.f7930f && this.f7931g == bVar.f7931g && this.f7932h == bVar.f7932h && this.f7933i == bVar.f7933i && qc.q.d(this.f7934j, bVar.f7934j) && qc.q.d(this.f7935k, bVar.f7935k) && qc.q.d(this.f7936l, bVar.f7936l) && this.f7937m == bVar.f7937m && this.f7938n == bVar.f7938n && this.f7939o == bVar.f7939o) {
                return true;
            }
        }
        return false;
    }

    public final g0 f() {
        return this.f7927c;
    }

    public final a g() {
        return this.f7938n;
    }

    public final Drawable h() {
        return this.f7935k;
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = ((((((((((((((((this.f7925a.hashCode() * 31) + this.f7926b.hashCode()) * 31) + this.f7927c.hashCode()) * 31) + this.f7928d.hashCode()) * 31) + this.f7929e.hashCode()) * 31) + this.f7930f.hashCode()) * 31) + this.f7931g.hashCode()) * 31) + t.k.a(this.f7932h)) * 31) + t.k.a(this.f7933i)) * 31;
        Drawable drawable = this.f7934j;
        int i12 = 0;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (hashCode + i10) * 31;
        Drawable drawable2 = this.f7935k;
        if (drawable2 != null) {
            i11 = drawable2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Drawable drawable3 = this.f7936l;
        if (drawable3 != null) {
            i12 = drawable3.hashCode();
        }
        return ((((((i14 + i12) * 31) + this.f7937m.hashCode()) * 31) + this.f7938n.hashCode()) * 31) + this.f7939o.hashCode();
    }

    public final Drawable i() {
        return this.f7936l;
    }

    public final g0 j() {
        return this.f7926b;
    }

    public final g0 k() {
        return this.f7925a;
    }

    public final a l() {
        return this.f7937m;
    }

    public final a m() {
        return this.f7939o;
    }

    public final Drawable n() {
        return this.f7934j;
    }

    public final c5.e o() {
        return this.f7930f;
    }

    public final g0 p() {
        return this.f7928d;
    }

    public final c.a q() {
        return this.f7929e;
    }

    public b(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, c.a aVar, c5.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4) {
        this.f7925a = g0Var;
        this.f7926b = g0Var2;
        this.f7927c = g0Var3;
        this.f7928d = g0Var4;
        this.f7929e = aVar;
        this.f7930f = eVar;
        this.f7931g = config;
        this.f7932h = z10;
        this.f7933i = z11;
        this.f7934j = drawable;
        this.f7935k = drawable2;
        this.f7936l = drawable3;
        this.f7937m = aVar2;
        this.f7938n = aVar3;
        this.f7939o = aVar4;
    }

    public /* synthetic */ b(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4, c.a aVar, c5.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, a aVar2, a aVar3, a aVar4, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? a1.c().N0() : g0Var, (i10 & 2) != 0 ? a1.b() : g0Var2, (i10 & 4) != 0 ? a1.b() : g0Var3, (i10 & 8) != 0 ? a1.b() : g0Var4, (i10 & 16) != 0 ? c.a.f15451b : aVar, (i10 & 32) != 0 ? c5.e.AUTOMATIC : eVar, (i10 & 64) != 0 ? g5.l.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : drawable2, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? drawable3 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a.ENABLED : aVar2, (i10 & 8192) != 0 ? a.ENABLED : aVar3, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? a.ENABLED : aVar4);
    }
}
