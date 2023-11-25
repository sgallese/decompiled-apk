package f1;

import a1.a1;
import a1.e1;
import a1.f1;
import a1.g4;
import a1.p1;
import a1.r1;
import a1.r4;
import a1.s4;
import a1.t4;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.d;
import androidx.core.content.res.l;
import e1.f;
import e1.i;
import e1.t;
import j2.h;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import qc.q;

/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f15426a = 0;

    public static final f.a a(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long e10;
        int z10;
        q.i(aVar, "<this>");
        q.i(resources, "res");
        q.i(attributeSet, "attrs");
        b bVar = b.f15400a;
        TypedArray k10 = aVar.k(resources, theme, attributeSet, bVar.F());
        boolean d10 = aVar.d(k10, "autoMirrored", bVar.a(), false);
        float g10 = aVar.g(k10, "viewportWidth", bVar.H(), 0.0f);
        float g11 = aVar.g(k10, "viewportHeight", bVar.G(), 0.0f);
        if (g10 > 0.0f) {
            if (g11 > 0.0f) {
                float a10 = aVar.a(k10, bVar.I(), 0.0f);
                float a11 = aVar.a(k10, bVar.n(), 0.0f);
                if (k10.hasValue(bVar.D())) {
                    TypedValue typedValue = new TypedValue();
                    k10.getValue(bVar.D(), typedValue);
                    if (typedValue.type == 2) {
                        e10 = p1.f146b.e();
                    } else {
                        ColorStateList e11 = aVar.e(k10, theme, "tint", bVar.D());
                        if (e11 != null) {
                            e10 = r1.b(e11.getDefaultColor());
                        } else {
                            e10 = p1.f146b.e();
                        }
                    }
                } else {
                    e10 = p1.f146b.e();
                }
                long j10 = e10;
                int c10 = aVar.c(k10, bVar.E(), -1);
                if (c10 != -1) {
                    if (c10 != 3) {
                        if (c10 != 5) {
                            if (c10 != 9) {
                                switch (c10) {
                                    case 14:
                                        z10 = a1.f62b.q();
                                        break;
                                    case 15:
                                        z10 = a1.f62b.v();
                                        break;
                                    case 16:
                                        z10 = a1.f62b.t();
                                        break;
                                    default:
                                        z10 = a1.f62b.z();
                                        break;
                                }
                            } else {
                                z10 = a1.f62b.y();
                            }
                        } else {
                            z10 = a1.f62b.z();
                        }
                    } else {
                        z10 = a1.f62b.B();
                    }
                } else {
                    z10 = a1.f62b.z();
                }
                int i10 = z10;
                float j11 = h.j(a10 / resources.getDisplayMetrics().density);
                float j12 = h.j(a11 / resources.getDisplayMetrics().density);
                k10.recycle();
                return new f.a(null, j11, j12, g10, g11, j10, i10, d10, 1, null);
            }
            throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(k10.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    }

    private static final int b(int i10, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return s4.f186b.c();
                }
                return i11;
            }
            return s4.f186b.b();
        }
        return s4.f186b.a();
    }

    private static final int c(int i10, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return t4.f193b.a();
                }
                return i11;
            }
            return t4.f193b.c();
        }
        return t4.f193b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        q.i(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    private static final e1 e(d dVar) {
        qc.h hVar = null;
        if (!dVar.l()) {
            return null;
        }
        Shader f10 = dVar.f();
        if (f10 != null) {
            return f1.a(f10);
        }
        return new r4(r1.b(dVar.e()), hVar);
    }

    public static final void f(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, f.a aVar2) {
        q.i(aVar, "<this>");
        q.i(resources, "res");
        q.i(attributeSet, "attrs");
        q.i(aVar2, "builder");
        b bVar = b.f15400a;
        TypedArray k10 = aVar.k(resources, theme, attributeSet, bVar.b());
        String i10 = aVar.i(k10, bVar.c());
        if (i10 == null) {
            i10 = "";
        }
        List<i> a10 = t.a(aVar.i(k10, bVar.d()));
        k10.recycle();
        f.a.b(aVar2, i10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, a10, 254, null);
    }

    public static final int g(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, f.a aVar2, int i10) {
        q.i(aVar, "<this>");
        q.i(resources, "res");
        q.i(attributeSet, "attrs");
        q.i(aVar2, "builder");
        int eventType = aVar.j().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && q.d("group", aVar.j().getName())) {
                int i11 = i10 + 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    aVar2.f();
                }
                return 0;
            }
            return i10;
        }
        String name = aVar.j().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode == 98629247 && name.equals("group")) {
                        h(aVar, resources, theme, attributeSet, aVar2);
                        return i10;
                    }
                    return i10;
                } else if (name.equals("path")) {
                    i(aVar, resources, theme, attributeSet, aVar2);
                    return i10;
                } else {
                    return i10;
                }
            } else if (name.equals("clip-path")) {
                f(aVar, resources, theme, attributeSet, aVar2);
                return i10 + 1;
            } else {
                return i10;
            }
        }
        return i10;
    }

    public static final void h(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, f.a aVar2) {
        q.i(aVar, "<this>");
        q.i(resources, "res");
        q.i(attributeSet, "attrs");
        q.i(aVar2, "builder");
        b bVar = b.f15400a;
        TypedArray k10 = aVar.k(resources, theme, attributeSet, bVar.e());
        float g10 = aVar.g(k10, "rotation", bVar.i(), 0.0f);
        float b10 = aVar.b(k10, bVar.g(), 0.0f);
        float b11 = aVar.b(k10, bVar.h(), 0.0f);
        float g11 = aVar.g(k10, "scaleX", bVar.j(), 1.0f);
        float g12 = aVar.g(k10, "scaleY", bVar.k(), 1.0f);
        float g13 = aVar.g(k10, "translateX", bVar.l(), 0.0f);
        float g14 = aVar.g(k10, "translateY", bVar.m(), 0.0f);
        String i10 = aVar.i(k10, bVar.f());
        if (i10 == null) {
            i10 = "";
        }
        k10.recycle();
        aVar2.a(i10, g10, b10, b11, g11, g12, g13, g14, t.e());
    }

    public static final void i(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, f.a aVar2) throws IllegalArgumentException {
        int a10;
        q.i(aVar, "<this>");
        q.i(resources, "res");
        q.i(attributeSet, "attrs");
        q.i(aVar2, "builder");
        b bVar = b.f15400a;
        TypedArray k10 = aVar.k(resources, theme, attributeSet, bVar.o());
        if (l.r(aVar.j(), "pathData")) {
            String i10 = aVar.i(k10, bVar.r());
            if (i10 == null) {
                i10 = "";
            }
            String str = i10;
            List<i> a11 = t.a(aVar.i(k10, bVar.s()));
            d f10 = aVar.f(k10, theme, "fillColor", bVar.q(), 0);
            float g10 = aVar.g(k10, "fillAlpha", bVar.p(), 1.0f);
            int b10 = b(aVar.h(k10, "strokeLineCap", bVar.v(), -1), s4.f186b.a());
            int c10 = c(aVar.h(k10, "strokeLineJoin", bVar.w(), -1), t4.f193b.a());
            float g11 = aVar.g(k10, "strokeMiterLimit", bVar.x(), 1.0f);
            d f11 = aVar.f(k10, theme, "strokeColor", bVar.u(), 0);
            float g12 = aVar.g(k10, "strokeAlpha", bVar.t(), 1.0f);
            float g13 = aVar.g(k10, "strokeWidth", bVar.y(), 1.0f);
            float g14 = aVar.g(k10, "trimPathEnd", bVar.z(), 1.0f);
            float g15 = aVar.g(k10, "trimPathOffset", bVar.B(), 0.0f);
            float g16 = aVar.g(k10, "trimPathStart", bVar.C(), 0.0f);
            int h10 = aVar.h(k10, "fillType", bVar.A(), f15426a);
            k10.recycle();
            e1 e10 = e(f10);
            e1 e11 = e(f11);
            g4.a aVar3 = g4.f102b;
            if (h10 == 0) {
                a10 = aVar3.b();
            } else {
                a10 = aVar3.a();
            }
            aVar2.c(a11, a10, str, e10, g10, e11, g12, g13, b10, c10, g11, g16, g14, g15);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        q.i(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
