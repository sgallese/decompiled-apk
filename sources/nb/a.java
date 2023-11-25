package nb;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import cb.i;
import cb.l;
import cb.r;
import cb.t;
import cb.u;
import db.a;
import td.o;

/* compiled from: LinkifyPlugin.java */
/* loaded from: classes4.dex */
public class a extends cb.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f20318a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20319b;

    /* compiled from: LinkifyPlugin.java */
    /* renamed from: nb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0459a implements i.a<db.a> {
        C0459a() {
        }

        @Override // cb.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(db.a aVar) {
            a.p cVar;
            if (a.this.f20319b) {
                cVar = new b(a.this.f20318a);
            } else {
                cVar = new c(a.this.f20318a);
            }
            aVar.d(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyPlugin.java */
    /* loaded from: classes4.dex */
    public static class b extends c {
        b(int i10) {
            super(i10);
        }

        @Override // nb.a.c
        protected boolean b(Spannable spannable, int i10) {
            return u2.c.b(spannable, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkifyPlugin.java */
    /* loaded from: classes4.dex */
    public static class c implements a.p {

        /* renamed from: a  reason: collision with root package name */
        private final int f20321a;

        c(int i10) {
            this.f20321a = i10;
        }

        @Override // db.a.p
        public void a(l lVar, String str, int i10) {
            t a10 = lVar.o().e().a(o.class);
            if (a10 == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (b(spannableStringBuilder, this.f20321a)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                    r z10 = lVar.z();
                    u builder = lVar.builder();
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        db.b.f13193e.e(z10, uRLSpan.getURL());
                        u.j(builder, a10.a(lVar.o(), z10), spannableStringBuilder.getSpanStart(uRLSpan) + i10, spannableStringBuilder.getSpanEnd(uRLSpan) + i10);
                    }
                }
            }
        }

        protected boolean b(Spannable spannable, int i10) {
            return Linkify.addLinks(spannable, i10);
        }
    }

    a(int i10, boolean z10) {
        this.f20318a = i10;
        this.f20319b = z10;
    }

    public static a c(int i10) {
        return new a(i10, false);
    }

    @Override // cb.a, cb.i
    public void configure(i.b bVar) {
        bVar.a(db.a.class, new C0459a());
    }
}
