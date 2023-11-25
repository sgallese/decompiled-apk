package qd;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LinkReferenceDefinitionParser.java */
/* loaded from: classes4.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f21773d;

    /* renamed from: e  reason: collision with root package name */
    private String f21774e;

    /* renamed from: f  reason: collision with root package name */
    private String f21775f;

    /* renamed from: g  reason: collision with root package name */
    private char f21776g;

    /* renamed from: h  reason: collision with root package name */
    private StringBuilder f21777h;

    /* renamed from: a  reason: collision with root package name */
    private b f21770a = b.START_DEFINITION;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f21771b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    private final List<td.p> f21772c = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f21778i = false;

    /* compiled from: LinkReferenceDefinitionParser.java */
    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21779a;

        static {
            int[] iArr = new int[b.values().length];
            f21779a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21779a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21779a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21779a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21779a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21779a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkReferenceDefinitionParser.java */
    /* loaded from: classes4.dex */
    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int a(CharSequence charSequence, int i10) {
        String charSequence2;
        int m10 = sd.d.m(charSequence, i10, charSequence.length());
        int a10 = sd.c.a(charSequence, m10);
        if (a10 == -1) {
            return -1;
        }
        if (charSequence.charAt(m10) == '<') {
            charSequence2 = charSequence.subSequence(m10 + 1, a10 - 1).toString();
        } else {
            charSequence2 = charSequence.subSequence(m10, a10).toString();
        }
        this.f21775f = charSequence2;
        int m11 = sd.d.m(charSequence, a10, charSequence.length());
        if (m11 >= charSequence.length()) {
            this.f21778i = true;
            this.f21771b.setLength(0);
        } else if (m11 == a10) {
            return -1;
        }
        this.f21770a = b.START_TITLE;
        return m11;
    }

    private void b() {
        String str;
        if (!this.f21778i) {
            return;
        }
        String e10 = sd.a.e(this.f21775f);
        StringBuilder sb2 = this.f21777h;
        if (sb2 != null) {
            str = sd.a.e(sb2.toString());
        } else {
            str = null;
        }
        this.f21772c.add(new td.p(this.f21774e, e10, str));
        this.f21773d = null;
        this.f21778i = false;
        this.f21774e = null;
        this.f21775f = null;
        this.f21777h = null;
    }

    private int e(CharSequence charSequence, int i10) {
        int i11;
        int c10 = sd.c.c(charSequence, i10);
        if (c10 == -1) {
            return -1;
        }
        this.f21773d.append(charSequence, i10, c10);
        if (c10 >= charSequence.length()) {
            this.f21773d.append('\n');
            return c10;
        } else if (charSequence.charAt(c10) != ']' || (i11 = c10 + 1) >= charSequence.length() || charSequence.charAt(i11) != ':' || this.f21773d.length() > 999) {
            return -1;
        } else {
            String b10 = sd.a.b(this.f21773d.toString());
            if (b10.isEmpty()) {
                return -1;
            }
            this.f21774e = b10;
            this.f21770a = b.DESTINATION;
            return sd.d.m(charSequence, i11 + 1, charSequence.length());
        }
    }

    private int g(CharSequence charSequence, int i10) {
        int m10 = sd.d.m(charSequence, i10, charSequence.length());
        if (m10 < charSequence.length() && charSequence.charAt(m10) == '[') {
            this.f21770a = b.LABEL;
            this.f21773d = new StringBuilder();
            int i11 = m10 + 1;
            if (i11 >= charSequence.length()) {
                this.f21773d.append('\n');
            }
            return i11;
        }
        return -1;
    }

    private int h(CharSequence charSequence, int i10) {
        int m10 = sd.d.m(charSequence, i10, charSequence.length());
        if (m10 >= charSequence.length()) {
            this.f21770a = b.START_DEFINITION;
            return m10;
        }
        this.f21776g = (char) 0;
        char charAt = charSequence.charAt(m10);
        if (charAt != '\"' && charAt != '\'') {
            if (charAt == '(') {
                this.f21776g = ')';
            }
        } else {
            this.f21776g = charAt;
        }
        if (this.f21776g != 0) {
            this.f21770a = b.TITLE;
            this.f21777h = new StringBuilder();
            m10++;
            if (m10 == charSequence.length()) {
                this.f21777h.append('\n');
            }
        } else {
            b();
            this.f21770a = b.START_DEFINITION;
        }
        return m10;
    }

    private int i(CharSequence charSequence, int i10) {
        int e10 = sd.c.e(charSequence, i10, this.f21776g);
        if (e10 == -1) {
            return -1;
        }
        this.f21777h.append(charSequence.subSequence(i10, e10));
        if (e10 >= charSequence.length()) {
            this.f21777h.append('\n');
            return e10;
        }
        int m10 = sd.d.m(charSequence, e10 + 1, charSequence.length());
        if (m10 != charSequence.length()) {
            return -1;
        }
        this.f21778i = true;
        b();
        this.f21771b.setLength(0);
        this.f21770a = b.START_DEFINITION;
        return m10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<td.p> c() {
        b();
        return this.f21772c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.f21771b;
    }

    public void f(CharSequence charSequence) {
        if (this.f21771b.length() != 0) {
            this.f21771b.append('\n');
        }
        this.f21771b.append(charSequence);
        int i10 = 0;
        while (i10 < charSequence.length()) {
            switch (a.f21779a[this.f21770a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    i10 = g(charSequence, i10);
                    break;
                case 3:
                    i10 = e(charSequence, i10);
                    break;
                case 4:
                    i10 = a(charSequence, i10);
                    break;
                case 5:
                    i10 = h(charSequence, i10);
                    break;
                case 6:
                    i10 = i(charSequence, i10);
                    break;
            }
            if (i10 == -1) {
                this.f21770a = b.PARAGRAPH;
                return;
            }
        }
    }
}
