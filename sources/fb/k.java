package fb;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: TextViewSpan.java */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<TextView> f15582a;

    public k(TextView textView) {
        this.f15582a = new WeakReference<>(textView);
    }

    public static void a(Spannable spannable, TextView textView) {
        k[] kVarArr = (k[]) spannable.getSpans(0, spannable.length(), k.class);
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                spannable.removeSpan(kVar);
            }
        }
        spannable.setSpan(new k(textView), 0, spannable.length(), 18);
    }

    public static TextView c(Spanned spanned) {
        k[] kVarArr = (k[]) spanned.getSpans(0, spanned.length(), k.class);
        if (kVarArr != null && kVarArr.length > 0) {
            return kVarArr[0].b();
        }
        return null;
    }

    public TextView b() {
        return this.f15582a.get();
    }
}
