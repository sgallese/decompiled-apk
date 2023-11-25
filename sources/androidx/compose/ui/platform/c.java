package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2616d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f2617e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static c f2618f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f2619c;

    /* compiled from: AccessibilityIterators.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final c a(Locale locale) {
            qc.q.i(locale, "locale");
            if (c.f2618f == null) {
                c.f2618f = new c(locale, null);
            }
            c cVar = c.f2618f;
            qc.q.g(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return cVar;
        }
    }

    public /* synthetic */ c(Locale locale, qc.h hVar) {
        this(locale);
    }

    private final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        qc.q.h(characterInstance, "getCharacterInstance(locale)");
        this.f2619c = characterInstance;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f2619c;
            if (breakIterator == null) {
                qc.q.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f2619c;
                if (breakIterator2 == null) {
                    qc.q.z("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.following(i10);
            } else {
                BreakIterator breakIterator3 = this.f2619c;
                if (breakIterator3 == null) {
                    qc.q.z("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i10);
                if (following == -1) {
                    return null;
                }
                return c(i10, following);
            }
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f2619c;
            if (breakIterator == null) {
                qc.q.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f2619c;
                if (breakIterator2 == null) {
                    qc.q.z("impl");
                    breakIterator2 = null;
                }
                i10 = breakIterator2.preceding(i10);
            } else {
                BreakIterator breakIterator3 = this.f2619c;
                if (breakIterator3 == null) {
                    qc.q.z("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i10);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i10);
            }
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.b
    public void e(String str) {
        qc.q.i(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f2619c;
        if (breakIterator == null) {
            qc.q.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private c(Locale locale) {
        i(locale);
    }
}
