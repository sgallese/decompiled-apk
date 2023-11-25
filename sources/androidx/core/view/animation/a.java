package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: PathInterpolatorCompat.java */
    /* renamed from: androidx.core.view.animation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0079a {
        static Interpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        static Interpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0079a.b(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0079a.c(path);
    }
}
