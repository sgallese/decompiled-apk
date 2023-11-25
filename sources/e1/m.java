package e1;

/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private pc.a<dc.w> f13874a;

    private m() {
    }

    public /* synthetic */ m(qc.h hVar) {
        this();
    }

    public abstract void a(c1.f fVar);

    public pc.a<dc.w> b() {
        return this.f13874a;
    }

    public final void c() {
        pc.a<dc.w> b10 = b();
        if (b10 != null) {
            b10.invoke();
        }
    }

    public void d(pc.a<dc.w> aVar) {
        this.f13874a = aVar;
    }
}
