package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: AnimationUtilsCompat.java */
/* loaded from: classes.dex */
public class f {
    public static Interpolator a(Context context, int i10) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i10);
    }
}
