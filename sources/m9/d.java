package m9;

import com.google.auto.value.AutoValue;
import m9.a;

/* compiled from: InstallationResponse.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: InstallationResponse.java */
    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract d a();

        public abstract a b(f fVar);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* compiled from: InstallationResponse.java */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new a.b();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
