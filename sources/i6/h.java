package i6;

import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final g6.b f17078a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f17079b;

    public h(g6.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f17078a = bVar;
                this.f17079b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f17079b;
    }

    public g6.b b() {
        return this.f17078a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f17078a.equals(hVar.f17078a)) {
            return false;
        }
        return Arrays.equals(this.f17079b, hVar.f17079b);
    }

    public int hashCode() {
        return ((this.f17078a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17079b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f17078a + ", bytes=[...]}";
    }
}
