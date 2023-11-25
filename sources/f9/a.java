package f9;

/* compiled from: Event.java */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f15555a;

    /* renamed from: b  reason: collision with root package name */
    private final T f15556b;

    public T a() {
        return this.f15556b;
    }

    public Class<T> b() {
        return this.f15555a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f15555a, this.f15556b);
    }
}
