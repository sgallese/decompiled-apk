package x1;

import java.util.Locale;
import qc.q;

/* compiled from: WordBoundary.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f25699a;

    public a(Locale locale, CharSequence charSequence) {
        q.i(locale, "locale");
        q.i(charSequence, "text");
        this.f25699a = new b(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int i10) {
        int d10;
        if (this.f25699a.i(this.f25699a.n(i10))) {
            d10 = this.f25699a.g(i10);
        } else {
            d10 = this.f25699a.d(i10);
        }
        if (d10 != -1) {
            return d10;
        }
        return i10;
    }

    public final int b(int i10) {
        int e10;
        if (this.f25699a.k(this.f25699a.o(i10))) {
            e10 = this.f25699a.f(i10);
        } else {
            e10 = this.f25699a.e(i10);
        }
        if (e10 != -1) {
            return e10;
        }
        return i10;
    }
}
