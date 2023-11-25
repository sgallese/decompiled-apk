package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1453a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1454b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1455c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1456d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1457e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1458f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f1459g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f1460h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f1461i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1462j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g.j.f15955y0);
        try {
            if (!obtainStyledAttributes.hasValue(g.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList e10 = e(context, i10);
        if (e10 != null && e10.isStateful()) {
            return e10.getColorForState(f1454b, e10.getDefaultColor());
        }
        TypedValue f10 = f();
        context.getTheme().resolveAttribute(16842803, f10, true);
        return d(context, i10, f10.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1462j;
        iArr[0] = i10;
        g1 u10 = g1.u(context, null, iArr);
        try {
            return u10.b(0, 0);
        } finally {
            u10.w();
        }
    }

    static int d(Context context, int i10, float f10) {
        return androidx.core.graphics.a.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f1462j;
        iArr[0] = i10;
        g1 u10 = g1.u(context, null, iArr);
        try {
            return u10.c(0);
        } finally {
            u10.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f1453a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}