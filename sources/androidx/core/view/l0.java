package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final PointerIcon f4169a;

    /* compiled from: PointerIconCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private l0(PointerIcon pointerIcon) {
        this.f4169a = pointerIcon;
    }

    public static l0 b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new l0(a.b(context, i10));
        }
        return new l0(null);
    }

    public Object a() {
        return this.f4169a;
    }
}
