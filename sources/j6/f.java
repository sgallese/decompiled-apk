package j6;

import com.google.auto.value.AutoValue;
import j6.a;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<i6.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<i6.i> b();

    public abstract byte[] c();
}
