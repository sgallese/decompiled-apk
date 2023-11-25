package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f1475l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f1476m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f1477n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f1478a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1479b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1480c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1481d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1482e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1483f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1484g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1485h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1486i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1487j;

    /* renamed from: k  reason: collision with root package name */
    private final f f1488k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.c0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) c0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.c0.d, androidx.appcompat.widget.c0.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.c0.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(TextView textView) {
        this.f1486i = textView;
        this.f1487j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f1488k = new e();
        } else if (i10 >= 23) {
            this.f1488k = new d();
        } else {
            this.f1488k = new f();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1478a = 0;
        this.f1481d = -1.0f;
        this.f1482e = -1.0f;
        this.f1480c = -1.0f;
        this.f1483f = new int[0];
        this.f1479b = false;
    }

    private int e(RectF rectF) {
        int length = this.f1483f.length;
        if (length != 0) {
            int i10 = 1;
            int i11 = length - 1;
            int i12 = 0;
            while (i10 <= i11) {
                int i13 = (i10 + i11) / 2;
                if (x(this.f1483f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i10;
                    i10 = i14;
                } else {
                    i12 = i13 - 1;
                    i11 = i12;
                }
            }
            return this.f1483f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String str) {
        try {
            Method method = f1476m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1476m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static <T> T m(Object obj, String str, T t10) {
        try {
            return (T) k(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private void s(float f10) {
        if (f10 != this.f1486i.getPaint().getTextSize()) {
            this.f1486i.getPaint().setTextSize(f10);
            boolean a10 = b.a(this.f1486i);
            if (this.f1486i.getLayout() != null) {
                this.f1479b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f1486i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    this.f1486i.requestLayout();
                } else {
                    this.f1486i.forceLayout();
                }
                this.f1486i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f1478a == 1) {
            if (!this.f1484g || this.f1483f.length == 0) {
                int floor = ((int) Math.floor((this.f1482e - this.f1481d) / this.f1480c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1481d + (i10 * this.f1480c));
                }
                this.f1483f = b(iArr);
            }
            this.f1479b = true;
        } else {
            this.f1479b = false;
        }
        return this.f1479b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1483f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z10;
        if (this.f1483f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1484g = z10;
        if (z10) {
            this.f1478a = 1;
            this.f1481d = r0[0];
            this.f1482e = r0[r1 - 1];
            this.f1480c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1486i.getText();
        TransformationMethod transformationMethod = this.f1486i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1486i)) != null) {
            text = transformation;
        }
        int b10 = a.b(this.f1486i);
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f1486i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10);
        if ((b10 != -1 && (d10.getLineCount() > b10 || d10.getLineEnd(d10.getLineCount() - 1) != text.length())) || d10.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    private boolean y() {
        return !(this.f1486i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f1478a = 1;
                    this.f1481d = f10;
                    this.f1482e = f11;
                    this.f1480c = f12;
                    this.f1484g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int measuredWidth;
        if (!n()) {
            return;
        }
        if (this.f1479b) {
            if (this.f1486i.getMeasuredHeight() > 0 && this.f1486i.getMeasuredWidth() > 0) {
                if (this.f1488k.b(this.f1486i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f1486i.getMeasuredWidth() - this.f1486i.getTotalPaddingLeft()) - this.f1486i.getTotalPaddingRight();
                }
                int height = (this.f1486i.getHeight() - this.f1486i.getCompoundPaddingBottom()) - this.f1486i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1475l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e10 = e(rectF);
                        if (e10 != this.f1486i.getTextSize()) {
                            t(0, e10);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1479b = true;
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(charSequence, alignment, i10, i11, this.f1486i, this.f1485h, this.f1488k);
        }
        return a.a(charSequence, alignment, i10, this.f1486i, this.f1485h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f1482e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f1481d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1480c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] i() {
        return this.f1483f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f1478a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f1485h;
        if (textPaint == null) {
            this.f1485h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1485h.set(this.f1486i.getPaint());
        this.f1485h.setTextSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        if (y() && this.f1478a != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i10) {
        float f10;
        float f11;
        float f12;
        int resourceId;
        Context context = this.f1487j;
        int[] iArr = g.j.f15865g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1486i;
        androidx.core.view.p0.s0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = g.j.f15890l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1478a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = g.j.f15885k0;
        if (obtainStyledAttributes.hasValue(i12)) {
            f10 = obtainStyledAttributes.getDimension(i12, -1.0f);
        } else {
            f10 = -1.0f;
        }
        int i13 = g.j.f15875i0;
        if (obtainStyledAttributes.hasValue(i13)) {
            f11 = obtainStyledAttributes.getDimension(i13, -1.0f);
        } else {
            f11 = -1.0f;
        }
        int i14 = g.j.f15870h0;
        if (obtainStyledAttributes.hasValue(i14)) {
            f12 = obtainStyledAttributes.getDimension(i14, -1.0f);
        } else {
            f12 = -1.0f;
        }
        int i15 = g.j.f15880j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (y()) {
            if (this.f1478a == 1) {
                if (!this.f1484g) {
                    DisplayMetrics displayMetrics = this.f1487j.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    z(f11, f12, f10);
                }
                u();
                return;
            }
            return;
        }
        this.f1478a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1487j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int[] iArr, int i10) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1487j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f1483f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1484g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i10) {
        if (y()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = this.f1487j.getResources().getDisplayMetrics();
                    z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (u()) {
                        a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10, float f10) {
        Resources resources;
        Context context = this.f1487j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        s(TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        f() {
        }

        boolean b(TextView textView) {
            return ((Boolean) c0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
