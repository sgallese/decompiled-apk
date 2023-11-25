package r8;

import r8.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes3.dex */
public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0.a f22514a;

    /* renamed from: b  reason: collision with root package name */
    private final d0.c f22515b;

    /* renamed from: c  reason: collision with root package name */
    private final d0.b f22516c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(d0.a aVar, d0.c cVar, d0.b bVar) {
        if (aVar != null) {
            this.f22514a = aVar;
            if (cVar != null) {
                this.f22515b = cVar;
                if (bVar != null) {
                    this.f22516c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // r8.d0
    public d0.a a() {
        return this.f22514a;
    }

    @Override // r8.d0
    public d0.b c() {
        return this.f22516c;
    }

    @Override // r8.d0
    public d0.c d() {
        return this.f22515b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f22514a.equals(d0Var.a()) && this.f22515b.equals(d0Var.d()) && this.f22516c.equals(d0Var.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22514a.hashCode() ^ 1000003) * 1000003) ^ this.f22515b.hashCode()) * 1000003) ^ this.f22516c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f22514a + ", osData=" + this.f22515b + ", deviceData=" + this.f22516c + "}";
    }
}
