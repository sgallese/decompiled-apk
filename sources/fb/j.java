package fb;

import android.text.Layout;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* compiled from: TextLayoutSpan.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Layout> f15581a;

    public static Layout b(Spanned spanned) {
        j[] jVarArr = (j[]) spanned.getSpans(0, spanned.length(), j.class);
        if (jVarArr != null && jVarArr.length > 0) {
            return jVarArr[0].a();
        }
        return null;
    }

    public Layout a() {
        return this.f15581a.get();
    }
}
