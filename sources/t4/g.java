package t4;

import android.graphics.drawable.Drawable;

/* compiled from: DecodeResult.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f23558a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23559b;

    public g(Drawable drawable, boolean z10) {
        this.f23558a = drawable;
        this.f23559b = z10;
    }

    public final Drawable a() {
        return this.f23558a;
    }

    public final boolean b() {
        return this.f23559b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (qc.q.d(this.f23558a, gVar.f23558a) && this.f23559b == gVar.f23559b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f23558a.hashCode() * 31) + t.k.a(this.f23559b);
    }
}
