package qc;

/* compiled from: PropertyReference.java */
/* loaded from: classes4.dex */
public abstract class a0 extends d implements wc.h {

    /* renamed from: u  reason: collision with root package name */
    private final boolean f21654u;

    public a0() {
        this.f21654u = false;
    }

    @Override // qc.d
    public wc.a a() {
        if (this.f21654u) {
            return this;
        }
        return super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (e().equals(a0Var.e()) && d().equals(a0Var.d()) && g().equals(a0Var.g()) && q.d(c(), a0Var.c())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof wc.h)) {
            return false;
        } else {
            return obj.equals(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public wc.h h() {
        if (!this.f21654u) {
            return (wc.h) super.f();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public int hashCode() {
        return (((e().hashCode() * 31) + d().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        wc.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        return "property " + d() + " (Kotlin reflection is not available)";
    }

    public a0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f21654u = (i10 & 2) == 2;
    }
}
