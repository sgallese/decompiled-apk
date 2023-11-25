package e0;

/* compiled from: Selection.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13640a;

    /* compiled from: Selection.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public final a a() {
        return null;
    }

    public final boolean b() {
        return this.f13640a;
    }

    public final a c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        jVar.getClass();
        if (qc.q.d(null, null) && qc.q.d(null, null) && this.f13640a == jVar.f13640a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + ((Object) null) + ", end=" + ((Object) null) + ", handlesCrossed=" + this.f13640a + ')';
    }
}
