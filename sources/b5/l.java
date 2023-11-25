package b5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import okhttp3.Headers;

/* compiled from: Options.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8014a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f8015b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorSpace f8016c;

    /* renamed from: d  reason: collision with root package name */
    private final c5.i f8017d;

    /* renamed from: e  reason: collision with root package name */
    private final c5.h f8018e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8019f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8020g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8021h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8022i;

    /* renamed from: j  reason: collision with root package name */
    private final Headers f8023j;

    /* renamed from: k  reason: collision with root package name */
    private final r f8024k;

    /* renamed from: l  reason: collision with root package name */
    private final m f8025l;

    /* renamed from: m  reason: collision with root package name */
    private final a f8026m;

    /* renamed from: n  reason: collision with root package name */
    private final a f8027n;

    /* renamed from: o  reason: collision with root package name */
    private final a f8028o;

    public l(Context context, Bitmap.Config config, ColorSpace colorSpace, c5.i iVar, c5.h hVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, r rVar, m mVar, a aVar, a aVar2, a aVar3) {
        this.f8014a = context;
        this.f8015b = config;
        this.f8016c = colorSpace;
        this.f8017d = iVar;
        this.f8018e = hVar;
        this.f8019f = z10;
        this.f8020g = z11;
        this.f8021h = z12;
        this.f8022i = str;
        this.f8023j = headers;
        this.f8024k = rVar;
        this.f8025l = mVar;
        this.f8026m = aVar;
        this.f8027n = aVar2;
        this.f8028o = aVar3;
    }

    public final l a(Context context, Bitmap.Config config, ColorSpace colorSpace, c5.i iVar, c5.h hVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, r rVar, m mVar, a aVar, a aVar2, a aVar3) {
        return new l(context, config, colorSpace, iVar, hVar, z10, z11, z12, str, headers, rVar, mVar, aVar, aVar2, aVar3);
    }

    public final boolean c() {
        return this.f8019f;
    }

    public final boolean d() {
        return this.f8020g;
    }

    public final ColorSpace e() {
        return this.f8016c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (qc.q.d(this.f8014a, lVar.f8014a) && this.f8015b == lVar.f8015b && ((Build.VERSION.SDK_INT < 26 || qc.q.d(this.f8016c, lVar.f8016c)) && qc.q.d(this.f8017d, lVar.f8017d) && this.f8018e == lVar.f8018e && this.f8019f == lVar.f8019f && this.f8020g == lVar.f8020g && this.f8021h == lVar.f8021h && qc.q.d(this.f8022i, lVar.f8022i) && qc.q.d(this.f8023j, lVar.f8023j) && qc.q.d(this.f8024k, lVar.f8024k) && qc.q.d(this.f8025l, lVar.f8025l) && this.f8026m == lVar.f8026m && this.f8027n == lVar.f8027n && this.f8028o == lVar.f8028o)) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.f8015b;
    }

    public final Context g() {
        return this.f8014a;
    }

    public final String h() {
        return this.f8022i;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f8014a.hashCode() * 31) + this.f8015b.hashCode()) * 31;
        ColorSpace colorSpace = this.f8016c;
        int i11 = 0;
        if (colorSpace != null) {
            i10 = colorSpace.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((((((((hashCode + i10) * 31) + this.f8017d.hashCode()) * 31) + this.f8018e.hashCode()) * 31) + t.k.a(this.f8019f)) * 31) + t.k.a(this.f8020g)) * 31) + t.k.a(this.f8021h)) * 31;
        String str = this.f8022i;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i11) * 31) + this.f8023j.hashCode()) * 31) + this.f8024k.hashCode()) * 31) + this.f8025l.hashCode()) * 31) + this.f8026m.hashCode()) * 31) + this.f8027n.hashCode()) * 31) + this.f8028o.hashCode();
    }

    public final a i() {
        return this.f8027n;
    }

    public final Headers j() {
        return this.f8023j;
    }

    public final a k() {
        return this.f8028o;
    }

    public final m l() {
        return this.f8025l;
    }

    public final boolean m() {
        return this.f8021h;
    }

    public final c5.h n() {
        return this.f8018e;
    }

    public final c5.i o() {
        return this.f8017d;
    }

    public final r p() {
        return this.f8024k;
    }
}
