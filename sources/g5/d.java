package g5;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Contexts.kt */
/* loaded from: classes.dex */
public final class d {
    public static final Drawable a(Context context, int i10) {
        Drawable b10 = h.a.b(context, i10);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable e10 = androidx.core.content.res.h.e(resources, i10, theme);
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final androidx.lifecycle.p c(Context context) {
        while (!(context instanceof androidx.lifecycle.v)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((androidx.lifecycle.v) context).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            if (Build.VERSION.SDK_INT < 24) {
                String name = xml.getName();
                if (qc.q.d(name, "vector")) {
                    return androidx.vectordrawable.graphics.drawable.j.c(resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
                if (qc.q.d(name, "animated-vector")) {
                    return androidx.vectordrawable.graphics.drawable.e.b(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
            }
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        if (androidx.core.content.a.a(context, str) == 0) {
            return true;
        }
        return false;
    }
}
