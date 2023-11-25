package v1;

/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final x f24521a;

    /* renamed from: b  reason: collision with root package name */
    private final w f24522b;

    public z(x xVar, w wVar) {
        this.f24521a = xVar;
        this.f24522b = wVar;
    }

    public final w a() {
        return this.f24522b;
    }

    public final x b() {
        return this.f24521a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (qc.q.d(this.f24522b, zVar.f24522b) && qc.q.d(this.f24521a, zVar.f24521a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        x xVar = this.f24521a;
        int i11 = 0;
        if (xVar != null) {
            i10 = xVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        w wVar = this.f24522b;
        if (wVar != null) {
            i11 = wVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f24521a + ", paragraphSyle=" + this.f24522b + ')';
    }

    public z(boolean z10) {
        this(null, new w(z10));
    }
}
