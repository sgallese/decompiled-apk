package d3;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private final TransformationMethod f13122a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TransformationMethod transformationMethod) {
        this.f13122a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f13122a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13122a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.f.c().g() == 1) {
            return androidx.emoji2.text.f.c().r(charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f13122a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
