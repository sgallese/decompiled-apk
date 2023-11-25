package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1576a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1577b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1578c = new Rect();

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f1579a;

        /* renamed from: b  reason: collision with root package name */
        private static final Method f1580b;

        /* renamed from: c  reason: collision with root package name */
        private static final Field f1581c;

        /* renamed from: d  reason: collision with root package name */
        private static final Field f1582d;

        /* renamed from: e  reason: collision with root package name */
        private static final Field f1583e;

        /* renamed from: f  reason: collision with root package name */
        private static final Field f1584f;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L44 java.lang.ClassNotFoundException -> L49 java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L41
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L32 java.lang.ClassNotFoundException -> L35 java.lang.NoSuchMethodException -> L38
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2d
                r8 = 1
                goto L55
            L2d:
                goto L53
            L2f:
                r7 = r1
                goto L53
            L32:
                r6 = r1
                goto L52
            L35:
                r6 = r1
                goto L52
            L38:
                r6 = r1
                goto L52
            L3b:
                r5 = r1
                goto L47
            L3e:
                r5 = r1
                goto L4c
            L41:
                r5 = r1
                goto L51
            L44:
                r4 = r1
                r5 = r4
            L47:
                r6 = r5
                goto L52
            L49:
                r4 = r1
                r5 = r4
            L4c:
                r6 = r5
                goto L52
            L4e:
                r4 = r1
                r5 = r4
            L51:
                r6 = r5
            L52:
                r7 = r6
            L53:
                r3 = r1
                r8 = 0
            L55:
                if (r8 == 0) goto L64
                androidx.appcompat.widget.n0.a.f1580b = r4
                androidx.appcompat.widget.n0.a.f1581c = r5
                androidx.appcompat.widget.n0.a.f1582d = r6
                androidx.appcompat.widget.n0.a.f1583e = r7
                androidx.appcompat.widget.n0.a.f1584f = r3
                androidx.appcompat.widget.n0.a.f1579a = r0
                goto L70
            L64:
                androidx.appcompat.widget.n0.a.f1580b = r1
                androidx.appcompat.widget.n0.a.f1581c = r1
                androidx.appcompat.widget.n0.a.f1582d = r1
                androidx.appcompat.widget.n0.a.f1583e = r1
                androidx.appcompat.widget.n0.a.f1584f = r1
                androidx.appcompat.widget.n0.a.f1579a = r2
            L70:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1579a) {
                try {
                    Object invoke = f1580b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1581c.getInt(invoke), f1582d.getInt(invoke), f1583e.getInt(invoke), f1584f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return n0.f1578c;
        }
    }

    /* compiled from: DrawableUtils.java */
    /* loaded from: classes.dex */
    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1577b);
        } else {
            drawable.setState(f1576a);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a10 = b.a(drawable);
            i10 = a10.left;
            i11 = a10.top;
            i12 = a10.right;
            i13 = a10.bottom;
            return new Rect(i10, i11, i12, i13);
        }
        return a.a(androidx.core.graphics.drawable.a.q(drawable));
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
