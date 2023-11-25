package j6;

import j6.f;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<i6.i> f19031a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f19032b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* loaded from: classes.dex */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<i6.i> f19033a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f19034b;

        @Override // j6.f.a
        public f a() {
            String str = "";
            if (this.f19033a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f19033a, this.f19034b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j6.f.a
        public f.a b(Iterable<i6.i> iterable) {
            if (iterable != null) {
                this.f19033a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // j6.f.a
        public f.a c(byte[] bArr) {
            this.f19034b = bArr;
            return this;
        }
    }

    @Override // j6.f
    public Iterable<i6.i> b() {
        return this.f19031a;
    }

    @Override // j6.f
    public byte[] c() {
        return this.f19032b;
    }

    public boolean equals(Object obj) {
        byte[] c10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f19031a.equals(fVar.b())) {
            byte[] bArr = this.f19032b;
            if (fVar instanceof a) {
                c10 = ((a) fVar).f19032b;
            } else {
                c10 = fVar.c();
            }
            if (Arrays.equals(bArr, c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19031a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19032b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f19031a + ", extras=" + Arrays.toString(this.f19032b) + "}";
    }

    private a(Iterable<i6.i> iterable, byte[] bArr) {
        this.f19031a = iterable;
        this.f19032b = bArr;
    }
}
