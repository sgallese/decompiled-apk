package e8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* compiled from: MoreObjects.java */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: MoreObjects.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f14122a;

        /* renamed from: b  reason: collision with root package name */
        private final C0334b f14123b;

        /* renamed from: c  reason: collision with root package name */
        private C0334b f14124c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14125d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14126e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* loaded from: classes3.dex */
        public static final class a extends C0334b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MoreObjects.java */
        /* renamed from: e8.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0334b {

            /* renamed from: a  reason: collision with root package name */
            String f14127a;

            /* renamed from: b  reason: collision with root package name */
            Object f14128b;

            /* renamed from: c  reason: collision with root package name */
            C0334b f14129c;

            private C0334b() {
            }
        }

        private C0334b c() {
            C0334b c0334b = new C0334b();
            this.f14124c.f14129c = c0334b;
            this.f14124c = c0334b;
            return c0334b;
        }

        private b d(Object obj) {
            c().f14128b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            C0334b c10 = c();
            c10.f14128b = obj;
            c10.f14127a = (String) h.g(str);
            return this;
        }

        private a f() {
            a aVar = new a();
            this.f14124c.f14129c = aVar;
            this.f14124c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a f10 = f();
            f10.f14128b = obj;
            f10.f14127a = (String) h.g(str);
            return this;
        }

        private static boolean i(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof g) {
                    return !((g) obj).a();
                }
                if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
                    return true;
                }
                return false;
            }
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b h(Object obj) {
            return d(obj);
        }

        public String toString() {
            boolean z10 = this.f14125d;
            boolean z11 = this.f14126e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f14122a);
            sb2.append('{');
            String str = "";
            for (C0334b c0334b = this.f14123b.f14129c; c0334b != null; c0334b = c0334b.f14129c) {
                Object obj = c0334b.f14128b;
                if (!(c0334b instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && i(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = c0334b.f14127a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb2.append(obj);
                }
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            C0334b c0334b = new C0334b();
            this.f14123b = c0334b;
            this.f14124c = c0334b;
            this.f14125d = false;
            this.f14126e = false;
            this.f14122a = (String) h.g(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
