package cb;

import android.text.Spanned;
import android.widget.TextView;
import cb.g;
import cb.i;
import cb.j;
import cb.l;
import db.c;
import ud.d;

/* compiled from: AbstractMarkwonPlugin.java */
/* loaded from: classes4.dex */
public abstract class a implements i {
    @Override // cb.i
    public void afterSetText(TextView textView) {
    }

    @Override // cb.i
    public void beforeRender(td.s sVar) {
    }

    @Override // cb.i
    public void configure(i.b bVar) {
    }

    @Override // cb.i
    public void configureConfiguration(g.b bVar) {
    }

    @Override // cb.i
    public void configureParser(d.b bVar) {
    }

    @Override // cb.i
    public void configureSpansFactory(j.a aVar) {
    }

    @Override // cb.i
    public void configureTheme(c.a aVar) {
    }

    @Override // cb.i
    public void configureVisitor(l.b bVar) {
    }

    @Override // cb.i
    public String processMarkdown(String str) {
        return str;
    }

    @Override // cb.i
    public void afterRender(td.s sVar, l lVar) {
    }

    @Override // cb.i
    public void beforeSetText(TextView textView, Spanned spanned) {
    }
}
