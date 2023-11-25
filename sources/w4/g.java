package w4;

import android.graphics.drawable.Drawable;
import qc.q;

/* compiled from: FetchResult.kt */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f25376a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25377b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.f f25378c;

    public g(Drawable drawable, boolean z10, t4.f fVar) {
        super(null);
        this.f25376a = drawable;
        this.f25377b = z10;
        this.f25378c = fVar;
    }

    public final t4.f a() {
        return this.f25378c;
    }

    public final Drawable b() {
        return this.f25376a;
    }

    public final boolean c() {
        return this.f25377b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (q.d(this.f25376a, gVar.f25376a) && this.f25377b == gVar.f25377b && this.f25378c == gVar.f25378c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f25376a.hashCode() * 31) + t.k.a(this.f25377b)) * 31) + this.f25378c.hashCode();
    }
}
