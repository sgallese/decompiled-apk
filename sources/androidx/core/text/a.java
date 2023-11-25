package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final u f4004d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f4005e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f4006f;

    /* renamed from: g  reason: collision with root package name */
    static final a f4007g;

    /* renamed from: h  reason: collision with root package name */
    static final a f4008h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4009a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4010b;

    /* renamed from: c  reason: collision with root package name */
    private final u f4011c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0075a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4012a;

        /* renamed from: b  reason: collision with root package name */
        private int f4013b;

        /* renamed from: c  reason: collision with root package name */
        private u f4014c;

        public C0075a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            if (z10) {
                return a.f4008h;
            }
            return a.f4007g;
        }

        private void c(boolean z10) {
            this.f4012a = z10;
            this.f4014c = a.f4004d;
            this.f4013b = 2;
        }

        public a a() {
            if (this.f4013b == 2 && this.f4014c == a.f4004d) {
                return b(this.f4012a);
            }
            return new a(this.f4012a, this.f4013b, this.f4014c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f4015f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f4016a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4017b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4018c;

        /* renamed from: d  reason: collision with root package name */
        private int f4019d;

        /* renamed from: e  reason: collision with root package name */
        private char f4020e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f4015f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f4016a = charSequence;
            this.f4017b = z10;
            this.f4018c = charSequence.length();
        }

        private static byte c(char c10) {
            if (c10 < 1792) {
                return f4015f[c10];
            }
            return Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f4019d;
            do {
                int i11 = this.f4019d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4016a;
                int i12 = i11 - 1;
                this.f4019d = i12;
                charAt = charSequence.charAt(i12);
                this.f4020e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f4019d = i10;
            this.f4020e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f4019d;
                if (i10 < this.f4018c) {
                    CharSequence charSequence = this.f4016a;
                    this.f4019d = i10 + 1;
                    charAt = charSequence.charAt(i10);
                    this.f4020e = charAt;
                } else {
                    return (byte) 12;
                }
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f4019d;
            while (true) {
                int i11 = this.f4019d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4016a;
                int i12 = i11 - 1;
                this.f4019d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f4020e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f4019d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f4016a;
                            int i14 = i13 - 1;
                            this.f4019d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f4020e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f4019d = i10;
            this.f4020e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f4019d;
            while (true) {
                int i11 = this.f4019d;
                if (i11 < this.f4018c) {
                    CharSequence charSequence = this.f4016a;
                    this.f4019d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f4020e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f4019d;
                            if (i12 < this.f4018c) {
                                CharSequence charSequence2 = this.f4016a;
                                this.f4019d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f4020e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f4019d = i10;
                    this.f4020e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f4016a.charAt(this.f4019d - 1);
            this.f4020e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f4016a, this.f4019d);
                this.f4019d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4019d--;
            byte c10 = c(this.f4020e);
            if (this.f4017b) {
                char c11 = this.f4020e;
                if (c11 == '>') {
                    return h();
                }
                if (c11 == ';') {
                    return f();
                }
                return c10;
            }
            return c10;
        }

        byte b() {
            char charAt = this.f4016a.charAt(this.f4019d);
            this.f4020e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f4016a, this.f4019d);
                this.f4019d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f4019d++;
            byte c10 = c(this.f4020e);
            if (this.f4017b) {
                char c11 = this.f4020e;
                if (c11 == '<') {
                    return i();
                }
                if (c11 == '&') {
                    return g();
                }
                return c10;
            }
            return c10;
        }

        int d() {
            this.f4019d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f4019d < this.f4018c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 != 1 && b10 != 2) {
                        if (b10 != 9) {
                            switch (b10) {
                                case 14:
                                case 15:
                                    i12++;
                                    i11 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i12++;
                                    i11 = 1;
                                    break;
                                case 18:
                                    i12--;
                                    i11 = 0;
                                    break;
                            }
                        }
                    } else if (i12 == 0) {
                        return 1;
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f4019d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f4019d = this.f4018c;
            int i10 = 0;
            int i11 = 0;
            while (this.f4019d > 0) {
                byte a10 = a();
                if (a10 != 0) {
                    if (a10 != 1 && a10 != 2) {
                        if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        i11 = i10;
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return 1;
                    } else {
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    }
                } else if (i10 == 0) {
                    return -1;
                } else {
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }
    }

    static {
        u uVar = v.f4037c;
        f4004d = uVar;
        f4005e = Character.toString((char) 8206);
        f4006f = Character.toString((char) 8207);
        f4007g = new a(false, 2, uVar);
        f4008h = new a(true, 2, uVar);
    }

    a(boolean z10, int i10, u uVar) {
        this.f4009a = z10;
        this.f4010b = i10;
        this.f4011c = uVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0075a().a();
    }

    static boolean e(Locale locale) {
        if (w.a(locale) == 1) {
            return true;
        }
        return false;
    }

    private String f(CharSequence charSequence, u uVar) {
        boolean a10 = uVar.a(charSequence, 0, charSequence.length());
        if (!this.f4009a && (a10 || b(charSequence) == 1)) {
            return f4005e;
        }
        if (this.f4009a) {
            if (!a10 || b(charSequence) == -1) {
                return f4006f;
            }
            return "";
        }
        return "";
    }

    private String g(CharSequence charSequence, u uVar) {
        boolean a10 = uVar.a(charSequence, 0, charSequence.length());
        if (!this.f4009a && (a10 || a(charSequence) == 1)) {
            return f4005e;
        }
        if (this.f4009a) {
            if (!a10 || a(charSequence) == -1) {
                return f4006f;
            }
            return "";
        }
        return "";
    }

    public boolean d() {
        if ((this.f4010b & 2) != 0) {
            return true;
        }
        return false;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f4011c, true);
    }

    public CharSequence i(CharSequence charSequence, u uVar, boolean z10) {
        u uVar2;
        char c10;
        u uVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a10 = uVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            if (a10) {
                uVar3 = v.f4036b;
            } else {
                uVar3 = v.f4035a;
            }
            spannableStringBuilder.append((CharSequence) g(charSequence, uVar3));
        }
        if (a10 != this.f4009a) {
            if (a10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            if (a10) {
                uVar2 = v.f4036b;
            } else {
                uVar2 = v.f4035a;
            }
            spannableStringBuilder.append((CharSequence) f(charSequence, uVar2));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f4011c, true);
    }

    public String k(String str, u uVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, uVar, z10).toString();
    }
}
