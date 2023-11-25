package s1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import e1.f;
import org.xmlpull.v1.XmlPullParserException;
import qc.q;
import s1.e;

/* compiled from: VectorResources.android.kt */
/* loaded from: classes.dex */
public final class i {
    public static final e.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException {
        q.i(resources, "res");
        q.i(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        f1.a aVar = new f1.a(xmlResourceParser, 0, 2, null);
        q.h(asAttributeSet, "attrs");
        f.a a10 = f1.c.a(aVar, resources, theme, asAttributeSet);
        int i11 = 0;
        while (!f1.c.d(xmlResourceParser)) {
            i11 = f1.c.g(aVar, resources, asAttributeSet, theme, a10, i11);
            xmlResourceParser.next();
        }
        return new e.a(a10.e(), i10);
    }
}
