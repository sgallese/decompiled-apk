package w1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class p0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25317a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static boolean f25318b;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor<StaticLayout> f25319c;

    /* compiled from: StaticLayoutFactory.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (p0.f25318b) {
                return p0.f25319c;
            }
            p0.f25318b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                p0.f25319c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                p0.f25319c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return p0.f25319c;
        }
    }

    @Override // w1.q0
    public boolean a(StaticLayout staticLayout, boolean z10) {
        qc.q.i(staticLayout, "layout");
        return false;
    }

    @Override // w1.q0
    public StaticLayout b(r0 r0Var) {
        qc.q.i(r0Var, "params");
        Constructor b10 = f25317a.b();
        StaticLayout staticLayout = null;
        if (b10 != null) {
            try {
                staticLayout = (StaticLayout) b10.newInstance(r0Var.r(), Integer.valueOf(r0Var.q()), Integer.valueOf(r0Var.e()), r0Var.o(), Integer.valueOf(r0Var.u()), r0Var.a(), r0Var.s(), Float.valueOf(r0Var.m()), Float.valueOf(r0Var.l()), Boolean.valueOf(r0Var.g()), r0Var.c(), Integer.valueOf(r0Var.d()), Integer.valueOf(r0Var.n()));
            } catch (IllegalAccessException unused) {
                f25319c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f25319c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f25319c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(r0Var.r(), r0Var.q(), r0Var.e(), r0Var.o(), r0Var.u(), r0Var.a(), r0Var.m(), r0Var.l(), r0Var.g(), r0Var.c(), r0Var.d());
    }
}
