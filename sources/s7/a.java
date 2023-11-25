package s7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import v6.b;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f23037a = {16842752, b.f24637h0};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f23038b = {b.D};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23037a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    private static int b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23038b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        int b10 = b(context, attributeSet, i10, i11);
        if ((context instanceof d) && ((d) context).c() == b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b10 != 0 && !z10) {
            d dVar = new d(context, b10);
            int a10 = a(context, attributeSet);
            if (a10 != 0) {
                dVar.getTheme().applyStyle(a10, true);
            }
            return dVar;
        }
        return context;
    }
}
