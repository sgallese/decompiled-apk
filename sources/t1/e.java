package t1;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f23414a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.a<Boolean> f23415b;

    public final pc.a<Boolean> a() {
        return this.f23415b;
    }

    public final String b() {
        return this.f23414a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (qc.q.d(this.f23414a, eVar.f23414a) && qc.q.d(this.f23415b, eVar.f23415b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23414a.hashCode() * 31) + this.f23415b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f23414a + ", action=" + this.f23415b + ')';
    }
}
