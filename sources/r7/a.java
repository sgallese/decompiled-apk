package r7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.b0;
import m7.b;
import m7.c;
import v6.l;

/* compiled from: MaterialTextView.java */
/* loaded from: classes3.dex */
public class a extends b0 {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void c(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, l.R4);
        int i11 = i(getContext(), obtainStyledAttributes, l.T4, l.U4);
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    private static boolean f(Context context) {
        return b.b(context, v6.b.f24631e0, true);
    }

    private static int g(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.V4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(l.W4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void h(AttributeSet attributeSet, int i10, int i11) {
        int g10;
        Context context = getContext();
        if (f(context)) {
            Resources.Theme theme = context.getTheme();
            if (!j(context, theme, attributeSet, i10, i11) && (g10 = g(theme, attributeSet, i10, i11)) != -1) {
                c(theme, g10);
            }
        }
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.V4, i10, i11);
        int i12 = i(context, obtainStyledAttributes, l.X4, l.Y4);
        obtainStyledAttributes.recycle();
        if (i12 != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.b0, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (f(context)) {
            c(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(s7.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        h(attributeSet, i10, 0);
    }
}
