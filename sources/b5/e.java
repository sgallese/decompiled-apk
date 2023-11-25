package b5;

import android.graphics.drawable.Drawable;

/* compiled from: ImageResult.kt */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f7955a;

    /* renamed from: b  reason: collision with root package name */
    private final h f7956b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f7957c;

    public e(Drawable drawable, h hVar, Throwable th) {
        super(null);
        this.f7955a = drawable;
        this.f7956b = hVar;
        this.f7957c = th;
    }

    @Override // b5.i
    public Drawable a() {
        return this.f7955a;
    }

    @Override // b5.i
    public h b() {
        return this.f7956b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (qc.q.d(a(), eVar.a()) && qc.q.d(b(), eVar.b()) && qc.q.d(this.f7957c, eVar.f7957c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        Drawable a10 = a();
        if (a10 != null) {
            i10 = a10.hashCode();
        } else {
            i10 = 0;
        }
        return (((i10 * 31) + b().hashCode()) * 31) + this.f7957c.hashCode();
    }
}
