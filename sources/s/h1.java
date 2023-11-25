package s;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class h1<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f22704a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22705b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f22706c;

    public h1() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (h1Var.f22704a != this.f22704a || h1Var.f22705b != this.f22705b || !qc.q.d(h1Var.f22706c, this.f22706c)) {
            return false;
        }
        return true;
    }

    @Override // s.b0, s.j
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public <V extends q> y1<V> a(i1<T, V> i1Var) {
        qc.q.i(i1Var, "converter");
        return new y1<>(this.f22704a, this.f22705b, this.f22706c);
    }

    public int hashCode() {
        return (((this.f22704a * 31) + this.f22706c.hashCode()) * 31) + this.f22705b;
    }

    public h1(int i10, int i11, c0 c0Var) {
        qc.q.i(c0Var, "easing");
        this.f22704a = i10;
        this.f22705b = i11;
        this.f22706c = c0Var;
    }

    public /* synthetic */ h1(int i10, int i11, c0 c0Var, int i12, qc.h hVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? d0.b() : c0Var);
    }
}
