package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f3287a;

    /* renamed from: b  reason: collision with root package name */
    int f3288b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f3289c = -1;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<a> f3290d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<d> f3291e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3292a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f3293b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f3294c;

        /* renamed from: d  reason: collision with root package name */
        d f3295d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3294c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.f3419d5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.f3426e5) {
                    this.f3292a = obtainStyledAttributes.getResourceId(index, this.f3292a);
                } else if (index == j.f3433f5) {
                    this.f3294c = obtainStyledAttributes.getResourceId(index, this.f3294c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3294c);
                    context.getResources().getResourceName(this.f3294c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f3295d = dVar;
                        dVar.e(context, this.f3294c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f3293b.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f3296a;

        /* renamed from: b  reason: collision with root package name */
        float f3297b;

        /* renamed from: c  reason: collision with root package name */
        float f3298c;

        /* renamed from: d  reason: collision with root package name */
        float f3299d;

        /* renamed from: e  reason: collision with root package name */
        int f3300e;

        /* renamed from: f  reason: collision with root package name */
        d f3301f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3296a = Float.NaN;
            this.f3297b = Float.NaN;
            this.f3298c = Float.NaN;
            this.f3299d = Float.NaN;
            this.f3300e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.f3573z5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.A5) {
                    this.f3300e = obtainStyledAttributes.getResourceId(index, this.f3300e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3300e);
                    context.getResources().getResourceName(this.f3300e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f3301f = dVar;
                        dVar.e(context, this.f3300e);
                    }
                } else if (index == j.B5) {
                    this.f3299d = obtainStyledAttributes.getDimension(index, this.f3299d);
                } else if (index == j.C5) {
                    this.f3297b = obtainStyledAttributes.getDimension(index, this.f3297b);
                } else if (index == j.D5) {
                    this.f3298c = obtainStyledAttributes.getDimension(index, this.f3298c);
                } else if (index == j.E5) {
                    this.f3296a = obtainStyledAttributes.getDimension(index, this.f3296a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f3287a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        char c10;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        if (c10 != 0 && c10 != 1) {
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                    } else {
                                        b(context, xml);
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (aVar != null) {
                                        aVar.a(bVar);
                                    }
                                }
                            } else {
                                aVar = new a(context, xml);
                                this.f3290d.put(aVar.f3292a, aVar);
                            }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        int i10;
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            if ("id".equals(xmlPullParser.getAttributeName(i11))) {
                String attributeValue = xmlPullParser.getAttributeValue(i11);
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f3291e.put(i10, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
