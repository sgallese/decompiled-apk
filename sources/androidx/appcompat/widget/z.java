package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class z {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1721a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1722b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* loaded from: classes.dex */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(TextView textView) {
        this.f1721a = (TextView) androidx.core.util.i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1722b;
        if (textClassifier == null) {
            return a.a(this.f1721a);
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1722b = textClassifier;
    }
}
