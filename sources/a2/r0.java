package a2;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f321a = new r0();

    private r0() {
    }

    public final Typeface a(Context context, p0 p0Var) {
        Typeface font;
        qc.q.i(context, "context");
        qc.q.i(p0Var, "font");
        font = context.getResources().getFont(p0Var.d());
        qc.q.h(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
