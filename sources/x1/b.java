package x1;

import java.text.BreakIterator;
import java.util.Locale;
import qc.h;
import qc.q;
import w1.g;

/* compiled from: WordIterator.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f25700e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f25701a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25702b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25703c;

    /* renamed from: d  reason: collision with root package name */
    private final BreakIterator f25704d;

    /* compiled from: WordIterator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public b(CharSequence charSequence, int i10, int i11, Locale locale) {
        boolean z10;
        q.i(charSequence, "charSequence");
        this.f25701a = charSequence;
        if (i10 >= 0 && i10 <= charSequence.length()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0 && i11 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                q.h(wordInstance, "getWordInstance(locale)");
                this.f25704d = wordInstance;
                this.f25702b = Math.max(0, i10 - 50);
                this.f25703c = Math.min(charSequence.length(), i11 + 50);
                wordInstance.setText(new g(charSequence, i10, i11));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void a(int i10) {
        int i11 = this.f25702b;
        boolean z10 = false;
        if (i10 <= this.f25703c && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f25702b + " , " + this.f25703c + ']').toString());
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            if (!this.f25704d.isBoundary(i10) || (h(i10) && z10)) {
                return this.f25704d.preceding(i10);
            }
            return i10;
        } else if (h(i10)) {
            return this.f25704d.preceding(i10);
        } else {
            return -1;
        }
    }

    private final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            if (!this.f25704d.isBoundary(i10) || (j(i10) && z10)) {
                return this.f25704d.following(i10);
            }
            return i10;
        } else if (j(i10)) {
            return this.f25704d.following(i10);
        } else {
            return -1;
        }
    }

    private final boolean h(int i10) {
        boolean z10;
        int i11 = this.f25702b + 1;
        if (i10 <= this.f25703c && i11 <= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Character.isLetterOrDigit(Character.codePointBefore(this.f25701a, i10))) {
            return true;
        }
        return false;
    }

    private final boolean j(int i10) {
        boolean z10;
        int i11 = this.f25702b;
        if (i10 < this.f25703c && i11 <= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && Character.isLetterOrDigit(Character.codePointAt(this.f25701a, i10))) {
            return true;
        }
        return false;
    }

    private final boolean l(int i10) {
        if (!k(i10) && i(i10)) {
            return true;
        }
        return false;
    }

    private final boolean m(int i10) {
        if (k(i10) && !i(i10)) {
            return true;
        }
        return false;
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean i(int i10) {
        boolean z10 = true;
        int i11 = this.f25702b + 1;
        if (i10 > this.f25703c || i11 > i10) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return f25700e.a(Character.codePointBefore(this.f25701a, i10));
    }

    public final boolean k(int i10) {
        boolean z10;
        int i11 = this.f25702b;
        if (i10 < this.f25703c && i11 <= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return f25700e.a(Character.codePointAt(this.f25701a, i10));
    }

    public final int n(int i10) {
        a(i10);
        return this.f25704d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f25704d.preceding(i10);
    }
}
