package qd;

import java.util.regex.Pattern;
import td.u;

/* compiled from: HtmlBlockParser.java */
/* loaded from: classes4.dex */
public class k extends vd.a {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern[][] f21738e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: a  reason: collision with root package name */
    private final td.k f21739a;

    /* renamed from: b  reason: collision with root package name */
    private final Pattern f21740b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21741c;

    /* renamed from: d  reason: collision with root package name */
    private qd.a f21742d;

    /* compiled from: HtmlBlockParser.java */
    /* loaded from: classes4.dex */
    public static class b extends vd.b {
        @Override // vd.e
        public vd.f a(vd.h hVar, vd.g gVar) {
            int d10 = hVar.d();
            CharSequence c10 = hVar.c();
            if (hVar.b() < 4 && c10.charAt(d10) == '<') {
                for (int i10 = 1; i10 <= 7; i10++) {
                    if (i10 != 7 || !(gVar.a().e() instanceof u)) {
                        Pattern pattern = k.f21738e[i10][0];
                        Pattern pattern2 = k.f21738e[i10][1];
                        if (pattern.matcher(c10.subSequence(d10, c10.length())).find()) {
                            return vd.f.d(new k(pattern2)).b(hVar.getIndex());
                        }
                    }
                }
            }
            return vd.f.c();
        }
    }

    @Override // vd.a, vd.d
    public void b() {
        this.f21739a.n(this.f21742d.b());
        this.f21742d = null;
    }

    @Override // vd.d
    public td.a e() {
        return this.f21739a;
    }

    @Override // vd.d
    public vd.c g(vd.h hVar) {
        if (this.f21741c) {
            return vd.c.d();
        }
        if (hVar.a() && this.f21740b == null) {
            return vd.c.d();
        }
        return vd.c.b(hVar.getIndex());
    }

    @Override // vd.a, vd.d
    public void h(CharSequence charSequence) {
        this.f21742d.a(charSequence);
        Pattern pattern = this.f21740b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f21741c = true;
        }
    }

    private k(Pattern pattern) {
        this.f21739a = new td.k();
        this.f21741c = false;
        this.f21742d = new qd.a();
        this.f21740b = pattern;
    }
}
