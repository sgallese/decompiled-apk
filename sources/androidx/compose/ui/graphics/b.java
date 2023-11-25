package androidx.compose.ui.graphics;

import qc.h;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2438a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f2439b = d(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f2440c = d(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f2441d = d(2);

    /* compiled from: GraphicsLayerModifier.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final int a() {
            return b.f2439b;
        }

        public final int b() {
            return b.f2441d;
        }

        public final int c() {
            return b.f2440c;
        }
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String g(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }

    public static int d(int i10) {
        return i10;
    }

    public static int f(int i10) {
        return i10;
    }
}
