package j0;

/* compiled from: ValueHolders.kt */
/* loaded from: classes.dex */
public final class i3<T> implements g3<T> {

    /* renamed from: f  reason: collision with root package name */
    private final T f18657f;

    public i3(T t10) {
        this.f18657f = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i3) && qc.q.d(this.f18657f, ((i3) obj).f18657f)) {
            return true;
        }
        return false;
    }

    @Override // j0.g3
    public T getValue() {
        return this.f18657f;
    }

    public int hashCode() {
        T t10 = this.f18657f;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f18657f + ')';
    }
}
