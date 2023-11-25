package m7;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: TypefaceUtils.java */
/* loaded from: classes3.dex */
public class h {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE) {
                i11 = configuration.fontWeightAdjustment;
                if (i11 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i12 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, t2.a.b(weight + i12, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
