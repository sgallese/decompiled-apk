package d2;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
/* loaded from: classes.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f13082a = new l();

    private l() {
    }

    public final TypefaceSpan a(Typeface typeface) {
        qc.q.i(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
