package androidx.compose.ui.window;

import qc.q;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3161a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3162b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3163c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3164d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3165e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3166f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3167g;

    public k() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public final boolean a() {
        return this.f3166f;
    }

    public final boolean b() {
        return this.f3162b;
    }

    public final boolean c() {
        return this.f3163c;
    }

    public final boolean d() {
        return this.f3165e;
    }

    public final boolean e() {
        return this.f3161a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f3161a == kVar.f3161a && this.f3162b == kVar.f3162b && this.f3163c == kVar.f3163c && this.f3164d == kVar.f3164d && this.f3165e == kVar.f3165e && this.f3166f == kVar.f3166f && this.f3167g == kVar.f3167g) {
            return true;
        }
        return false;
    }

    public final l f() {
        return this.f3164d;
    }

    public final boolean g() {
        return this.f3167g;
    }

    public int hashCode() {
        return (((((((((((((t.k.a(this.f3162b) * 31) + t.k.a(this.f3161a)) * 31) + t.k.a(this.f3162b)) * 31) + t.k.a(this.f3163c)) * 31) + this.f3164d.hashCode()) * 31) + t.k.a(this.f3165e)) * 31) + t.k.a(this.f3166f)) * 31) + t.k.a(this.f3167g);
    }

    public k(boolean z10, boolean z11, boolean z12, l lVar, boolean z13, boolean z14, boolean z15) {
        q.i(lVar, "securePolicy");
        this.f3161a = z10;
        this.f3162b = z11;
        this.f3163c = z12;
        this.f3164d = lVar;
        this.f3165e = z13;
        this.f3166f = z14;
        this.f3167g = z15;
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, l lVar, boolean z13, boolean z14, boolean z15, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? l.Inherit : lVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true, (i10 & 64) != 0 ? false : z15);
    }

    public /* synthetic */ k(boolean z10, boolean z11, boolean z12, l lVar, boolean z13, boolean z14, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? l.Inherit : lVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(boolean z10, boolean z11, boolean z12, l lVar, boolean z13, boolean z14) {
        this(z10, z11, z12, lVar, z13, z14, false);
        q.i(lVar, "securePolicy");
    }
}
