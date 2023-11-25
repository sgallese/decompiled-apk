package mc;

import tc.c;

/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: classes4.dex */
public class a extends lc.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: mc.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0448a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0448a f19859a = new C0448a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f19860b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        static {
            /*
                mc.a$a r0 = new mc.a$a
                r0.<init>()
                mc.a.C0448a.f19859a = r0
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
                mc.a.C0448a.f19860b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mc.a.C0448a.<clinit>():void");
        }

        private C0448a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0448a.f19860b;
        if (num != null && num.intValue() < i10) {
            return false;
        }
        return true;
    }

    @Override // kc.a
    public c b() {
        if (c(34)) {
            return new uc.a();
        }
        return super.b();
    }
}
