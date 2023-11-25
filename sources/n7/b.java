package n7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: RippleUtils.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20271a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f20272b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f20273c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f20274d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f20275e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f20276f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f20277g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f20278h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f20279i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f20280j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f20281k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f20282l = b.class.getSimpleName();

    /* compiled from: RippleUtils.java */
    /* loaded from: classes3.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(d7.a.f(context, v6.b.f24641k, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10));
        }
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f20271a) {
            int[] iArr = f20274d;
            return new ColorStateList(new int[][]{f20280j, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, f20276f), d(colorStateList, iArr), d(colorStateList, f20272b)});
        }
        int[] iArr2 = f20276f;
        int[] iArr3 = f20277g;
        int[] iArr4 = f20278h;
        int[] iArr5 = f20279i;
        int[] iArr6 = f20272b;
        int[] iArr7 = f20273c;
        int[] iArr8 = f20274d;
        int[] iArr9 = f20275e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f20280j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{d(colorStateList, iArr2), d(colorStateList, iArr3), d(colorStateList, iArr4), d(colorStateList, iArr5), 0, d(colorStateList, iArr6), d(colorStateList, iArr7), d(colorStateList, iArr8), d(colorStateList, iArr9), 0});
    }

    public static Drawable b(Context context, int i10) {
        return a.b(context, i10);
    }

    @TargetApi(21)
    private static int c(int i10) {
        return androidx.core.graphics.a.k(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    private static int d(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        if (f20271a) {
            return c(i10);
        }
        return i10;
    }

    public static ColorStateList e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f20281k, 0)) != 0) {
                Log.w(f20282l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean f(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
