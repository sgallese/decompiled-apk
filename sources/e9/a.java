package e9;

import e9.d;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f14130a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f14131b = d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: e9.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0335a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f14132a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f14133b;

        C0335a(int i10, d.a aVar) {
            this.f14132a = i10;
            this.f14133b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f14132a == dVar.tag() && this.f14133b.equals(dVar.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f14132a) + (this.f14133b.hashCode() ^ 2041407134);
        }

        @Override // e9.d
        public d.a intEncoding() {
            return this.f14133b;
        }

        @Override // e9.d
        public int tag() {
            return this.f14132a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14132a + "intEncoding=" + this.f14133b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0335a(this.f14130a, this.f14131b);
    }

    public a c(int i10) {
        this.f14130a = i10;
        return this;
    }
}
