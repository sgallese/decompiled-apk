package qd;

/* compiled from: BlockStartImpl.java */
/* loaded from: classes4.dex */
public class d extends vd.f {

    /* renamed from: a  reason: collision with root package name */
    private final vd.d[] f21695a;

    /* renamed from: b  reason: collision with root package name */
    private int f21696b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f21697c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21698d = false;

    public d(vd.d... dVarArr) {
        this.f21695a = dVarArr;
    }

    @Override // vd.f
    public vd.f a(int i10) {
        this.f21697c = i10;
        return this;
    }

    @Override // vd.f
    public vd.f b(int i10) {
        this.f21696b = i10;
        return this;
    }

    @Override // vd.f
    public vd.f e() {
        this.f21698d = true;
        return this;
    }

    public vd.d[] f() {
        return this.f21695a;
    }

    public int g() {
        return this.f21697c;
    }

    public int h() {
        return this.f21696b;
    }

    public boolean i() {
        return this.f21698d;
    }
}
