package b5;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;

/* compiled from: ImageResult.kt */
/* loaded from: classes.dex */
public final class q extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f8038a;

    /* renamed from: b  reason: collision with root package name */
    private final h f8039b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.f f8040c;

    /* renamed from: d  reason: collision with root package name */
    private final MemoryCache.Key f8041d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8042e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8043f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8044g;

    public q(Drawable drawable, h hVar, t4.f fVar, MemoryCache.Key key, String str, boolean z10, boolean z11) {
        super(null);
        this.f8038a = drawable;
        this.f8039b = hVar;
        this.f8040c = fVar;
        this.f8041d = key;
        this.f8042e = str;
        this.f8043f = z10;
        this.f8044g = z11;
    }

    @Override // b5.i
    public Drawable a() {
        return this.f8038a;
    }

    @Override // b5.i
    public h b() {
        return this.f8039b;
    }

    public final t4.f c() {
        return this.f8040c;
    }

    public final boolean d() {
        return this.f8044g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qc.q.d(a(), qVar.a()) && qc.q.d(b(), qVar.b()) && this.f8040c == qVar.f8040c && qc.q.d(this.f8041d, qVar.f8041d) && qc.q.d(this.f8042e, qVar.f8042e) && this.f8043f == qVar.f8043f && this.f8044g == qVar.f8044g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f8040c.hashCode()) * 31;
        MemoryCache.Key key = this.f8041d;
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str = this.f8042e;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((i12 + i11) * 31) + t.k.a(this.f8043f)) * 31) + t.k.a(this.f8044g);
    }
}
