package a2;

import android.graphics.Typeface;

/* compiled from: AndroidFontUtils.android.kt */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f338a = new w0();

    private w0() {
    }

    public final Typeface a(Typeface typeface, int i10, boolean z10) {
        Typeface create;
        qc.q.i(typeface, "typeface");
        create = Typeface.create(typeface, i10, z10);
        qc.q.h(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
