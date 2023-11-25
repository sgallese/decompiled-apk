package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1519a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1520b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1521c;

    private g1(Context context, TypedArray typedArray) {
        this.f1519a = context;
        this.f1520b = typedArray;
    }

    public static g1 t(Context context, int i10, int[] iArr) {
        return new g1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static g1 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g1 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new g1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1520b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1520b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        if (this.f1520b.hasValue(i10) && (resourceId = this.f1520b.getResourceId(i10, 0)) != 0 && (a10 = h.a.a(this.f1519a, resourceId)) != null) {
            return a10;
        }
        return this.f1520b.getColorStateList(i10);
    }

    public float d(int i10, float f10) {
        return this.f1520b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1520b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1520b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (this.f1520b.hasValue(i10) && (resourceId = this.f1520b.getResourceId(i10, 0)) != 0) {
            return h.a.b(this.f1519a, resourceId);
        }
        return this.f1520b.getDrawable(i10);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (this.f1520b.hasValue(i10) && (resourceId = this.f1520b.getResourceId(i10, 0)) != 0) {
            return j.b().d(this.f1519a, resourceId, true);
        }
        return null;
    }

    public float i(int i10, float f10) {
        return this.f1520b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f1520b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1521c == null) {
            this.f1521c = new TypedValue();
        }
        return androidx.core.content.res.h.h(this.f1519a, resourceId, this.f1521c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f1520b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1520b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1520b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1520b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1520b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1520b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1520b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1520b;
    }

    public boolean s(int i10) {
        return this.f1520b.hasValue(i10);
    }

    public void w() {
        this.f1520b.recycle();
    }
}
