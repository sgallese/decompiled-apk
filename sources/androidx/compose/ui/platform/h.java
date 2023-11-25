package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2681d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2682e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static h f2683f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f2684c;

    /* compiled from: AccessibilityIterators.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a(Locale locale) {
            qc.q.i(locale, "locale");
            if (h.f2683f == null) {
                h.f2683f = new h(locale, null);
            }
            h hVar = h.f2683f;
            qc.q.g(hVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return hVar;
        }
    }

    public /* synthetic */ h(Locale locale, qc.h hVar) {
        this(locale);
    }

    private final boolean i(int i10) {
        if (i10 > 0 && j(i10 - 1) && (i10 == d().length() || !j(i10))) {
            return true;
        }
        return false;
    }

    private final boolean j(int i10) {
        if (i10 >= 0 && i10 < d().length()) {
            return Character.isLetterOrDigit(d().codePointAt(i10));
        }
        return false;
    }

    private final boolean k(int i10) {
        if (j(i10) && (i10 == 0 || !j(i10 - 1))) {
            return true;
        }
        return false;
    }

    private final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        qc.q.h(wordInstance, "getWordInstance(locale)");
        this.f2684c = wordInstance;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f2684c;
            if (breakIterator == null) {
                qc.q.z("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f2684c;
        if (breakIterator2 == null) {
            qc.q.z("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i10);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i10, following);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f2684c;
            if (breakIterator == null) {
                qc.q.z("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f2684c;
        if (breakIterator2 == null) {
            qc.q.z("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i10);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i10);
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        qc.q.i(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f2684c;
        if (breakIterator == null) {
            qc.q.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private h(Locale locale) {
        l(locale);
    }
}
