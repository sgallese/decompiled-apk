package g2;

import a1.e1;
import a1.p1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f16018b;

    public /* synthetic */ d(long j10, qc.h hVar) {
        this(j10);
    }

    @Override // g2.o
    public /* synthetic */ o a(pc.a aVar) {
        return n.b(this, aVar);
    }

    @Override // g2.o
    public e1 b() {
        return null;
    }

    @Override // g2.o
    public /* synthetic */ o c(o oVar) {
        return n.a(this, oVar);
    }

    @Override // g2.o
    public float d() {
        return p1.r(e());
    }

    @Override // g2.o
    public long e() {
        return this.f16018b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && p1.q(this.f16018b, ((d) obj).f16018b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return p1.w(this.f16018b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) p1.x(this.f16018b)) + ')';
    }

    private d(long j10) {
        this.f16018b = j10;
        if (!(j10 != p1.f146b.e())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
