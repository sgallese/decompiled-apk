package r8;

import com.google.auto.value.AutoValue;

/* compiled from: StaticSessionData.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class d0 {

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* loaded from: classes3.dex */
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i10, n8.e eVar) {
            return new y(str, str2, str3, str4, i10, eVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract n8.e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* loaded from: classes3.dex */
    public static abstract class b {
        public static b c(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
            return new z(i10, str, i11, j10, j11, z10, i12, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* compiled from: StaticSessionData.java */
    @AutoValue
    /* loaded from: classes3.dex */
    public static abstract class c {
        public static c a(String str, String str2, boolean z10) {
            return new a0(str, str2, z10);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static d0 b(a aVar, c cVar, b bVar) {
        return new x(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
