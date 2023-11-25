package f1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.d;
import androidx.core.content.res.l;
import org.xmlpull.v1.XmlPullParser;
import qc.h;
import qc.q;

/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f15398a;

    /* renamed from: b  reason: collision with root package name */
    private int f15399b;

    public a(XmlPullParser xmlPullParser, int i10) {
        q.i(xmlPullParser, "xmlParser");
        this.f15398a = xmlPullParser;
        this.f15399b = i10;
    }

    private final void l(int i10) {
        this.f15399b = i10 | this.f15399b;
    }

    public final float a(TypedArray typedArray, int i10, float f10) {
        q.i(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i10, f10);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i10, float f10) {
        q.i(typedArray, "typedArray");
        float f11 = typedArray.getFloat(i10, f10);
        l(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int c(TypedArray typedArray, int i10, int i11) {
        q.i(typedArray, "typedArray");
        int i12 = typedArray.getInt(i10, i11);
        l(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean d(TypedArray typedArray, String str, int i10, boolean z10) {
        q.i(typedArray, "typedArray");
        q.i(str, "attrName");
        boolean e10 = l.e(typedArray, this.f15398a, str, i10, z10);
        l(typedArray.getChangingConfigurations());
        return e10;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        q.i(typedArray, "typedArray");
        q.i(str, "attrName");
        ColorStateList g10 = l.g(typedArray, this.f15398a, theme, str, i10);
        l(typedArray.getChangingConfigurations());
        return g10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (q.d(this.f15398a, aVar.f15398a) && this.f15399b == aVar.f15399b) {
            return true;
        }
        return false;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String str, int i10, int i11) {
        q.i(typedArray, "typedArray");
        q.i(str, "attrName");
        d i12 = l.i(typedArray, this.f15398a, theme, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        q.h(i12, "result");
        return i12;
    }

    public final float g(TypedArray typedArray, String str, int i10, float f10) {
        q.i(typedArray, "typedArray");
        q.i(str, "attrName");
        float j10 = l.j(typedArray, this.f15398a, str, i10, f10);
        l(typedArray.getChangingConfigurations());
        return j10;
    }

    public final int h(TypedArray typedArray, String str, int i10, int i11) {
        q.i(typedArray, "typedArray");
        q.i(str, "attrName");
        int k10 = l.k(typedArray, this.f15398a, str, i10, i11);
        l(typedArray.getChangingConfigurations());
        return k10;
    }

    public int hashCode() {
        return (this.f15398a.hashCode() * 31) + this.f15399b;
    }

    public final String i(TypedArray typedArray, int i10) {
        q.i(typedArray, "typedArray");
        String string = typedArray.getString(i10);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f15398a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        q.i(resources, "res");
        q.i(attributeSet, "set");
        q.i(iArr, "attrs");
        TypedArray s10 = l.s(resources, theme, attributeSet, iArr);
        q.h(s10, "obtainAttributes(\n      …          attrs\n        )");
        l(s10.getChangingConfigurations());
        return s10;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f15398a + ", config=" + this.f15399b + ')';
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, h hVar) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
