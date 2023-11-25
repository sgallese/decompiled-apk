package m7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.g1;

/* compiled from: MaterialResources.java */
/* loaded from: classes3.dex */
public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList a10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a10 = h.a.a(context, resourceId)) != null) {
            return a10;
        }
        return typedArray.getColorStateList(i10);
    }

    public static ColorStateList b(Context context, g1 g1Var, int i10) {
        int n10;
        ColorStateList a10;
        if (g1Var.s(i10) && (n10 = g1Var.n(i10, 0)) != 0 && (a10 = h.a.a(context, n10)) != null) {
            return a10;
        }
        return g1Var.c(i10);
    }

    public static int c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable b10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (b10 = h.a.b(context, resourceId)) != null) {
            return b10;
        }
        return typedArray.getDrawable(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(TypedArray typedArray, int i10, int i11) {
        if (typedArray.hasValue(i10)) {
            return i10;
        }
        return i11;
    }

    public static d f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return new d(context, resourceId);
        }
        return null;
    }

    public static boolean g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
