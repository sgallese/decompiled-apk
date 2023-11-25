package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f3831a;

        public c(d[] dVarArr) {
            this.f3831a = dVarArr;
        }

        public d[] a() {
            return this.f3831a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f3832a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3833b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3834c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3835d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3836e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3837f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3832a = str;
            this.f3833b = i10;
            this.f3834c = z10;
            this.f3835d = str2;
            this.f3836e = i11;
            this.f3837f = i12;
        }

        public String a() {
            return this.f3832a;
        }

        public int b() {
            return this.f3837f;
        }

        public int c() {
            return this.f3836e;
        }

        public String d() {
            return this.f3835d;
        }

        public int e() {
            return this.f3833b;
        }

        public boolean f() {
            return this.f3834c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0069e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f3838a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3839b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3840c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3841d;

        public C0069e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f3838a = eVar;
            this.f3840c = i10;
            this.f3839b = i11;
            this.f3841d = str;
        }

        public int a() {
            return this.f3840c;
        }

        public androidx.core.provider.e b() {
            return this.f3838a;
        }

        public String c() {
            return this.f3841d;
        }

        public int d() {
            return this.f3839b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r2.g.f22120h);
        String string = obtainAttributes.getString(r2.g.f22121i);
        String string2 = obtainAttributes.getString(r2.g.f22125m);
        String string3 = obtainAttributes.getString(r2.g.f22126n);
        int resourceId = obtainAttributes.getResourceId(r2.g.f22122j, 0);
        int integer = obtainAttributes.getInteger(r2.g.f22123k, 1);
        int integer2 = obtainAttributes.getInteger(r2.g.f22124l, 500);
        String string4 = obtainAttributes.getString(r2.g.f22127o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0069e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z10;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r2.g.f22128p);
        int i10 = r2.g.f22137y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = r2.g.f22130r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = r2.g.f22135w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = r2.g.f22131s;
        }
        if (1 == obtainAttributes.getInt(i12, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = r2.g.f22138z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = r2.g.f22132t;
        }
        int i14 = r2.g.f22136x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = r2.g.f22133u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = r2.g.f22134v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = r2.g.f22129q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
