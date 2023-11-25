package r8;

import java.util.Arrays;
import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes3.dex */
final class g extends b0.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f22361a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f22362b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f22363a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f22364b;

        @Override // r8.b0.d.b.a
        public b0.d.b a() {
            String str = "";
            if (this.f22363a == null) {
                str = " filename";
            }
            if (this.f22364b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f22363a, this.f22364b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.d.b.a
        public b0.d.b.a b(byte[] bArr) {
            if (bArr != null) {
                this.f22364b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // r8.b0.d.b.a
        public b0.d.b.a c(String str) {
            if (str != null) {
                this.f22363a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // r8.b0.d.b
    public byte[] b() {
        return this.f22362b;
    }

    @Override // r8.b0.d.b
    public String c() {
        return this.f22361a;
    }

    public boolean equals(Object obj) {
        byte[] b10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d.b)) {
            return false;
        }
        b0.d.b bVar = (b0.d.b) obj;
        if (this.f22361a.equals(bVar.c())) {
            byte[] bArr = this.f22362b;
            if (bVar instanceof g) {
                b10 = ((g) bVar).f22362b;
            } else {
                b10 = bVar.b();
            }
            if (Arrays.equals(bArr, b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22361a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22362b);
    }

    public String toString() {
        return "File{filename=" + this.f22361a + ", contents=" + Arrays.toString(this.f22362b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f22361a = str;
        this.f22362b = bArr;
    }
}
