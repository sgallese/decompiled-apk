package j6;

import android.content.Context;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f19037a;

    /* renamed from: b  reason: collision with root package name */
    private final s6.a f19038b;

    /* renamed from: c  reason: collision with root package name */
    private final s6.a f19039c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19040d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, s6.a aVar, s6.a aVar2, String str) {
        if (context != null) {
            this.f19037a = context;
            if (aVar != null) {
                this.f19038b = aVar;
                if (aVar2 != null) {
                    this.f19039c = aVar2;
                    if (str != null) {
                        this.f19040d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // j6.h
    public Context b() {
        return this.f19037a;
    }

    @Override // j6.h
    public String c() {
        return this.f19040d;
    }

    @Override // j6.h
    public s6.a d() {
        return this.f19039c;
    }

    @Override // j6.h
    public s6.a e() {
        return this.f19038b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f19037a.equals(hVar.b()) && this.f19038b.equals(hVar.e()) && this.f19039c.equals(hVar.d()) && this.f19040d.equals(hVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f19037a.hashCode() ^ 1000003) * 1000003) ^ this.f19038b.hashCode()) * 1000003) ^ this.f19039c.hashCode()) * 1000003) ^ this.f19040d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f19037a + ", wallClock=" + this.f19038b + ", monotonicClock=" + this.f19039c + ", backendName=" + this.f19040d + "}";
    }
}
