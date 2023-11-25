package h6;

import com.google.auto.value.AutoValue;
import h6.e;

/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(h6.a aVar);

        public abstract a c(b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract h6.a b();

    public abstract b c();
}
