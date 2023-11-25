package lc;

import qc.q;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes4.dex */
public class a extends kc.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: lc.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0441a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0441a f19647a = new C0441a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f19648b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        static {
            /*
                lc.a$a r0 = new lc.a$a
                r0.<init>()
                lc.a.C0441a.f19647a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L20
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
            L20:
                r1 = r0
            L21:
                if (r1 == 0) goto L2f
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2b
                r2 = 1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                if (r2 == 0) goto L2f
                r0 = r1
            L2f:
                lc.a.C0441a.f19648b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lc.a.C0441a.<clinit>():void");
        }

        private C0441a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0441a.f19648b;
        if (num != null && num.intValue() < i10) {
            return false;
        }
        return true;
    }

    @Override // kc.a
    public void a(Throwable th, Throwable th2) {
        q.i(th, "cause");
        q.i(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
