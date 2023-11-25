package i6;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import i6.d;

/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class p {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(g6.d dVar);
    }

    public static a a() {
        return new d.b().d(g6.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract g6.d d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public p f(g6.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
