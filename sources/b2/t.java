package b2;

import android.view.inputmethod.ExtractedText;

/* compiled from: InputState.android.kt */
/* loaded from: classes.dex */
public final class t {
    public static final ExtractedText a(j0 j0Var) {
        boolean J;
        qc.q.i(j0Var, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = j0Var.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = j0Var.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = v1.i0.l(j0Var.g());
        extractedText.selectionEnd = v1.i0.k(j0Var.g());
        J = yc.w.J(j0Var.h(), '\n', false, 2, null);
        extractedText.flags = !J ? 1 : 0;
        return extractedText;
    }
}
