package g6;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f16223a;

    /* renamed from: b  reason: collision with root package name */
    private final T f16224b;

    /* renamed from: c  reason: collision with root package name */
    private final d f16225c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t10, d dVar) {
        this.f16223a = num;
        if (t10 != null) {
            this.f16224b = t10;
            if (dVar != null) {
                this.f16225c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // g6.c
    public Integer a() {
        return this.f16223a;
    }

    @Override // g6.c
    public T b() {
        return this.f16224b;
    }

    @Override // g6.c
    public d c() {
        return this.f16225c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f16223a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f16224b.equals(cVar.b()) && this.f16225c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f16223a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f16224b.hashCode()) * 1000003) ^ this.f16225c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f16223a + ", payload=" + this.f16224b + ", priority=" + this.f16225c + "}";
    }
}
