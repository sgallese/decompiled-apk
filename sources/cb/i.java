package cb;

import android.text.Spanned;
import android.widget.TextView;
import cb.g;
import cb.j;
import cb.l;
import db.c;
import ud.d;

/* compiled from: MarkwonPlugin.java */
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: MarkwonPlugin.java */
    /* loaded from: classes4.dex */
    public interface a<P extends i> {
        void a(P p10);
    }

    /* compiled from: MarkwonPlugin.java */
    /* loaded from: classes4.dex */
    public interface b {
        <P extends i> void a(Class<P> cls, a<? super P> aVar);

        <P extends i> P b(Class<P> cls);
    }

    void afterRender(td.s sVar, l lVar);

    void afterSetText(TextView textView);

    void beforeRender(td.s sVar);

    void beforeSetText(TextView textView, Spanned spanned);

    void configure(b bVar);

    void configureConfiguration(g.b bVar);

    void configureParser(d.b bVar);

    void configureSpansFactory(j.a aVar);

    void configureTheme(c.a aVar);

    void configureVisitor(l.b bVar);

    String processMarkdown(String str);
}
