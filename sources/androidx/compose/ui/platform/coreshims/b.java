package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

/* compiled from: AutofillIdCompat.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2624a;

    private b(AutofillId autofillId) {
        this.f2624a = autofillId;
    }

    public static b b(AutofillId autofillId) {
        return new b(autofillId);
    }

    public AutofillId a() {
        return a.a(this.f2624a);
    }
}
