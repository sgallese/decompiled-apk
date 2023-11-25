package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.List;
import v1.d;

/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class n {
    public static final v1.d a(CharSequence charSequence) {
        int P;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new v1.d(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        qc.q.h(annotationArr, "annotations");
        P = ec.p.P(annotationArr);
        if (P >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (qc.q.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    qc.q.h(value, "span.value");
                    arrayList.add(new d.b(new a1(value).k(), spanStart, spanEnd));
                }
                if (i10 == P) {
                    break;
                }
                i10++;
            }
        }
        return new v1.d(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(v1.d dVar) {
        qc.q.i(dVar, "<this>");
        if (dVar.f().isEmpty()) {
            return dVar.i();
        }
        SpannableString spannableString = new SpannableString(dVar.i());
        f1 f1Var = new f1();
        List<d.b<v1.b0>> f10 = dVar.f();
        int size = f10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<v1.b0> bVar = f10.get(i10);
            v1.b0 a10 = bVar.a();
            int b10 = bVar.b();
            int c10 = bVar.c();
            f1Var.q();
            f1Var.i(a10);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", f1Var.p()), b10, c10, 33);
        }
        return spannableString;
    }
}
