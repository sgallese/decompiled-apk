package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.b;
import androidx.navigation.f;
import androidx.navigation.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import java.io.IOException;
import k3.s;
import org.xmlpull.v1.XmlPullParserException;
import yc.v;

/* compiled from: NavInflater.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5336c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f5337d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final Context f5338a;

    /* renamed from: b  reason: collision with root package name */
    private final q f5339b;

    /* compiled from: NavInflater.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final o<?> a(TypedValue typedValue, o<?> oVar, o<?> oVar2, String str, String str2) throws XmlPullParserException {
            qc.q.i(typedValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            qc.q.i(oVar2, "expectedNavType");
            qc.q.i(str2, "foundType");
            if (oVar != null && oVar != oVar2) {
                throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
            } else if (oVar == null) {
                return oVar2;
            } else {
                return oVar;
            }
        }
    }

    public l(Context context, q qVar) {
        qc.q.i(context, "context");
        qc.q.i(qVar, "navigatorProvider");
        this.f5338a = context;
        this.f5339b = qVar;
    }

    private final i a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        q qVar = this.f5339b;
        String name = xmlResourceParser.getName();
        qc.q.h(name, "parser.name");
        i a10 = qVar.d(name).a();
        a10.y(this.f5338a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (qc.q.d("argument", name2)) {
                    f(resources, a10, attributeSet, i10);
                } else if (qc.q.d("deepLink", name2)) {
                    g(resources, a10, attributeSet);
                } else if (qc.q.d("action", name2)) {
                    c(resources, a10, attributeSet, xmlResourceParser, i10);
                } else if (qc.q.d("include", name2) && (a10 instanceof j)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, s.f19334i);
                    qc.q.h(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((j) a10).H(b(obtainAttributes.getResourceId(s.f19335j, 0)));
                    w wVar = w.f13270a;
                    obtainAttributes.recycle();
                } else if (a10 instanceof j) {
                    ((j) a10).H(a(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return a10;
    }

    private final void c(Resources resources, i iVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.f5338a;
        int[] iArr = l3.a.f19499a;
        qc.q.h(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(l3.a.f19500b, 0);
        k3.e eVar = new k3.e(obtainStyledAttributes.getResourceId(l3.a.f19501c, 0), null, null, 6, null);
        m.a aVar = new m.a();
        aVar.d(obtainStyledAttributes.getBoolean(l3.a.f19504f, false));
        aVar.j(obtainStyledAttributes.getBoolean(l3.a.f19510l, false));
        aVar.g(obtainStyledAttributes.getResourceId(l3.a.f19507i, -1), obtainStyledAttributes.getBoolean(l3.a.f19508j, false), obtainStyledAttributes.getBoolean(l3.a.f19509k, false));
        aVar.b(obtainStyledAttributes.getResourceId(l3.a.f19502d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(l3.a.f19503e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(l3.a.f19505g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(l3.a.f19506h, -1));
        eVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && qc.q.d("argument", xmlResourceParser.getName())) {
                e(resources, bundle, attributeSet, i10);
            }
        }
        if (!bundle.isEmpty()) {
            eVar.d(bundle);
        }
        iVar.A(resourceId, eVar);
        obtainStyledAttributes.recycle();
    }

    private final b d(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        o<Object> oVar;
        b.a aVar = new b.a();
        boolean z10 = false;
        int i11 = 0;
        aVar.c(typedArray.getBoolean(l3.a.f19515q, false));
        ThreadLocal<TypedValue> threadLocal = f5337d;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(l3.a.f19514p);
        Object obj = null;
        if (string != null) {
            oVar = o.f5367c.a(string, resources.getResourcePackageName(i10));
        } else {
            oVar = null;
        }
        int i12 = l3.a.f19513o;
        if (typedArray.getValue(i12, typedValue)) {
            o<Object> oVar2 = o.f5369e;
            if (oVar == oVar2) {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    i11 = i13;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + oVar.b() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i11);
            } else {
                int i14 = typedValue.resourceId;
                if (i14 != 0) {
                    if (oVar == null) {
                        oVar = oVar2;
                        obj = Integer.valueOf(i14);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + oVar.b() + ". You must use a \"" + oVar2.b() + "\" type to reference other resources.");
                    }
                } else if (oVar == o.f5377m) {
                    obj = typedArray.getString(i12);
                } else {
                    int i15 = typedValue.type;
                    if (i15 != 3) {
                        if (i15 != 4) {
                            if (i15 != 5) {
                                if (i15 != 18) {
                                    if (i15 >= 16 && i15 <= 31) {
                                        o<Object> oVar3 = o.f5373i;
                                        if (oVar == oVar3) {
                                            oVar = f5336c.a(typedValue, oVar, oVar3, string, "float");
                                            obj = Float.valueOf(typedValue.data);
                                        } else {
                                            oVar = f5336c.a(typedValue, oVar, o.f5368d, string, "integer");
                                            obj = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                    }
                                } else {
                                    oVar = f5336c.a(typedValue, oVar, o.f5375k, string, "boolean");
                                    if (typedValue.data != 0) {
                                        z10 = true;
                                    }
                                    obj = Boolean.valueOf(z10);
                                }
                            } else {
                                oVar = f5336c.a(typedValue, oVar, o.f5368d, string, "dimension");
                                obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            oVar = f5336c.a(typedValue, oVar, o.f5373i, string, "float");
                            obj = Float.valueOf(typedValue.getFloat());
                        }
                    } else {
                        String obj2 = typedValue.string.toString();
                        if (oVar == null) {
                            oVar = o.f5367c.b(obj2);
                        }
                        obj = oVar.j(obj2);
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (oVar != null) {
            aVar.d(oVar);
        }
        return aVar.a();
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, l3.a.f19511m);
        qc.q.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(l3.a.f19512n);
        if (string != null) {
            qc.q.h(string, "array.getString(R.stylea…uments must have a name\")");
            b d10 = d(obtainAttributes, resources, i10);
            if (d10.b()) {
                d10.d(string, bundle);
            }
            w wVar = w.f13270a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void f(Resources resources, i iVar, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, l3.a.f19511m);
        qc.q.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(l3.a.f19512n);
        if (string != null) {
            qc.q.h(string, "array.getString(R.stylea…uments must have a name\")");
            iVar.a(string, d(obtainAttributes, resources, i10));
            w wVar = w.f13270a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void g(Resources resources, i iVar, AttributeSet attributeSet) throws XmlPullParserException {
        boolean z10;
        String B;
        String B2;
        String B3;
        boolean z11;
        boolean z12;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, l3.a.f19516r);
        qc.q.h(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(l3.a.f19519u);
        String string2 = obtainAttributes.getString(l3.a.f19517s);
        String string3 = obtainAttributes.getString(l3.a.f19518t);
        boolean z13 = false;
        if (string != null && string.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (string2 != null && string2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (string3 != null && string3.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        f.a aVar = new f.a();
        if (string != null) {
            String packageName = this.f5338a.getPackageName();
            qc.q.h(packageName, "context.packageName");
            B3 = v.B(string, "${applicationId}", packageName, false, 4, null);
            aVar.d(B3);
        }
        if (string2 == null || string2.length() == 0) {
            z13 = true;
        }
        if (!z13) {
            String packageName2 = this.f5338a.getPackageName();
            qc.q.h(packageName2, "context.packageName");
            B2 = v.B(string2, "${applicationId}", packageName2, false, 4, null);
            aVar.b(B2);
        }
        if (string3 != null) {
            String packageName3 = this.f5338a.getPackageName();
            qc.q.h(packageName3, "context.packageName");
            B = v.B(string3, "${applicationId}", packageName3, false, 4, null);
            aVar.c(B);
        }
        iVar.e(aVar.a());
        w wVar = w.f13270a;
        obtainAttributes.recycle();
    }

    @SuppressLint({"ResourceType"})
    public final j b(int i10) {
        int next;
        Resources resources = this.f5338a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        qc.q.h(xml, "res.getXml(graphResId)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            qc.q.h(resources, "res");
            qc.q.h(asAttributeSet, "attrs");
            i a10 = a(resources, xml, asAttributeSet, i10);
            if (a10 instanceof j) {
                return (j) a10;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
