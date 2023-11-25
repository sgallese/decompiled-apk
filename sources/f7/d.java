package f7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableUtils.java */
/* loaded from: classes3.dex */
public final class d {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() != -1 && drawable2.getIntrinsicHeight() != -1) {
            if (drawable2.getIntrinsicWidth() <= drawable.getIntrinsicWidth() && drawable2.getIntrinsicHeight() <= drawable.getIntrinsicHeight()) {
                intrinsicWidth = drawable2.getIntrinsicWidth();
                intrinsicHeight = drawable2.getIntrinsicHeight();
            } else {
                float intrinsicWidth2 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
                if (intrinsicWidth2 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                    int intrinsicWidth3 = drawable.getIntrinsicWidth();
                    int i10 = (int) (intrinsicWidth3 / intrinsicWidth2);
                    intrinsicWidth = intrinsicWidth3;
                    intrinsicHeight = i10;
                } else {
                    intrinsicHeight = drawable.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                }
            }
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
        } else {
            int intrinsicWidth4 = (drawable.getIntrinsicWidth() - intrinsicWidth) / 2;
            int intrinsicHeight2 = (drawable.getIntrinsicHeight() - intrinsicHeight) / 2;
            layerDrawable.setLayerInset(1, intrinsicWidth4, intrinsicHeight2, intrinsicWidth4, intrinsicHeight2);
        }
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        return c(drawable, colorStateList, mode, z10);
    }

    private static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        } else if (z10) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] d(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static AttributeSet e(Context context, int i10, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e10) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
            notFoundException.initCause(e10);
            throw notFoundException;
        }
    }

    public static void f(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static void g(Drawable drawable, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT == 21) {
            if (z10) {
                drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter(null);
            }
        } else if (z10) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            androidx.core.graphics.drawable.a.o(drawable, null);
        }
    }

    public static PorterDuffColorFilter h(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}
