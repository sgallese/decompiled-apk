package td;

/* compiled from: Node.java */
/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private s f23748a = null;

    /* renamed from: b  reason: collision with root package name */
    private s f23749b = null;

    /* renamed from: c  reason: collision with root package name */
    private s f23750c = null;

    /* renamed from: d  reason: collision with root package name */
    private s f23751d = null;

    /* renamed from: e  reason: collision with root package name */
    private s f23752e = null;

    public abstract void a(z zVar);

    public void b(s sVar) {
        sVar.l();
        sVar.j(this);
        s sVar2 = this.f23750c;
        if (sVar2 != null) {
            sVar2.f23752e = sVar;
            sVar.f23751d = sVar2;
            this.f23750c = sVar;
            return;
        }
        this.f23749b = sVar;
        this.f23750c = sVar;
    }

    public s c() {
        return this.f23749b;
    }

    public s d() {
        return this.f23750c;
    }

    public s e() {
        return this.f23752e;
    }

    public s f() {
        return this.f23748a;
    }

    public s g() {
        return this.f23751d;
    }

    public void h(s sVar) {
        sVar.l();
        s sVar2 = this.f23752e;
        sVar.f23752e = sVar2;
        if (sVar2 != null) {
            sVar2.f23751d = sVar;
        }
        sVar.f23751d = this;
        this.f23752e = sVar;
        s sVar3 = this.f23748a;
        sVar.f23748a = sVar3;
        if (sVar.f23752e == null) {
            sVar3.f23750c = sVar;
        }
    }

    public void i(s sVar) {
        sVar.l();
        s sVar2 = this.f23751d;
        sVar.f23751d = sVar2;
        if (sVar2 != null) {
            sVar2.f23752e = sVar;
        }
        sVar.f23752e = this;
        this.f23751d = sVar;
        s sVar3 = this.f23748a;
        sVar.f23748a = sVar3;
        if (sVar.f23751d == null) {
            sVar3.f23749b = sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(s sVar) {
        this.f23748a = sVar;
    }

    protected String k() {
        return "";
    }

    public void l() {
        s sVar = this.f23751d;
        if (sVar != null) {
            sVar.f23752e = this.f23752e;
        } else {
            s sVar2 = this.f23748a;
            if (sVar2 != null) {
                sVar2.f23749b = this.f23752e;
            }
        }
        s sVar3 = this.f23752e;
        if (sVar3 != null) {
            sVar3.f23751d = sVar;
        } else {
            s sVar4 = this.f23748a;
            if (sVar4 != null) {
                sVar4.f23750c = sVar;
            }
        }
        this.f23748a = null;
        this.f23752e = null;
        this.f23751d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + k() + "}";
    }
}
