package r8;

import r8.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes3.dex */
public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f22523a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22524b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22525c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22526d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22527e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f22528f;

    /* renamed from: g  reason: collision with root package name */
    private final int f22529g;

    /* renamed from: h  reason: collision with root package name */
    private final String f22530h;

    /* renamed from: i  reason: collision with root package name */
    private final String f22531i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f22523a = i10;
        if (str != null) {
            this.f22524b = str;
            this.f22525c = i11;
            this.f22526d = j10;
            this.f22527e = j11;
            this.f22528f = z10;
            this.f22529g = i12;
            if (str2 != null) {
                this.f22530h = str2;
                if (str3 != null) {
                    this.f22531i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // r8.d0.b
    public int a() {
        return this.f22523a;
    }

    @Override // r8.d0.b
    public int b() {
        return this.f22525c;
    }

    @Override // r8.d0.b
    public long d() {
        return this.f22527e;
    }

    @Override // r8.d0.b
    public boolean e() {
        return this.f22528f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        if (this.f22523a == bVar.a() && this.f22524b.equals(bVar.g()) && this.f22525c == bVar.b() && this.f22526d == bVar.j() && this.f22527e == bVar.d() && this.f22528f == bVar.e() && this.f22529g == bVar.i() && this.f22530h.equals(bVar.f()) && this.f22531i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // r8.d0.b
    public String f() {
        return this.f22530h;
    }

    @Override // r8.d0.b
    public String g() {
        return this.f22524b;
    }

    @Override // r8.d0.b
    public String h() {
        return this.f22531i;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f22523a ^ 1000003) * 1000003) ^ this.f22524b.hashCode()) * 1000003) ^ this.f22525c) * 1000003;
        long j10 = this.f22526d;
        int i11 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22527e;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f22528f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f22529g) * 1000003) ^ this.f22530h.hashCode()) * 1000003) ^ this.f22531i.hashCode();
    }

    @Override // r8.d0.b
    public int i() {
        return this.f22529g;
    }

    @Override // r8.d0.b
    public long j() {
        return this.f22526d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f22523a + ", model=" + this.f22524b + ", availableProcessors=" + this.f22525c + ", totalRam=" + this.f22526d + ", diskSpace=" + this.f22527e + ", isEmulator=" + this.f22528f + ", state=" + this.f22529g + ", manufacturer=" + this.f22530h + ", modelClass=" + this.f22531i + "}";
    }
}
