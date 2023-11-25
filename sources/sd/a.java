package sd;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Escaping.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f23065a = Pattern.compile("[\\\\&]");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f23066b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f23067c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f23068d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f23069e = Pattern.compile("[ \t\r\n]+");

    /* renamed from: f  reason: collision with root package name */
    private static final c f23070f = new C0540a();

    /* renamed from: g  reason: collision with root package name */
    private static final c f23071g = new b();

    /* compiled from: Escaping.java */
    /* renamed from: sd.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0540a implements c {
        C0540a() {
        }

        @Override // sd.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(sd.b.a(str));
            }
        }
    }

    /* compiled from: Escaping.java */
    /* loaded from: classes4.dex */
    static class b implements c {
        b() {
        }

        @Override // sd.a.c
        public void a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                }
                sb2.append("%25");
                sb2.append((CharSequence) str, 1, str.length());
                return;
            }
            for (byte b10 : str.getBytes(Charset.forName("UTF-8"))) {
                sb2.append('%');
                sb2.append(a.f23068d[(b10 >> 4) & 15]);
                sb2.append(a.f23068d[b10 & 15]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Escaping.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, StringBuilder sb2);
    }

    public static String b(String str) {
        return f23069e.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String c(String str) {
        return b(str.substring(1, str.length() - 1));
    }

    private static String d(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, matcher.start());
            cVar.a(matcher.group(), sb2);
            i10 = matcher.end();
        } while (matcher.find());
        if (i10 != str.length()) {
            sb2.append((CharSequence) str, i10, str.length());
        }
        return sb2.toString();
    }

    public static String e(String str) {
        if (f23065a.matcher(str).find()) {
            return d(f23066b, str, f23070f);
        }
        return str;
    }
}
