package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: i  reason: collision with root package name */
    private static w0 f1703i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.h<ColorStateList>> f1705a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.g<String, e> f1706b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.collection.h<String> f1707c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f1708d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1709e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1710f;

    /* renamed from: g  reason: collision with root package name */
    private f f1711g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1702h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1704j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.e.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    j.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(w0 w0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.j.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1706b == null) {
            this.f1706b = new androidx.collection.g<>();
        }
        this.f1706b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1708d.get(context);
            if (eVar == null) {
                eVar = new androidx.collection.e<>();
                this.f1708d.put(context, eVar);
            }
            eVar.k(j10, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1705a == null) {
            this.f1705a = new WeakHashMap<>();
        }
        androidx.collection.h<ColorStateList> hVar = this.f1705a.get(context);
        if (hVar == null) {
            hVar = new androidx.collection.h<>();
            this.f1705a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1710f) {
            return;
        }
        this.f1710f = true;
        Drawable j10 = j(context, j.d.f18492a);
        if (j10 != null && q(j10)) {
            return;
        }
        this.f1710f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        Drawable c10;
        if (this.f1709e == null) {
            this.f1709e = new TypedValue();
        }
        TypedValue typedValue = this.f1709e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1711g;
        if (fVar == null) {
            c10 = null;
        } else {
            c10 = fVar.c(this, context, i10);
        }
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    public static synchronized w0 h() {
        w0 w0Var;
        synchronized (w0.class) {
            if (f1703i == null) {
                w0 w0Var2 = new w0();
                f1703i = w0Var2;
                p(w0Var2);
            }
            w0Var = f1703i;
        }
        return w0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1708d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f10 = eVar.f(j10);
        if (f10 != null) {
            Drawable.ConstantState constantState = f10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.l(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (w0.class) {
            c cVar = f1704j;
            b10 = cVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                cVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList n(Context context, int i10) {
        androidx.collection.h<ColorStateList> hVar;
        WeakHashMap<Context, androidx.collection.h<ColorStateList>> weakHashMap = this.f1705a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.g(i10);
    }

    private static void p(w0 w0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            w0Var.a("vector", new g());
            w0Var.a("animated-vector", new b());
            w0Var.a("animated-selector", new a());
            w0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        if (!(drawable instanceof androidx.vectordrawable.graphics.drawable.j) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    private Drawable r(Context context, int i10) {
        int next;
        androidx.collection.g<String, e> gVar = this.f1706b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        androidx.collection.h<String> hVar = this.f1707c;
        if (hVar != null) {
            String g10 = hVar.g(i10);
            if ("appcompat_skip_skip".equals(g10) || (g10 != null && this.f1706b.get(g10) == null)) {
                return null;
            }
        } else {
            this.f1707c = new androidx.collection.h<>();
        }
        if (this.f1709e == null) {
            this.f1709e = new TypedValue();
        }
        TypedValue typedValue = this.f1709e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f1707c.a(i10, name);
                    e eVar = this.f1706b.get(name);
                    if (eVar != null) {
                        i11 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i11 != null) {
                        i11.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e10, i11);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (i11 == null) {
            this.f1707c.a(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (n0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r10, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 != null) {
                androidx.core.graphics.drawable.a.p(r10, o10);
                return r10;
            }
            return r10;
        }
        f fVar = this.f1711g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, e1 e1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z10;
        int[] state = drawable.getState();
        if (n0.a(drawable)) {
            if (drawable.mutate() == drawable) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = e1Var.f1506d;
        if (!z11 && !e1Var.f1505c) {
            drawable.clearColorFilter();
        } else {
            if (z11) {
                colorStateList = e1Var.f1503a;
            } else {
                colorStateList = null;
            }
            if (e1Var.f1505c) {
                mode = e1Var.f1504b;
            } else {
                mode = f1702h;
            }
            drawable.setColorFilter(g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.e(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            n0.b(r10);
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1711g;
            if (fVar == null) {
                n10 = null;
            } else {
                n10 = fVar.d(context, i10);
            }
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1711g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1708d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, q1 q1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = q1Var.a(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1711g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1711g;
        if (fVar != null && fVar.a(context, i10, drawable)) {
            return true;
        }
        return false;
    }
}
